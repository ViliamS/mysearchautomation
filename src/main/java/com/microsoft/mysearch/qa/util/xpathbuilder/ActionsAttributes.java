package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.*;

import java.util.LinkedList;

public class ActionsAttributes implements IXPath {

    private Table<ACTIONS, String, AttributeValues> actionAttributes;

    public ActionsAttributes() {
        this.actionAttributes = HashBasedTable.create();
    }

    public ActionsAttributes(ACTIONS action, ATTRIBUTES attribute, AttributeValues attributeValues){
        this.actionAttributes = HashBasedTable.create();
        this.actionAttributes.put(action, attribute.get(), attributeValues);
    }

    public ActionsAttributes(ACTIONS action, String attribute, LinkedList<String> values){
        this.actionAttributes = HashBasedTable.create();
        this.actionAttributes.put(action, attribute, new AttributeValues(values));
    }

    public ActionsAttributes(ACTIONS action, ATTRIBUTES attribute, LinkedList<String> values){
        this.actionAttributes = HashBasedTable.create();
        this.actionAttributes.put(action, attribute.get(), new AttributeValues(values));
    }

    public ActionsAttributes put(ACTIONS action, ATTRIBUTES attribute, LinkedList<String> values){
        this.actionAttributes.put(action, attribute.get(), new AttributeValues(values));
        return this;
    }

    public ActionsAttributes put(ACTIONS action, String attribute, LinkedList<String> values){
        this.actionAttributes.put(action, attribute, new AttributeValues(values));
        return this;
    }

    public ActionsAttributes put(ACTIONS action, String attribute, AttributeValues attributeValues){
        this.actionAttributes.put(action, attribute, attributeValues);
        return this;
    }

    public ActionsAttributes put(ACTIONS action, ATTRIBUTES attribute, AttributeValues attributeValues){
        this.actionAttributes.put(action, attribute.get(), attributeValues);
        return this;
    }

    public Table<ACTIONS, String, AttributeValues> getActionAttributesMap(){
        return this.actionAttributes;
    }

    public String getXPath(){
        return "";
    }
}