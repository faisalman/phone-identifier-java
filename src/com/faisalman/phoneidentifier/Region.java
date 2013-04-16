/*
 * Region definitions
 */
package com.faisalman.phoneidentifier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Faisal Salman
 */
public enum Region {
    Unknown(""),
    Jakarta("021"),
    Bandung("022"),
    Semarang("024"),
    Surabaya("031"),
    Medan("061");
    
    private final String key;
    private static final Map<String, Region> map = new HashMap<String, Region>();
    
    static {
        for (Region type : Region.values()) {
            map.put(type.key, type);
        }
    }
    
    private Region (String key) {
        this.key = key;
    }
    
    public String getCode() {
        return this.key;
    }
        
    public static Region getRegion(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            return Region.Unknown;
        }
    }
}