package com.shop.actions;

public enum ActionSelector {

    CATEGORY_LIST("category-list", CategoryList.class),
    PRODUCT_List("product-list", ProductList.class),
    ADD("add", AddToBasket.class),
    BUY("buy", BuyProduct.class);

    Class action;
    String command;

    ActionSelector(String command, Class actionClass) {
        this.command = command;
        this.action = actionClass;
    }

    public static Class findAction(String command) {
        Class action = null;
        for (ActionSelector value : ActionSelector.values()) {
            if (value.getCommand().equals(command)) {
                action = value.getAction();
                break;
            }
        }
        return action;
    }

    public String getCommand() {
        return command;
    }

    public Class getAction() {
        return action;
    }
}
