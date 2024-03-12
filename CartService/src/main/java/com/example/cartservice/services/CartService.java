package com.example.cartservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.cartservice.dtos.FakeStoreCartDTO;

@Service
public class CartService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";


    public FakeStoreCartDTO[] getAllCarts(){
        FakeStoreCartDTO response[] = restTemplate.getForObject(url + "/carts", FakeStoreCartDTO[].class);
        return response;
    }
    public FakeStoreCartDTO getCartByID(long id){
        var response = restTemplate.getForObject(url + "/products/" + id, FakeStoreCartDTO.class);
        return response;
    }
    

    
}
