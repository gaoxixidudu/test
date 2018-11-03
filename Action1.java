package com.careri.softdept;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import com.careri.softdept.FirstDialog;


public class Action1 extends Action implements IWorkbenchAction {

	 private IWorkbenchWindow workbenchWindow;
	 public Action1(IWorkbenchWindow window)
	 {
		 if(window == null)
			 throw new IllegalArgumentException();
		 this.workbenchWindow = window;
	 }
	 
	 public void run(){
		 if(workbenchWindow != null){
			 FirstDialog f = new FirstDialog(workbenchWindow.getShell());
			 f.open();
		 }
	 }
	 public void dispose()
	 {
		 workbenchWindow = null;
	 }

}
