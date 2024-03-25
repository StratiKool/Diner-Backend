package edu.iu.habahram.DinerPancakeHouseMerge.model;

import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;

import java.util.List;

public class PancakeHouseIterator implements Iterator{

    List<MenuItem> menuItems;

    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuItem next() {
        return null;
    }
}
