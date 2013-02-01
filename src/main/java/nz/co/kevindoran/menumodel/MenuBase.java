/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.kevindoran.menumodel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.separator.Separator;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.MenuModel;

/**
 *
 * @author kevin
 */
public class MenuBase implements MenuModel, Serializable {

    private static final long serialVersionUID = 7159879959588874982L;
    protected List<UIComponent> contents = new ArrayList<>();
    protected static UIViewRoot uiViewRoot = new UIViewRoot();

    @Override
    public List<UIComponent> getContents() {
            return contents;
    }

    @Override
    public void addSubmenu(Submenu submenu) {
            contents.add(submenu);
    }

    @Override
    public void addMenuItem(MenuItem menuItem) {
            contents.add(menuItem);
    }

    @Override
    public void addSeparator(Separator separator) {
        contents.add(separator);
    }

    protected void resetContents() {
        contents = new ArrayList<UIComponent>();
    }
}
