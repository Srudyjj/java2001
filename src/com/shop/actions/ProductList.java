package com.shop.actions;

import com.shop.actions.structure.ObjectTransformer;

public class ProductList extends AbstractAction {

    @Override
    public void prepareAction() {

    }

    @Override
    public ObjectTransformer operation() {
        return null;
//        System.out.println("ProductList");
//        for(Category category: App.getInstance().getStorage().getCategoryList()) {
//            for (Product product: category.getProducts()){
//                System.out.println(product);
//            }
//        }
    }

}
