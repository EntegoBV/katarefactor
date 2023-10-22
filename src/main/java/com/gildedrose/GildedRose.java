package com.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            getUpdateStrategy(item).update(item);
        }
    }

    private UpdateStrategy getUpdateStrategy(Item item) {
        switch (item.name) {
            case "Conjured":
                return new ConjuredUpdateStrategy();
            case "Aged Brie":
                return new AgedBrieUpdateStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassUpdateStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasUpdateStrategy();
            default:
                return new DefaultUpdateStrategy();
        }
    }
}
