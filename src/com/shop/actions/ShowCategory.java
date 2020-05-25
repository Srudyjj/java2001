package com.shop.actions;

import com.shop.App;
import com.shop.Category;
import com.shop.actions.structure.input.ShowCategoryInputStructure;
import com.shop.storage.Storage;

import java.util.Arrays;
import java.util.Objects;

public class ShowCategory extends AbstractAction {

    @Override
    public void operation() {

        int id = this.parameters.getId();

        Storage storage = App.getInstance().getStorage();
        Category category = storage.getCategory(this.parameters.);

        if (Objects.isNull(category)) {
//            System.out.printf("Category with id: %s doest'n exist!!!%n", id);
        } else {
            System.out.println(Arrays.toString(category.getProducts()));
        }
    }

    @Override
    public void prepareAction(String command) {
        this.parameters = new ShowCategoryInputStructure()
                .parse(command);
    }
}
