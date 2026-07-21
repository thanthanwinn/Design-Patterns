package org.ttw.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
	
	 private static final Map<String, TreeType> trees = new HashMap<>();


	    public static TreeType getTreeType(String type) {

	        if (!trees.containsKey(type)) {

	            if (type.equals("apple")) {
	                trees.put(type, new AppleTree());
	            }

	        }

	        return trees.get(type);
	    }

}
