package com.gildedrose.model;
import com.gildedrose.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest implements Constants {

    @Test
    void whenItemQualityIsBelowMaximum_enhanceIncreasesItemQualityByOne() {
        Item item = new Item("TestItem", 5, 3);
        item.quality = item.upgradeQualityByOne();
        assertEquals(4, item.quality);
    }

    @Test
    void whenItemQualityIsAtMaximum_enhanceDoesNotChangeQuality() {
        Item item = new Item("TestItem", 5, MAXIMUM_QUALITY);
        item.quality = item.upgradeQualityByOne();
        assertEquals(MAXIMUM_QUALITY, item.quality);
    }

    @Test
    void degradeReducesQualityByOne() {
        Item item = new Item("TestItem", 5, 6);
        item.quality = item.degradeQualityByOne();
        assertEquals(5, item.quality);
    }

}
