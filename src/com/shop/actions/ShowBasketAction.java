package com.shop.actions;

import com.shop.App;
import com.shop.actions.structure.Basket;
import com.shop.actions.structure.ObjectTransformer;
import com.shop.actions.structure.User;
import com.shop.storage.Storage;

public class ShowBasketAction extends AbstractAction<Basket> {

    @Override
    public void prepareAction() {
    }

    @Override
    public ObjectTransformer operation() {
        User user = App.getInstance().getCurrentUser();
        Storage storage = App.getInstance().getStorage();
        return storage.getBasket(user.getBasketId());
    }

}
