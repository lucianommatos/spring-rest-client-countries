
package com.project.springrestclientcountries.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Language implements Serializable {

	private String iso6391;
    private String iso6392;
    private String name;
    private String nativeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = -464614483092460502L;

    public String getIso6391() {
        return iso6391;
    }

    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    public String getIso6392() {
        return iso6392;
    }

    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
