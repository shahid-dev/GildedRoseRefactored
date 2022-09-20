package com.gildedrose;

import com.gildedrose.model.Item;

import static com.gildedrose.Constants.*;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;

    }

    public void updateQuality() {
        for(Item item: items) {
            if (!(AGED_BRIE).equals(item.name)
                && !(BACKSTAGE_PASSES).equals(item.name)){
                if (item.quality > MINIMUM_QUALITY && !(SULFURAS).equals(item.name)) {
                    item.degradeQualityByOne();
                }
            }
            else if (item.quality < MAXIMUM_QUALITY) {
                item.upgradeQualityByOne();
                if ((BACKSTAGE_PASSES).equals(item.name)
                    && item.sellIn < 11
                    && item.quality < MAXIMUM_QUALITY) {
                    item.upgradeQualityByOne();
                }
                if (item.sellIn < 6 && item.quality < MAXIMUM_QUALITY) {
                    item.upgradeQualityByOne();
                }
            }
            if (!(SULFURAS).equals(item.name)) {
                item.sellIn = item.sellIn -1;
            }

            if (item.sellIn < MINIMUM_QUALITY) {
                if (!(AGED_BRIE).equals(item.name)) {
                    if (!(BACKSTAGE_PASSES).equals(item.name)) {
                        if (item.quality > MINIMUM_QUALITY && !(SULFURAS).equals(item.name)) {
                            item.degradeQualityByOne();
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < MAXIMUM_QUALITY) {
                        item.upgradeQualityByOne();
                    }
                }
            }
        }
    }

}
