package com.gildedrose;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    class GildedRoseTest {

        private Item[] items;
        private GildedRose app;

        @BeforeEach
        void setUp() {
            items = new Item[]{
                new Item("Aged Brie", 2, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Conjured", 3, 6),
                new Item("Regular Item", 5, 10)
            };
            app = new GildedRose(items);
        }

        @Test
        void agedBrieIncreasesQuality() {
            app.updateQuality();
            assertEquals(1, items[0].quality);
        }

        @Test
        void qualityNeverMoreThanFifty() {
            items[0].quality = 49;
            app.updateQuality();
            app.updateQuality();
            assertEquals(50, items[0].quality);
        }

        @Test
        void sulfurasNeverChanges() {
            app.updateQuality();
            assertEquals(80, items[2].quality);
            assertEquals(0, items[2].sellIn);
        }

        @Test
        void backstagePassesIncreasesQuality() {
            app.updateQuality();
            assertEquals(21, items[1].quality);
        }

}
