package org.example.model;

public enum MessagesVariable {
    ADD_VK_GROUP("Добавить группу"),
    SETTINGS_VK_GROUPS("Настройки группы"),
    DELETE_VK_GROUP("Удалить группу");

    private final String value;

    MessagesVariable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
