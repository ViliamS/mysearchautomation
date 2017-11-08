package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;
import org.junit.Assert;

import java.util.LinkedList;

public interface IXPath {

    ELEMENTS
            any_element =       ELEMENTS.ANY,
            wi =                ELEMENTS.WI,
            input =             ELEMENTS.INPUT,
            div =               ELEMENTS.DIV,
            a =                 ELEMENTS.A,
            p =                 ELEMENTS.P,
            span =              ELEMENTS.SPAN,
            button =            ELEMENTS.BUTTON,
            select =            ELEMENTS.SELECT,
            search =            ELEMENTS.SEARCH,
            chat_header =       ELEMENTS.CHAT_HEADER,
            call_start_btn =    ELEMENTS.CALLING_START_BUTTON,
            call_join_btn =     ELEMENTS.CALLING_JOIN_BUTTON,
            textarea =          ELEMENTS.TEXT_AREA,
            label =             ELEMENTS.LABEL,
            ul =                ELEMENTS.UL,
            li =                ELEMENTS.LI,
            individual_search = ELEMENTS.INDIVIDUAL_SEARCH_CATEGORY,
            h1 =                ELEMENTS.H1,
            h2 =                ELEMENTS.H2,
            h3 =                ELEMENTS.H3,
            body =              ELEMENTS.BODY,
            virtualRepeat =     ELEMENTS.VIRTUAL_REPEAT,
            footer =            ELEMENTS.FOOTER;

    ATTRIBUTES
            any =               ATTRIBUTES.ANY,
            pl_upn =            ATTRIBUTES.PL_UPN,
            audio_only =        ATTRIBUTES.AUDIO_ONLY,
            ariaDisabled =      ATTRIBUTES.ARIA_DISABLED,
            dataType =          ATTRIBUTES.DATA_TYPE,
            id =                ATTRIBUTES.ID,
            em =                ATTRIBUTES.EM,
            href =              ATTRIBUTES.HREF,
            frag =              ATTRIBUTES.FRAG,
            class_att =         ATTRIBUTES.CLASS,
            dropdown =          ATTRIBUTES.DROPDOWN,
            text =              ATTRIBUTES.TEXT,
            checkbox =          ATTRIBUTES.CHECKBOX,
            role =              ATTRIBUTES.ROLE,
            datareactid =       ATTRIBUTES.DATA_REACTID,
            type =              ATTRIBUTES.TYPE,
            name =              ATTRIBUTES.NAME,
            title =             ATTRIBUTES.TITLE,
            style =             ATTRIBUTES.STYLE,
            disabled =          ATTRIBUTES.DISABLED,
            wicketpath =        ATTRIBUTES.WICKETPATH,
            dataTid =           ATTRIBUTES.DATA_TID,
            with_video =        ATTRIBUTES.WITH_VIDEO,
            dataPath =          ATTRIBUTES.DATA_PATH;

    ACTIONS
            contains =          ACTIONS.ATTRIBUTE_CONTAINS_VALUE,
            equals =            ACTIONS.ATTRIBUTE_EQUALS_VALUE,

            notContains =       ACTIONS.ATTRIBUTE_NOT_CONTAINS_VALUE,
            notEquals =         ACTIONS.ATTRIBUTE_NOT_EQUALS_VALUE,

            andEquals =         ACTIONS.AND_EQUALS,
            andNotEquals =      ACTIONS.AND_NOT_EQUALS,
            andContains =       ACTIONS.AND_CONTAINS,
            andNotContains =    ACTIONS.AND_NOT_CONTAINS,

            orEquals =          ACTIONS.OR_EQUALS,
            orNotEquals =       ACTIONS.OR_NOT_EQUALS,
            orContains =        ACTIONS.OR_CONTAINS,
            orNotContains =     ACTIONS.AND_NOT_CONTAINS;

    PREFIX
            singleSlash =       PREFIX.SINGLE_SLASH,
            doubleSlash =       PREFIX.DOUBLE_SLASH;

