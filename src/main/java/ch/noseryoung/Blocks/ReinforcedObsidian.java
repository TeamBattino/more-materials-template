package ch.noseryoung.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class ReinforcedObsidian extends Block {
    public ReinforcedObsidian() {
        super(FabricBlockSettings.create().hardness(60));
    }
}
