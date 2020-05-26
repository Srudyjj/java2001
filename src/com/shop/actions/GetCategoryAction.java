package com.shop.actions;

import com.shop.actions.structure.Category;
import com.shop.actions.structure.ObjectTransformer;

public class GetCategoryAction extends AbstractAction<Category> {

    @Override
    public void prepareAction() {

    }

    @Override
    public ObjectTransformer operation() {
        return null;

//        int id = this.parameters.getId();
//
//        Storage storage = App.getInstance().getStorage();
//        Category category = storage.getCategory(this.parameters.);
//
//        if (Objects.isNull(category)) {
////            System.out.printf("Category with id: %s doest'n exist!!!%n", id);
//        } else {
//            System.out.println(Arrays.toString(category.getProducts()));
//        }
    }


}
