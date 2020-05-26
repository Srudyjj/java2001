package com.shop;

import com.shop.actions.AbstractAction;
import com.shop.actions.ActionSelector;
import com.shop.actions.output.ObjectTransformer;
import com.shop.storage.Storage;

import java.util.Objects;
import java.util.Scanner;

public class App {

    private static App instance;

    private Storage storage;
    private User currentUser;
    private final Scanner scanner;

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    private App(Storage storage, Scanner scanner) {
        this.storage = storage;
        this.scanner = scanner;
    }

    public void init() throws Exception {

        if (Objects.isNull(this.currentUser)) {
            System.out.println("For using shop you should login!!!");
            if (!logIn()) {
                System.exit(0);
            }
        }

        String command = "";
        do {
            System.out.print("shop> ");
            command = this.scanner.nextLine();
            AbstractAction<?> action = ActionSelector.findAction(command);
            if (action == null) {
                System.out.println("Command " + command + " not found!!!");
                continue;
            }
            action.setData(command);
            ObjectTransformer result = action.runAction();
            System.out.println(result.transformToConsoleOutput());
        } while (!command.equals("quit"));
    }

    private boolean logIn() {
        System.out.print("login: ");
        String login = this.scanner.nextLine();
        System.out.print("password: ");
        String password = this.scanner.nextLine();
        User user = this.storage.findUser(login, password);
        if (!Objects.isNull(user)) {
            this.currentUser = user;
            return true;
        } else {
            System.out.printf("User: %s with password: %s doesn't exist!!!%n", login, password);
            return false;
        }
    }

    public static App getInstance() {
        if (Objects.isNull(instance)) {
            instance = new App(new Storage(), new Scanner(System.in));
        }
        return instance;
    }

}
