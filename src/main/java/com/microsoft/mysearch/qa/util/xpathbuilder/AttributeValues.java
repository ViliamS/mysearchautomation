package com.microsoft.mysearch.qa.util.xpathbuilder;

import java.util.LinkedList;

public class AttributeValues implements IXPath {

    private LinkedList<String> xpathValuesList;

    public AttributeValues(LinkedList<String> valuesList){
        this.xpathValuesList = new LinkedList<>();
        this.xpathValuesList = valuesList;
    }

    public LinkedList<String> getXpathValuesList(){
        return this.xpathValuesList;
    }

    public AttributeValues add(String value){
        this.xpathValuesList.add(value);
        return this;
    }

    public AttributeValues get(){
        return this;
    }
}