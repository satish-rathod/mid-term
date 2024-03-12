package com.example.cartservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cartservice.dtos.FakeStoreCartDTO;

import com.example.cartservice.services.CartService;

@RestController
public class CartController{

    CartService cs;
    CartController(CartService cs){
        this.cs = cs;
    }

    @GetMapping("/carts")
    public FakeStoreCartDTO[] getAllCarts(){
        return cs.getAllCarts();
    }
    @GetMapping("/carts/{id}")
    public FakeStoreCartDTO getCartById(@PathVariable long id){
        return cs.getCartByID(id);
    }
    
}