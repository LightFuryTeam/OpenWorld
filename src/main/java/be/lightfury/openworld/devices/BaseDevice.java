package be.lightfury.openworld.devices;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

class BaseOpenWorldBlock extends Block {

    protected BaseOpenWorldBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(15f, 25f));
    }
}
