package com.shop.actions.structure;

import com.shop.utils.Parser;
import com.shop.utils.SimpleParser;

public class StructureFactory {
    public static CategoryListStructure createCategoryListStructure(String[] data) {
        return new CategoryListStructure();
    }

    public static Category createGetCategoryByIdStructure(String[] data, Parser parser) {
        parser.parse(data);
        Category category = new Category();
        category.setId(parser.getLongOption("id"));
        return category;
    }

    public static Product createGetProductByIdStructure(String[] data, Parser parser) {
        parser.parse(data);
        Product product = new Product();
        product.setId(parser.getLongOption("id"));
        return product;
    }

}
