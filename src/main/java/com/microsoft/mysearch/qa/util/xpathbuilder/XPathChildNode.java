package com.microsoft.mysearch.qa.util.xpathbuilder;

import com.microsoft.mysearch.qa.util.xpathbuilder.enums.ACTIONS;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.ATTRIBUTES;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.ELEMENTS;
import com.microsoft.mysearch.qa.util.xpathbuilder.enums.PREFIX;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.LinkedList;

public class XPathChildNode implements IXPath {

    private static final Log log = LogFactory.getLog(XPathChildNode.class.getName());

    private String xPath;

    XPathChildNode(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, XPathValues value){
        this.xPath = new XPath(prefix, element, action, attribute, value).getXPath();
    }

    XPathChildNode(PREFIX prefix, ELEMENTS element){
        this.xPath = new XPathElement(prefix, element).getXPath();
    }

    XPathChildNode(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value){
        this.xPath = new XPath(element, action, attribute, value).getXPath();
    }

    XPathChildNode(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, LinkedList<String> value){
        this.xPath = new XPath(element, action, attribute, value).getXPath();
    }

    XPathChildNode(ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, XPathValues values){
        this.xPath = new XPath(element, action, attribute, values).getXPath();
    }

    XPathChildNode(PREFIX prefix, ELEMENTS element, ACTIONS action, ATTRIBUTES attribute, String value){
        this.xPath = new XPath(prefix, element, action, attribute, value).getXPath();
    }

    String getXPath(){
        return "[." + xPath + "]";
    }
}
