package com.shop;

import com.shop.actions.AbstractAction;
import com.shop.actions.ActionSelector;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws Exception {
        String command = "add";
        AbstractAction action = getAction(command);
        action.runAction();
    }

    private static AbstractAction getAction(String command) throws Exception {
        AbstractAction action = null;
        Object instance = ActionSelector.findAction(command).getConstructor().newInstance();
        if (instance instanceof AbstractAction) {
            action = (AbstractAction) instance;
        } else {
            System.exit(1);
        }
        return action;
    }

}
