package be.ghosidevteam.mcopenworld.blocks;

import be.ghosidevteam.mcopenworld.config.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseOpenWorldBlock extends Block {

    protected BaseOpenWorldBlock(Material materialIn) {
        super(materialIn);

        setLightOpacity(255);
        setLightLevel(0);
        setHardness(2.2F);
        setHarvestLevel("pickaxe", 0);

        setCreativeTab(CreativeTab.getInstance());
    }
}
