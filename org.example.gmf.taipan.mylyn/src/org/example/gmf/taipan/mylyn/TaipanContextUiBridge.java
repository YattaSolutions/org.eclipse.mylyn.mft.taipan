package org.example.gmf.taipan.mylyn;

import org.eclipse.gmf.examples.taipan.gmf.editor.part.TaiPanDiagramEditor;
import org.eclipse.mylyn.mft.emf.ui.DiagramUiBridge;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The purpose of the UI bridge is to define which UI views and editors should
 * be supported by MFT.<br>
 * The implementation will be responsible for the Taipan content type and should
 * handle all Taipan implementations of IWorkbenchPart, which is just the
 * TaiPanDiagramEditor. <br>
 * More fine-grained control is available to decide which combination of model
 * and view instances are related to each other, which is simple in the Taipan
 * example, since each model object has exactly one view representation.
 * 
 * @author <a href="mailto:bork@yatta.de">Manuel Bork</a>
 */
public class TaipanContextUiBridge extends DiagramUiBridge {

	private static TaipanContextUiBridge instance;

	public TaipanContextUiBridge() {
		instance = this;
	}

	public static TaipanContextUiBridge getInstance() {
		if (instance == null) {
			new TaipanContextUiBridge();
		}
		return instance;
	}

	@Override
	public boolean acceptsPart(IWorkbenchPart part) {
		// is this WorkbenchPart supported?
		return part instanceof TaiPanDiagramEditor;
	}

	@Override
	public boolean acceptsViewObject(Object modelObject, Object viewObject) {
		return true;
	}

	@Override
	public String getContentType() {
		return Activator.PLUGIN_ID;
	}
}
