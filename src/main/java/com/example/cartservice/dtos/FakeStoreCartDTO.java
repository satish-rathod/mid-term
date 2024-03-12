package com.example.cartservice.dtos;

import com.example.cartservice.models.Products;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreCartDTO {
    int id;
    int userId;
    String date;
    Products[] products;
    
}
