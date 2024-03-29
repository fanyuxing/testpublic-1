package com.sc.bean;

import java.io.Serializable;

public class SysRole implements Serializable {
    private String id;

    private String name;

    private String available;

    private static final long serialVersionUID = 1L;

    public SysRole(String id, String name, String available) {
        this.id = id;
        this.name = name;
        this.available = available;
    }

    public SysRole() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}