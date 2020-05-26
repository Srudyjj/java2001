package com.shop.actions;

import com.shop.App;
import com.shop.actions.structure.Category;
import com.shop.actions.structure.ObjectTransformer;
import com.shop.actions.structure.StructureFactory;
import com.shop.storage.Storage;
import com.shop.utils.SimpleParser;

import java.util.Objects;

public class GetCategoryAction extends AbstractAction<Category> {

    @Override
    public void prepareAction() {
        setInputStructure(StructureFactory.createGetCategoryByIdStructure(this.data, new SimpleParser()));
    }

    @Override
    public ObjectTransformer operation() {
        long id = this.inputStructure.getId();
        Storage storage = App.getInstance().getStorage();
        Category category = storage.getCategory(id);

        if (Objects.isNull(category)) {
            System.out.printf("Category with id: %s doest'n exist!!!%n", id);
        }
        return category;
    }


}
