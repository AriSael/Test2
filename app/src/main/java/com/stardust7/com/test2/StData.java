package com.stardust7.com.test2;

/**
 * Created by _ on 27/11/2560.
 */

public class StData {
    private String id;
    private String name, gender, email, by;

    public StData(String id, String name, String gender, String email, String by) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.by = by;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getBy() {
        return by;
    }
}