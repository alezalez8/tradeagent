package com.example.tradeagent_java.controller;


import com.example.tradeagent_java.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
public class OrderController {


    @PostMapping("/add")
    ResponseEntity<String> addOrder(@Valid @RequestBody Order order) {
        return ResponseEntity.ok("Order is valid");
    }

    public String getAllOrder;


}
