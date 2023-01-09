package com.example.Springboot_api_db.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//this is the thing need to be saved in database. we need to map these objects, objects of this topic
// class to relational database.
@Entity                               //with this annotation jpa knows to create a table "Topic" and will have three columns id, name,variable
public class Topic {
    @Id                          //annotation tells that id will be primary key
    private String id;          //member variables or fields. these will go as columns in database
    private String name;
    private String description;

    //instances of topic class would go as row in database table
    //constructor no-args
    public Topic() {
    }

    //constructor with parameter
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //getter and setter for all variables
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}