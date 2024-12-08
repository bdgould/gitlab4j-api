package org.gitlab4j.api.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomAttribute implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The key associated with the custom attribute.
     */
    @JsonProperty("key")
    private String key;

    /**
     * The value associated with the custom attribute.
     */
    @JsonProperty("value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomAttribute withKey(String key) {
        this.key = key;
        return this;
    }

    public CustomAttribute withValue(String value) {
        this.value = value;
        return this;
    }
}
