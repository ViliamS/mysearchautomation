package com.microsoft.mysearch.qa.util.xpathbuilder.enums;

import java.util.Collections;
import java.util.LinkedList;

public enum ACTIONS {

    ATTRIBUTE_CONTAINS_VALUE        (PREFIX.EMPTY, ACTION.CONTAINS),
    ATTRIBUTE_EQUALS_VALUE          (PREFIX.EMPTY, ACTION.EQUALS),
    ATTRIBUTE_WITHOUT_VALUE         (PREFIX.EMPTY, ACTION.ATTRIBUTE_ONLY),

    ATTRIBUTE_NOT_CONTAINS_VALUE    (PREFIX.EMPTY, ACTION.NOT_CONTAINS),
    ATTRIBUTE_NOT_EQUALS_VALUE      (PREFIX.EMPTY, ACTION.NOT_EQUALS),
    NOT_ATTRIBUTE_WITHOUT_VALUE     (PREFIX.EMPTY, ACTION.NOT_ATTRIBUTE),

    OR_ATTRIBUTE_WITHOUT_VALUE      (PREFIX.OR, ACTION.ATTRIBUTE_ONLY),
    OR_NOT_ATTRIBUTE_WITHOUT_VALUE  (PREFIX.OR, ACTION.NOT_ATTRIBUTE),
    AND_ATTRIBUTE_WITHOUT_VALUE     (PREFIX.AND, ACTION.ATTRIBUTE_ONLY),
    AND_NOT_ATTRIBUTE_WITHOUT_VALUE (PREFIX.AND, ACTION.NOT_ATTRIBUTE),

    AND_CONTAINS                    (PREFIX.AND, ACTION.CONTAINS),
    AND_NOT_CONTAINS                (PREFIX.AND, ACTION.NOT_CONTAINS),
    OR_CONTAINS                     (PREFIX.OR, ACTION.CONTAINS),
    OR_NOT_CONTAINS                 (PREFIX.OR, ACTION.NOT_CONTAINS),

    AND_EQUALS                      (PREFIX.AND, ACTION.EQUALS),
    AND_NOT_EQUALS                  (PREFIX.AND, ACTION.NOT_EQUALS),
    OR_EQUALS                       (PREFIX.OR, ACTION.EQUALS),
    OR_NOT_EQUALS                   (PREFIX.OR, ACTION.NOT_EQUALS);

    private PREFIX preAction;
    private ACTION postAction;

    ACTIONS(PREFIX preAction, ACTION postAction){
        this.preAction = preAction;
        this.postAction = postAction;
    }

    public String get(){
        return preAction.get() + postAction.get();
    }

    public PREFIX getPreAction(){
        return preAction;
    }

    public ACTION getPostAction(){
        return postAction;
    }

    private static String transformationOfStringToEnumName(String text) {
        return text.toUpperCase().replace(" ", "_");
    }

    public static ACTIONS getActions(String filterName) {
        return ACTIONS.valueOf(ACTIONS.transformationOfStringToEnumName(filterName));
    }

    public static LinkedList<ACTIONS> getValues(){
        LinkedList<ACTIONS> toReturn = new LinkedList<>();
        Collections.addAll(toReturn, ACTIONS.values());
        return toReturn;
    }
}