package com.shop.actions;

import com.shop.App;
import com.shop.Category;
import com.shop.storage.Storage;

import java.util.Arrays;
import java.util.Objects;

public class ShowCategory extends AbstractAction {

    @Override
    public void operation() {
        if (Objects.isNull(this.parameters)) {
            System.out.println("You should set id of category");
            return;
        }

        Storage storage = App.getInstance().getStorage();
        int id = Integer.parseInt(parameters);
        Category category = storage.getCategory(id);

        if (Objects.isNull(category)) {
            System.out.printf("Category with id: %s doest'n exist!!!%n", id);
        } else {
            System.out.println(Arrays.toString(category.getProducts()));
        }
    }

    @Override
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
}
