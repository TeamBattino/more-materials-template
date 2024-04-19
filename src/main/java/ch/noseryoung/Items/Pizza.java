package ch.noseryoung.Items;

import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class Pizza extends Item {
    public Pizza() {
        // Settings for Pizza Item:
        super(new Item.Settings().food(FoodComponents.BREAD).maxCount(4));
    }
}