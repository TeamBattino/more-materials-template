package ch.noseryoung.Items;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class Pizza extends Item {
    public Pizza() {
        // Settings for Pizza Item:
        super(new Item.Settings().food(FoodComponents.BREAD).maxCount(4));
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(Text.translatable("item.tutorial.custom_item.tooltip"));
    }
}