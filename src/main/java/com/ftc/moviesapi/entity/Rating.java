package com.ftc.moviesapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {

    private String source;
    private String value;

    public Rating() {
    }

    
    /** 
     * @return String
     */
    public String getSource() {
        return source;
    }

    
    /** 
     * @param source
     */
    @JsonProperty("Source")
    public void setSource(String source) {
        this.source = source;
    }

    
    /** 
     * @return String
     */
    public String getValue() {
        return value;
    }

    
    /** 
     * @param value
     */
    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
    }
    
}
