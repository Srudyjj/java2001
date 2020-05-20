package com.shop;

import com.shop.actions.AbstractAction;
import com.shop.actions.ActionSelector;
import com.shop.storage.Storage;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static final Storage storage = new Storage();

    public static void main(String[] args) throws Exception {
        App app = new App(new Storage(), new Scanner(System.in));
        app.init();
    }

}
