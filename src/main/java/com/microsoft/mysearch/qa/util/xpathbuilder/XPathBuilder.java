package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;
import org.junit.Assert;

import java.util.LinkedList;
import java.util.stream.Collectors;

class XPathBuilder implements IXPath {

    private static String notContains(ATTRIBUTES attribute, String value) {
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(" + ATTRIBUTES.TEXT.get() + ",'" + value + "'))]";
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(" + attribute.get() + ",'" + value + "'))]";
        return "[" + PREFIX.NOT.get() + "(" + ACTION.CONTAINS.get() + "(@" + attribute.get() + ",'" + value + "'))]";
    }

    private static String notContains(ATTRIBUTES attributes, XPathValues attributeValues) {
        StringBuilder xpath = new StringBuilder();
        for (String oneValue : attributeValues.get()) {
            xpath.append(XPathBuilder.notContains(attributes, oneValue));
        }
        return xpath.toString();
    }

    private static String contains(ATTRIBUTES attribute, String attributeValue) {
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + ACTION.CONTAINS.get() + "(" + ATTRIBUTES.TEXT.get() + ",'" + attributeValue + "')]";
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + ACTION.CONTAINS.get() + "(" + attribute.get() + ",'" + attributeValue + "')]";
        return "[" + ACTION.CONTAINS.get() + "(@" + attribute.get() + ",'" + attributeValue + "')]";
    }

    private static String contains(ATTRIBUTES attributes, XPathValues attributeValues) {
        StringBuilder xpath = new StringBuilder();
        for (String oneValue : attributeValues.get()) {
            xpath.append(XPathBuilder.contains(attributes, oneValue));
        }
        return xpath.toString();
    }

    private static String notEqualsTo(ATTRIBUTES attribute, String attributeValue) {
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + PREFIX.NOT.get() + "(" + ATTRIBUTES.TEXT.get() + "='" + attributeValue + "')]";
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + PREFIX.NOT.get() + "(" + attribute.get() + "='" + attributeValue + "')]";
        return "[" + PREFIX.NOT.get() + "(@" + attribute.get() + "='" + attributeValue + "')]";
    }

    private static String notEqualsTo(ATTRIBUTES attribute, XPathValues equalsValues) {
        StringBuilder xpath = new StringBuilder();
        for (String value : equalsValues.get()) {
            xpath.append(notEqualsTo(attribute, value));
        }
        return xpath.toString();
    }

    private static String equalsTo(ATTRIBUTES attribute, String attributeValue) {
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.TEXT.get()))
            return "[" + ATTRIBUTES.TEXT.get() + "='" + attributeValue + "']";
        if (attribute.get().equalsIgnoreCase(ATTRIBUTES.ANY.get()))
            return "[" + attribute.get() + "='" + attributeValue + "']";
        return "[@" + attribute.get() + "='" + attributeValue + "']";
    }

    private static String equalsTo(ATTRIBUTES attribute, XPathValues equalsValues) {
        StringBuilder xpath = new StringBuilder();
        for (String value : equalsValues.get()) {
            xpath.append(equalsTo(attribute, value));
        }
        return xpath.toString();
    }

    private static String andContains(ATTRIBUTES attribute, XPathValues attributeValues) {
        return andActionContains(ACTION.AND, attribute, attributeValues.get());
    }

    private static String orContains(ATTRIBUTES attribute, XPathValues attributeValues) {
        return andActionContains(ACTION.OR, attribute, attributeValues.get());
    }

    private static String andAction(ACTIONS action, ATTRIBUTES attribute, XPathValues attributeValues) {
        if (action.getAction().equals(ACTION.CONTAINS)) {

            if (action.getPreAction().equals(PREFIX.OR)) {
                return andActionContains(ACTION.OR, attribute, attributeValues.get());
            } else if (action.getPreAction().equals(PREFIX.AND)) {
                return andActionContains(ACTION.AND, attribute, attributeValues.get());
            }
        } else if (action.getAction().equals(ACTION.EQUALS)) {

            if (action.getPreAction().equals(PREFIX.OR)) {
                return andActionEquals(ACTION.OR, attribute, attributeValues.get());
            } else if (action.getPreAction().equals(PREFIX.AND)) {
                return andActionEquals(ACTION.AND, attribute, attributeValues.get());
            }
        }
        Assert.assertTrue("Not implemented : " + action.getPreAction() + " " + action.getAction() + " xpath creation supported is now contains/equals and and/or ", false);
        return null;
    }

    private static String andActionEquals(ACTION action, ATTRIBUTES attribute, LinkedList<String> attributeValues) {
        if (!(action.equals(ACTION.AND) || action.equals(ACTION.OR))) {
            Assert.assertTrue("\n Builder method andActionContains(ACTION action, Map<String, List<String>> attributeMap) \n is only allowed to call with ACTION.AND or ACTION.OR values \n but we have detected ---> " + action.get() + " <--- \n please fix it", true);
        }
        LinkedList<String> containsBeforeSubstringAndContains = new LinkedList<>();
        // Changing list containing Values of attribute into List of xPaths contains attribute value for each entry of List
        containsBeforeSubstringAndContains.addAll(attributeValues.stream().map(attributeValue -> equalsTo(attribute, attributeValue)).collect(Collectors.toList()));
        // adding first entry as there is not being removed the first square bracket
        StringBuilder xpath = new StringBuilder(containsBeforeSubstringAndContains.get(0).substring(0, containsBeforeSubstringAndContains.get(0).length() - 1));
        for (int i = 1; i < containsBeforeSubstringAndContains.size() - 1; i++) {
            // for cycle is skipping first value as that was already added when initializing String xpath
            xpath.append(" ").append(action.get()).append(" ").append(containsBeforeSubstringAndContains.get(i).substring(1, containsBeforeSubstringAndContains.get(i).length() - 1));
        }
        //for skipped also adding a last value as there we don't want to remove the last square bracket
        int listSize = containsBeforeSubstringAndContains.get(attributeValues.size() - 1).length();
        xpath.append(" ").append(action.get()).append(" ").append(containsBeforeSubstringAndContains.get(attributeValues.size() - 1).substring(1, listSize));
        return xpath.toString();
    }

    private static String andActionContains(ACTION action, ATTRIBUTES attribute, LinkedList<String> attributeValues) {
        if (!(action.equals(ACTION.AND) || action.equals(ACTION.OR))) {
            Assert.assertTrue("\n Builder method andActionContains(ACTION action, Map<String, List<String>> attributeMap) \n is only allowed to call with ACTION.AND or ACTION.OR values \n but we have detected ---> " + action.get() + " <--- \n please fix it", true);
        }
        LinkedList<String> containsBeforeSubstringAndContains = new LinkedList<>();
        // Changing list containing Values of attribute into List of xPaths contains attribute value for each entry of List
        containsBeforeSubstringAndContains.addAll(attributeValues.stream().map(attributeValue -> contains(attribute, attributeValue)).collect(Collectors.toList()));
        // adding first entry as there is not being removed the first square bracket
        StringBuilder xpath = new StringBuilder(containsBeforeSubstringAndContains.get(0).substring(0, containsBeforeSubstringAndContains.get(0).length() - 1));
        for (int i = 1; i < containsBeforeSubstringAndContains.size() - 1; i++) {
            // for cycle is skipping first value as that was already added when initializing String xpath
            xpath.append(" ").append(action.get()).append(" ").append(containsBeforeSubstringAndContains.get(i).substring(1, containsBeforeSubstringAndContains.get(i).length() - 1));
        }
        //for skipped also adding a last value as there we don't want to remove the last square bracket
        int listSize = containsBeforeSubstringAndContains.get(attributeValues.size() - 1).length();
        xpath.append(" ").append(action.get()).append(" ").append(containsBeforeSubstringAndContains.get(attributeValues.size() - 1).substring(1, listSize));
        return xpath.toString();
    }

    static String getXPath(ACTIONS action, ATTRIBUTES attributes, XPathValues xPathValues) {

        switch (action) {

            case CONTAINS:
                return XPathBuilder.contains(attributes, xPathValues);

            case AND_CONTAINS:
                return XPathBuilder.andAction(action, attributes, xPathValues);

            case OR_CONTAINS:
                return XPathBuilder.andAction(action, attributes, xPathValues);

            case NOT_CONTAINS:
                return XPathBuilder.notContains(attributes, xPathValues);

            case EQUALS:
                return XPathBuilder.equalsTo(attributes, xPathValues);

            case AND_EQUALS:
                return XPathBuilder.andAction(action, attributes, xPathValues);

            case OR_EQUALS:
                return XPathBuilder.andAction(action, attributes, xPathValues);

            case NOT_EQUALS:
                return XPathBuilder.notEqualsTo(attributes, xPathValues);

            default:
                return "ERROR IN CALLING ACTION + '" + action.get() + "' in method XPathBuilder.getXPath OMFG!";
        }
    }

    static String getElementXpath(PREFIX prefix, ELEMENTS element) {
        return prefix.get() + element.get();
    }
}