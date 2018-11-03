package com.careri.softdept;

import org.eclipse.jface.action.IMenuManager;
import  org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import com.careri.softdept.Action1;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction action1;
    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	action1 = new Action1(window);
    	action1.setText("First Menu Item");
    	action1.setId("com.careri.softdept.iride.action");
    	register(action1);
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    	MenuManager newMenu = new MenuManager("First menu", "com.careri.softdept.iride.menu");
    	menuBar.add(newMenu);
    	newMenu.add(action1);
    	
    }
    
}
