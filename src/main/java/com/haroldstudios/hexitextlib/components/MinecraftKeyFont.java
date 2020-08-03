package com.haroldstudios.hexitextlib.components;

public enum MinecraftKeyFont {

    UNIFORM("minecraft:uniform"),
    ENCHANTING_TABLE("minecraft:alt"),
    DEFAULT("minecraft:default");

    private final String key;

    MinecraftKeyFont(final String key) {
        this.key = key;
    }

    public String getFont() {
        return key;
    }
}
