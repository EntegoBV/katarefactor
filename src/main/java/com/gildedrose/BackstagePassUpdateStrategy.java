package com.gildedrose;

public class BackstagePassUpdateStrategy implements UpdateStrategy {
    @Override
    public void update(Item item) {
        if (item.sellIn <= 0) {
            item.quality = 0;
        } else if (item.sellIn <= 5) {
            increaseQuality(item, 3);
        } else if (item.sellIn <= 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item, 1);
        }
        item.sellIn--;
    }

    void increaseQuality(Item item, int amount) {
        for (int i = 0; i < amount; i++) {
            if (item.quality < 50) {
                item.quality++;
            }
        }
    }
}
