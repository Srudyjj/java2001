package com.shop;

import com.shop.actions.AbstractAction;
import com.shop.actions.ActionSelector;
import com.shop.storage.Storage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static final Storage storage = new Storage();

    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("shop> ");
            String line = scanner.nextLine();

            String[] arguments = line.trim().split("\\s");
            String command = (arguments.length > 0) ? arguments[0] : "";
            String parameters = (arguments.length > 1) ? arguments[1] : null;

            AbstractAction action = getAction(command);
            if (action == null) {
                System.out.println("Command " + line + " not found!!!");
                continue;
            }
            action.runAction(parameters);
        }
    }

    private static AbstractAction getAction(String command) throws Exception {
        AbstractAction action = null;
        Object instance;
        Class clazz = ActionSelector.findAction(command);

        if (clazz != null) {
            instance = clazz.getConstructor().newInstance();
            if (instance instanceof AbstractAction) {
                action = (AbstractAction) instance;
            }
        }
        return action;
    }

}
