package ch.noseryoung;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.noseryoung.Items.Pizza;

public class MoreMaterials implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("more-materials");
	// create an instance of the pizza
	public static final Pizza PIZZA = new Pizza();

	@Override
	public void onInitialize() {
		// register the pizza as an item in Minecraft
		Registry.register(Registries.ITEM, new Identifier("more-materials", "pizza"), PIZZA);

		// add the pizza to a creative mode tab.
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
			content.add(PIZZA);
		});
	}
}