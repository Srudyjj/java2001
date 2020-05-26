package com.shop;

import com.shop.actions.structure.App;

public class Main {

    public static void main(String[] args) throws Exception {
        App app = App.getInstance();
        app.init();
    }

}
