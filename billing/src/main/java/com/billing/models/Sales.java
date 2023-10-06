package com.billing.models;

import com.billing.enums.Type;
import jakarta.persistence.ManyToMany;

;import java.util.List;

public class Sales extends BaseEntity{
    private Type type;
    private Double price;
    @ManyToMany(mappedBy = "sales")
    private List<User> users;

}
