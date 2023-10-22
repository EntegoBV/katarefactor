package com.gildedrose;

public class ConjuredUpdateStrategy implements UpdateStrategy {
    private final DefaultUpdateStrategy defaultStrategy = new DefaultUpdateStrategy();

    @Override
    public void update(Item item) {
        defaultStrategy.update(item);
        defaultStrategy.decreaseQuality(item);
    }
}
