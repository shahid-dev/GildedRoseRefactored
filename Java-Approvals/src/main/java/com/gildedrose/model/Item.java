package com.gildedrose.model;

import com.gildedrose.Constants;

public class Item implements Constants {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public int upgradeQualityByOne() {
        if(this.quality < 50)
            return this.quality + 1;
        return this.quality;
    }

    public int degradeQualityByOne() {
        return this.quality - 1;
    }

}
