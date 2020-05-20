package com.shop.actions;

import com.shop.App;
import com.shop.Category;
import com.shop.Main;

public class CategoryList extends AbstractAction {
    @Override
    public void operation() {
        System.out.println("CategoryList");
        Category[] categories = App.getInstance().getStorage().getCategoryList();
        for (Category category: categories) {
            System.out.println(category);
        }
    }

    @Override
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}
