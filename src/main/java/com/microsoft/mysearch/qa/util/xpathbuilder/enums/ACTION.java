package com.microsoft.mysearch.qa.util.xpathbuilder.enums;

import java.util.Collections;
import java.util.LinkedList;

public enum ACTION {

    ATTRIBUTE_ONLY  ("attribute without value"),
    CONTAINS        ("contains"),
    EQUALS          ("equals"),

    NOT_ATTRIBUTE   (PREFIX.NOT.get() + " " + ATTRIBUTE_ONLY.get()),
    NOT_CONTAINS    (PREFIX.NOT.get() + " " + CONTAINS.get()),
    NOT_EQUALS      (PREFIX.NOT.get() + " " + EQUALS.get());

    private String action;

    ACTION(String action) {
        this.action = action;
    }

    public String get() {
        return action;
    }

    private static String transformationOfStringToEnumName(String text) {
        return text.toUpperCase().replace(" ", "_");
    }

    public static ACTION getAction(String filterName) {
        return ACTION.valueOf(ACTION.transformationOfStringToEnumName(filterName));
    }

    public static LinkedList<ACTION> getValues() {
        LinkedList<ACTION> toReturn = new LinkedList<>();
        Collections.addAll(toReturn, ACTION.values());
        return toReturn;
    }
}