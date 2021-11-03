package com.grpduh.budget.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "information")
public class Information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "spent")
    private int spent;
    
    @Column(name = "location")
    private String location;
    
    @Column(name = "what")
    private String what;
    
    @Column(name = "category")
    private String category;

    public Information() {
        super();
    }

    public Information(int spent, String location, String what, String category) {
        super();
        this.spent = spent;
        this.location = location;
        this.what = what;
        this.category = category;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpent() {
        return this.spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWhat() {
        return this.what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