    static String getChildNodeXPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value){
        return IXPath.getChildNodeXPath(IXPath.getXPath(doubleSlash, element, action, attribute, value));
    }

    static String getChildNodeXPath(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value){
        return IXPath.getChildNodeXPath(IXPath.getXPath(prefix, element, action, attribute, value));
    }

    static String getChildNodeXPath(String xpath){
        return "[." + xpath + "]";
    }

    static String getXPath(PREFIX prefix, ELEMENTS element, ActionsAttributes actionsAttributes){
        return getXPath(prefix, element) + actionsAttributes.getXPath();
    }

    static String getXPath(String element){
        return IXPath.getXPath(doubleSlash, element);
    }

    static String getXPath(ELEMENTS element) {
        return getXPath(doubleSlash, element);
    }

    static String getXPath(PREFIX prefix, ELEMENTS element) {
        return getXPath(prefix, element.get());
    }

    static String getXPath(PREFIX prefix, String element){
        return prefix.get() + element;
    }

    static String contains(ATTRIBUTES attribute, String value){
        return IXPath.contains(attribute.get(), value);
    }

    static String contains(String attribute, LinkedList<String> values){
        StringBuilder xpath = new StringBuilder();
        for (String value : values){
            xpath.append(IXPath.contains(attribute, value));
        }
        return xpath.toString();
    }

    static String contains(ATTRIBUTES attribute, LinkedList<String> values){
        return IXPath.contains(attribute.get(), values);
    }

    static String contains(String attribute, String attributeValue) {
        if (attribute.equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + ACTION.CONTAINS.get() + "(" + ATTRIBUTES.TEXT.get() + ",'" + attributeValue + "')]";
        if (attribute.equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + ACTION.CONTAINS.get() + "(" + attribute + ",'" + attributeValue + "')]";
        return "[" + ACTION.CONTAINS.get() + "(@" + attribute + ",'" + attributeValue + "')]";
    }

    static String getXPath(ActionsAttributes actionsAttributes) {

        StringBuilder xpath = new StringBuilder();

//        LinkedListMultimap<ACTIONS, AttributeValues> actionAttributes = actionsAttributes.getActionAttributesMap();
//
//        for (Map.Entry<ACTIONS, AttributeValues> entry : actionAttributes.entries()){
//
//            ACTIONS action = entry.getKey();
//            AttributeValues attributeValues = entry.getValue();
//
//            xpath.append(IXPath.getXPath(action, attributeValues));
//
//
//        }
        return xpath.toString();
    }

    static String notContains(String attribute, String value){
        if (attribute.equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(" + ATTRIBUTES.TEXT.get() + ",'" + value + "'))]";
        if (attribute.equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(" + attribute + ",'" + value + "'))]";
        return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(@" + attribute + ",'" + value + "'))]";
    }

    static String notContains(ATTRIBUTES attribute, String value) {
        return IXPath.notContains(attribute.get(), value);
    }

    static String notContains(ATTRIBUTES attributes, LinkedList<String> values) {
        StringBuilder xpath = new StringBuilder();
        for (String value : values){
            xpath.append(IXPath.notContains(attributes.get(), value));
        }
        return xpath.toString();
    }

    static String notEqualsTo(String attribute, String attributeValue) {
        if (attribute.equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + PREFIX.NOT.get() + "(" + ATTRIBUTES.TEXT.get() + "='" + attributeValue + "')]";
        if (attribute.equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + PREFIX.NOT.get() + "(" + attribute + "='" + attributeValue + "')]";
        return "[" + PREFIX.NOT.get() + "(@" + attribute + "='" + attributeValue + "')]";
    }

    static String notEqualsTo(ATTRIBUTES attribute, String value) {
        return IXPath.notEqualsTo(attribute.get(), value);
    }

    static String notEqualsTo(ATTRIBUTES attributes, LinkedList<String> values) {
        StringBuilder xpath = new StringBuilder();
        for (String value : values) {
            xpath.append(IXPath.notEqualsTo(attributes.get(), value));
        }
        return xpath.toString();
    }

    static String equalsTo(ATTRIBUTES attribute, String value) {
        return IXPath.equalsTo(attribute.get(), value);
    }

    static String equalsTo(ATTRIBUTES attributes, LinkedList<String> values) {
        StringBuilder xpath = new StringBuilder();
        for (String value : values) {
            xpath.append(IXPath.equalsTo(attributes.get(), value));
        }
        return xpath.toString();
    }

    static String equalsTo(String attribute, String attributeValue) {
        if (attribute.equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + ATTRIBUTES.TEXT.get() + "='" + attributeValue + "']";
        if (attribute.equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + attribute + "='" + attributeValue + "']";
        return "[@" + attribute + "='" + attributeValue + "']";
    }

    static String getXPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute){
        return IXPath.getXPath(doubleSlash, element, action, attribute);
    }

    static String getXPath(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute){
        return getXPath(prefix, element) + getXPath(action, attribute.get());
    }

    static String getXPath(String element, ACTIONS action, String attribute){
        return IXPath.getXPath(doubleSlash, element, action, attribute);
    }

    static String getXPath(PREFIX prefix, String element, ACTIONS action, String attribute){
        return getXPath(prefix, element) + getXPath(action, attribute);
    }

    static String getXPath(ACTIONS action, String attribute){
        String specialChar = "@";
        if (attribute.equalsIgnoreCase("text()")||attribute.equalsIgnoreCase("text")) {
            specialChar = "";
            attribute = "text()";
        }
        switch (action){

            case ATTRIBUTE_WITHOUT_VALUE:
                return "[" + specialChar + attribute + "]";

            case NOT_ATTRIBUTE_WITHOUT_VALUE:
                return "[not(" + specialChar + attribute + ")]";

            case AND_NOT_ATTRIBUTE_WITHOUT_VALUE:
                Assert.assertTrue("incorrect calling of method for this operation you need LinkedList<String> of Attributes with minimal size 2", false);
                return "";

            case OR_NOT_ATTRIBUTE_WITHOUT_VALUE:
                Assert.assertTrue("incorrect calling of method for this operation you need LinkedList<String> of Attributes with minimal size 2", false);
                return "";
        }
        Assert.assertTrue("Failed as something gone wrong and you shouldn't end here", false);
        return "";
    }

    static String getXPath(ACTIONS action, String attribute, LinkedList<String> values){

        StringBuilder xpath = new StringBuilder();

        if (action.getPreAction().equals(PREFIX.EMPTY)){
            for (String value : values) {
                xpath.append(IXPath.getXPath(action, attribute, value));
            }
            return xpath.toString();
        } else if (action.getPreAction().equals(PREFIX.AND) || action.getPreAction().equals(PREFIX.OR)){

            for (String value : values) {
                xpath.append(IXPath.getXPath(action, attribute, value));

            }
        }
        return "";
    }

    static String getXPath(ACTIONS action, String attribute, String value){

        if (action.getPostAction().equals(ACTION.ATTRIBUTE_ONLY) || action.getPostAction().equals(ACTION.NOT_ATTRIBUTE)) {
            /* ATTRIBUTE WITHOUT VALUE || NOT ATTRIBUTE WITHOUT VALUE */
            return IXPath.getXPath(action, attribute);

        } else {

            switch (action) {

                case ATTRIBUTE_CONTAINS_VALUE:
                    return IXPath.contains(attribute, value);

                case ATTRIBUTE_NOT_CONTAINS_VALUE:
                    return IXPath.notContains(attribute, value);

                case ATTRIBUTE_EQUALS_VALUE:
                    return IXPath.equalsTo(attribute, value);

                case ATTRIBUTE_NOT_EQUALS_VALUE:
                    return IXPath.notEqualsTo(attribute, value);

                default:
                    Assert.assertTrue("ERROR IN CALLING ACTION + '" + action.get() + "' in method XPath.getXPath OMFG!", false);
            }
        }
        Assert.assertTrue("Failed as something gone wrong and you shouldn't end here", false);
        return "";
    }

    static String getXPath(ACTIONS action, ATTRIBUTES attribute, String value){
        return IXPath.getXPath(action, attribute.get(), value);
    }

    static String getXPath(PREFIX prefix, ELEMENTS element, ACTIONS action, String attribute, String value) {
        return IXPath.getXPath(prefix, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value) {
        return IXPath.getXPath(prefix, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(PREFIX prefix, String element, ACTIONS action, ATTRIBUTES attribute, String value){
        return IXPath.getXPath(prefix, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(PREFIX prefix, String element, ACTIONS action, String attribute, String value){
        return IXPath.getXPath(prefix, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(String element, ACTIONS action, ATTRIBUTES attribute, String value){
        return IXPath.getXPath(doubleSlash, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(String element, ACTIONS action, String attribute, String value){
        return IXPath.getXPath(doubleSlash, element) + IXPath.getXPath(action, attribute, value);
    }

    static String getXPath(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value) {
        return IXPath.getXPath(doubleSlash, element, action, attribute, value);
    }

    static String getXPath(ELEMENTS element, ACTIONS action, String attribute, String value) {
        return IXPath.getXPath(doubleSlash, element.get(), action, attribute, value);
    }
}