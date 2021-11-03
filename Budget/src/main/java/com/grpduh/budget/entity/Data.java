package com.grpduh.budget.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Date;

@Entity(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StatementId")
    private int statementId;

    @Column(name = "Spent")
    private int spent;
    
    @Column(name = "Location")
    private String location;
    
    @Column(name = "Date_")
    private Date date;
    
    @Column(name = "What")
    private String what;
    
    @Column(name = "Category")
    private String category;

    @Column(name = "personId")
    private String personId;

    public Data() {
        super();
    }

    public Data(int spent, String location, Date date, String what, String category) {
        super();
        this.spent = spent;
        this.location = location;
        this.date = date;
        this.what = what;
        this.category = category;
    }

}
