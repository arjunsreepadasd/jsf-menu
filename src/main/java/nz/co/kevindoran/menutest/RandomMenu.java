/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.kevindoran.menutest;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import nz.co.kevindoran.category.Category;
import nz.co.kevindoran.jsfmenutable.MenuTable;
import nz.co.kevindoran.subscriber.Subscriber;

@ManagedBean
@ViewScoped
public class RandomMenu {
    private MenuTable<Category> menuTable;
    private static final int columnCount = 4;
    private Category currentCategory = new Category();
    
    public RandomMenu()  {
        menuTable = new MenuTable<>(columnCount);
        menuTable.setContents(currentCategory.getChildCategories());
        MenuClickListener menuListener = new MenuClickListener();
        menuTable.addSubscriber(menuListener);
    }
    
    private class MenuClickListener implements Subscriber<Category> {

        @Override
        public void update(Category change) {
            currentCategory = change;
            menuTable.setContents(currentCategory.getChildCategories());
        }
    }
    
    public MenuTable<Category> getMenuTable() {
        return menuTable;
    }

    public Category getCurrentCategory() {
        return currentCategory;
    }
}
