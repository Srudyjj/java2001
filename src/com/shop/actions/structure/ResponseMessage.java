package com.shop.actions.structure;

public class ResponseMessage implements ObjectTransformer {

    private final String message;

    public ResponseMessage(String message) {
        this.message = message;
    }

    @Override
    public String transformToConsoleOutput() {
        return message;
    }
}
