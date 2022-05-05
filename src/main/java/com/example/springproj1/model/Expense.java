package com.example.springproj1.model;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Expense {

    @Id
    @SequenceGenerator(
            name="expense_sequence",
            sequenceName = "expense_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "expense_sequence"
    )
    private int eid;
    private String elocation;
    private String edesc;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date timestamp;

    @ManyToOne
    @JoinColumn(
            name="category_id",
            referencedColumnName = "cid"
    )
    private Category category_id;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getElocation() {
        return elocation;
    }

    public void setElocation(String elocation) {
        this.elocation = elocation;
    }

    public String getEdesc() {
        return edesc;
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "eid=" + eid +
                ", elocation=" + elocation +
                ", edesc='" + edesc + '\'' +
                ", timestamp=" + timestamp +
                ", category_id=" + category_id +
                '}';
    }
}
