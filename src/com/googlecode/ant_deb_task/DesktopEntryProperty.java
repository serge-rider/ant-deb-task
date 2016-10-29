package com.googlecode.ant_deb_task;

/**
 * Desktop entry custom property.
 */
public class DesktopEntryProperty
{
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void addText(String text) {
        this.value = text;
    }
}

