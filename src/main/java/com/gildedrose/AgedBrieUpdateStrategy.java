package com.gildedrose;

public class AgedBrieUpdateStrategy implements UpdateStrategy {
    @Override
    public void update(Item item) {
        increaseQuality(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            increaseQuality(item);
        }
    }

    void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
