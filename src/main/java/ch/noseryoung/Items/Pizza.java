package ch.noseryoung.Items;

import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class Pizza extends Item {
    public Pizza() {
        // Settings for Pizza Item:
        super(new Item.Settings().food(FoodComponents.BREAD).maxCount(4));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.more-materials.pizza.tooltip"));
    
}