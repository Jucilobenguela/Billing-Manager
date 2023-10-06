package com.billing.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User extends BaseEntity {
    private String name;
    private String email;
    private String password;
    private String numberPhone;
    @ManyToMany
    @JoinTable(name = "user_sales", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn (name = "sales_id"))
    private List<Sales> sales;

    public User(String name, String email, String password, String numberPhone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.numberPhone = numberPhone;
    }
}
