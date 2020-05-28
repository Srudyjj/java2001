package com.shop.actions;

public enum ActionSelector {

    CATEGORY_LIST("category-list", CategoryListAction.class),
    SHOW_CATEGORY("show-category", GetCategoryAction.class),
    ADD_TO_BASKET("add-to-basket", AddToBasket.class),
    SHOW_BASKET("show-basket", ShowBasketAction.class),
    BUY("buy", BuyProduct.class);

    Class<?> action;
    String command;

    ActionSelector(String command, Class<?> actionClass) {
        this.command = command;
        this.action = actionClass;
    }

    public static AbstractAction<?> findAction(String command) throws Exception {
        AbstractAction<?> action = null;
        for (ActionSelector value : ActionSelector.values()) {
            if (command.startsWith(value.getCommand())) {
                action = (AbstractAction<?>) value.getAction().getConstructor().newInstance();
                break;
            }
        }

        return action;
    }

    public String getCommand() {
        return command;
    }

    public Class<?> getAction() {
        return action;
    }
}
