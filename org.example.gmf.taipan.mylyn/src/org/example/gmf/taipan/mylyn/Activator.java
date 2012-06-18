package org.example.gmf.taipan.mylyn;

import org.eclipse.mylyn.context.core.AbstractContextStructureBridge;
import org.eclipse.mylyn.context.core.ContextCore;
import org.eclipse.mylyn.context.ui.IContextUiStartup;
import org.eclipse.mylyn.mft.emf.ui.DiagramUiEditingMonitor;
import org.eclipse.mylyn.monitor.ui.MonitorUi;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.example.gmf.taipan.mylyn"; //$NON-NLS-1$

	public static class EcoreDiagramBridgeStartup implements IContextUiStartup {
		public void lazyStartup() {
			Activator.getDefault().lazyStart();
		}
	}

	// The shared instance
	private static Activator plugin;

	private DiagramUiEditingMonitor diagramMonitor;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		lazyStop();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void lazyStart() {
		AbstractContextStructureBridge bridge = ContextCore
				.getStructureBridge(PLUGIN_ID);
		if (bridge instanceof TaipanContextStructureBridge) {
			diagramMonitor = new DiagramUiEditingMonitor(bridge,
					TaipanContextUiBridge.getInstance());
			MonitorUi.getSelectionMonitors().add(diagramMonitor);
		}
	}

	private void lazyStop() {
		if (diagramMonitor != null) {
			MonitorUi.getSelectionMonitors().remove(diagramMonitor);
		}
	}
}
