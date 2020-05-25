package com.shop.actions.structure.input;

public class ShowCategoryInputStructure implements AbstractInputStructure {

    private int id;

    public int getId() {
        return id;
    }

    @Override
    public ShowCategoryInputStructure parse(String command) {
        try {
            this.id = Integer.parseInt(command.split("\\s")[1]);
        } catch (NumberFormatException e) {
            System.out.println(String.format("Wrong parameter: " + e.getLocalizedMessage()));
        }

        return this;
    }
}
