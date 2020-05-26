package com.shop.utils;

public interface Parser {

    void parse(String... arguments);

    String getOption(String key);

    boolean hasOption(String name);

    boolean getBooleanOption(String name);

    int getIntOption(String name);

    long getLongOption(String name);

    void setOption(String key, String value);
}
