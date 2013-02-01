/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.co.kevindoran.category;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;

    public Category() {
        name = "" + Math.random();
    }

    public List<Category> getChildCategories() {
        List<Category> childCategories = new ArrayList<>();
        for(int i=0; i<20; i++) {
            childCategories.add(new Category());
        }
        return childCategories;
    }

    @Override
    public String toString() {
        return name;
    }
}