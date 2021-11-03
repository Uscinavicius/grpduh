package com.grpduh.budget.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity(name = "Data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int statementId;
    private int spent;
    private String Where;
    private Date Date;
    private String What;
    private String Category;
    private int Id;

    public Data() {
        super();
    }

    public Data(int spent, String Where, Date Date, String What, String Category, int Id) {
        super();
        this.spent = spent;
        this.Where = Where;
        this.Date = Date;
        this.What = What;
        this.Category = Category;
        this.Id = Id;
    }

    public int getStatementId() {
        return this.statementId;
    }

    public void setStatementId(int statementId) {
        this.statementId = statementId;
    }

    public int getSpent() {
        return this.spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    public String getWhere() {
        return this.Where;
    }

    public void setWhere(String Where) {
        this.Where = Where;
    }

    public java.sql.Date getDate() {
        return this.Date;
    }

    public void setDate(java.sql.Date Date) {
        this.Date = Date;
    }

    public String getWhat() {
        return this.What;
    }

    public void setWhat(String What) {
        this.What = What;
    }

    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
