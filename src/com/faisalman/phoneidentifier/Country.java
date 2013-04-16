/*
 * Country code definitions
 */
package com.faisalman.phoneidentifier;

/**
 *
 * @author Faisal Salman
 */
public enum Country {
    Indonesia(62, "Indonesia", "id");
    
    private final int number;
    private final String country;
    private final String alpha;
    
    private Country(int number, String country, String alpha) {
        this.number = number;
        this.country = country;
        this.alpha = alpha;
    }
    
    public int getNumberCode() {
        return this.number;
    }
    
    public String getCountryName() {
        return this.country;
    }
    
    public String getAlphaCode() {
        return this.alpha;
    }
}