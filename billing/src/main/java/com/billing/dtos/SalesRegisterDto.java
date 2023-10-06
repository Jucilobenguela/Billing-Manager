package com.billing.dtos;

import com.billing.enums.Type;
import lombok.Data;

@Data
public class SalesRegisterDto{
    private Type type;
    private Double price;

}
