package com.example.boot.config.enums;

public enum ExpressStatus {
    CREATED("已揽收"), TRANSIT("在途中"), SUCCESS("签收");
    private final String info;

    ExpressStatus(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
