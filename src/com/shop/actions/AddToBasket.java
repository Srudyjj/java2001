package com.shop.actions;

import com.shop.App;
import com.shop.actions.structure.*;
import com.shop.storage.Storage;
import com.shop.utils.SimpleParser;

public class AddToBasket extends AbstractAction<Product> {

    @Override
    public void prepareAction() {
        setInputStructure(StructureFactory.createGetProductByIdStructure(this.data, new SimpleParser()));
    }

    @Override
    public ObjectTransformer operation() {
        long productId = this.inputStructure.getId();
        Storage storage = App.getInstance().getStorage();
        User user = App.getInstance().getCurrentUser();
        Basket basket = storage.getBasket(user.getBasketId());
        basket.addProductId(productId);

        return new ResponseMessage(String.format("Product with id %d is added!", productId));
    }
}
