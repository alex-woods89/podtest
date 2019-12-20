package com.PODFather.PODFather.controllers;


import com.PODFather.PODFather.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/items")
public class ItemController {

    @Autowired
    ItemRepository itemRepository;
}
