package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
public class MergerController {

    DinerRepository dinerRepository;
    PancakeHouseRepository pancakeRepository;

    public MergerController(DinerRepository repository, PancakeHouseRepository repository1) {
        this.dinerRepository = repository;
        this.pancakeRepository = repository1;
    }


    @GetMapping("/merger")
    public List<MenuItem> get(){
        List<MenuItem> menuItems = new ArrayList<>();
        MenuItem[] diner = dinerRepository.getTheMenu();
        List<MenuItem> pancake = pancakeRepository.getTheMenu();
        for(MenuItem item : diner){
            menuItems.add(item);
        }
        for(MenuItem item : pancake){
            menuItems.add(item);
        }

        return menuItems;
    }

    @GetMapping
    public List<MenuItem> getIterator(){
        List<MenuItem> menuItems = new ArrayList<>();
        Iterator lunchItems = dinerRepository.getTheMenuIterator();
        while(lunchItems.hasNext()){
            menuItems.add(lunchItems.next());
        }
        Iterator breakfastItems = pancakeRepository.getTheMenuIterator();
        while(breakfastItems.hasNext()){
            menuItems.add(breakfastItems.next());
        }
        return menuItems;
    }

}
