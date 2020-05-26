package com.shop.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleParser implements Parser {

    private final Map<String, String> opts = new HashMap<>();

    public SimpleParser() {
    }

    @Override
    public void parse(String... arguments) {
        for (String arg : arguments) {
            if (arg.startsWith("--")) {
                addOption(arg.substring(2));
            } else if (arg.startsWith("-")) {
                addOption(arg.substring(1));
            } else {
                addOption(arg);
            }
        }
    }

    private void addOption(String option) {
        if (option != null && !option.isBlank()) {
            String[] options = option.split("=", 2);
            String optionName = options[0];
            String optionValue = "true";
            if (options.length == 2) {
                optionValue = options[1];
            }
            opts.put(optionName, optionValue);
        }
    }

    @Override
    public boolean hasOption(String name) {
        return opts.containsKey(name);
    }

    @Override
    public String getOption(String name) {
        return opts.get(name);
    }

    @Override
    public boolean getBooleanOption(String name) {
        if (hasOption(name)) {
            return true;
        }
        return Boolean.parseBoolean(getOption(name));
    }

    @Override
    public int getIntOption(String name) {
        return Integer.parseInt(getOption(name));
    }

    @Override
    public long getLongOption(String name) {
        return Long.parseLong(getOption(name));
    }

    @Override
    public void setOption(String key, String value) {
        this.opts.put(key, value);
    }
}
