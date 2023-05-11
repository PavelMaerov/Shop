package com.example.shop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;

@RestController
//@SessionScope
@RequestMapping("/order")
public class ShopController {
    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping("/add")
    void addItem(@RequestParam("items") String s) {
        System.out.println("Controller - " + this);
        System.out.println("Service - " + service);
        service.addItem(s);
    }

    @GetMapping("/get")
    HashSet<Integer> getItems(){
        return service.getItems();
    }

}
