package com.shop.actions.structure;

public class CategoryListStructure implements ObjectTransformer {

    private Category[] categories;

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    @Override
    public String transformToConsoleOutput() {
        System.out.println("CategoryList");
        StringBuilder sb = new StringBuilder();
        for (Category category: this.getCategories()) {
            sb.append(category).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
