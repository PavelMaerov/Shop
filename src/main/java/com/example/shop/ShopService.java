package com.example.shop;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@SessionScope
public class ShopService {
    HashSet<Integer> basket = new HashSet<>();
    //   /store/order/add
    void addItem(String items) {
        System.out.println(this);
        System.out.println(items);
        Set<Integer> itemsSet= Arrays.stream(items.split(",")).map(Integer::valueOf).collect(Collectors.toSet());
        basket.addAll(itemsSet);
    }
    //   /store/order/get
    HashSet<Integer> getItems() {
        return basket;
    }


}
