package com.shop.actions;

import com.shop.App;
import com.shop.Category;
import com.shop.Main;
import com.shop.Product;

public class ProductList extends AbstractAction {
    @Override
    public void operation() {
        System.out.println("ProductList");
        for(Category category: App.getInstance().getStorage().getCategoryList()) {
            for (Product product: category.getProducts()){
                System.out.println(product);
            }
        }
    }

    @Override
    public void prepareAction(String parameters) {
        this.parameters = null;
    }
}
