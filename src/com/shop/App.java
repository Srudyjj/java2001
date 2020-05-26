package com.shop;

import com.shop.actions.AbstractAction;
import com.shop.actions.ActionSelector;
import com.shop.actions.structure.ObjectTransformer;
import com.shop.actions.structure.User;
import com.shop.storage.Storage;

import java.util.Arrays;
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
            if (command.isBlank()) {
                continue;
            }

            String [] arguments = parse(command);
            String operationName = arguments[0];
            String[] options = {};
            if (arguments.length > 1) {
                options = Arrays.copyOfRange(arguments, 1, arguments.length);
            }

            AbstractAction<?> action = ActionSelector.findAction(operationName);
            if (action == null) {
                System.out.println("Command " + operationName + " not found!!!");
                continue;
            }
            action.setData(options);
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

    private String[] parse(String line) {
        return line.split("\\s");
    }

}
