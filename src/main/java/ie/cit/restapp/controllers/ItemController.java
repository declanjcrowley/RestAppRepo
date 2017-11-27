package ie.cit.restapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.cit.restapp.entites.Item;
import ie.cit.restapp.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;

    @RequestMapping("/returnIems")
    public List<Item> returnItems() {
    	/*
    	 * http://http://localhost:8088/returnIems
    	 * 
    	 * returns
    	 * [{"id":1,"name":"Frodo","quantity":10},{"id":2,"name":"F","quantity":11},{"id":3,"name":"Fr","quantity":12}]
    	 */
    	System.out.println("IC.returnAllItems()");
    	return itemRepository.returnAllItems();
    }
}