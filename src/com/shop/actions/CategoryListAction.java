package com.shop.actions;

import com.shop.actions.structure.App;
import com.shop.actions.structure.Category;
import com.shop.actions.structure.CategoryListStructure;
import com.shop.actions.structure.StructureFactory;

public class CategoryListAction extends AbstractAction<CategoryListStructure> {

    @Override
    public void prepareAction() {
        setInputStructure(StructureFactory.createCategoryListStructure(this.data));
    }

    @Override
    public CategoryListStructure operation() {

        CategoryListStructure result = this.inputStructure;
        Category[] categories = App.getInstance().getStorage().getCategoryList();
        result.setCategories(categories);

        return result;
    }
}
