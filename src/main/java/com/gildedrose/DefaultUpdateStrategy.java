package com.gildedrose;

public class DefaultUpdateStrategy implements UpdateStrategy {
    @Override
    public void update(Item item) {
        decreaseQuality(item);
        decreaseSellIn(item);
        if (item.sellIn < 0) {
            decreaseQuality(item);
        }
    }

    void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
