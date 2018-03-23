package be.ghosidevteam.mcopenworld.config;

import be.ghosidevteam.mcopenworld.MCOpenWorldMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class CreativeTab extends CreativeTabs {
    private static CreativeTab instance = null;

    protected CreativeTab() {
        super(MCOpenWorldMod.NAME);
    }

    public static CreativeTab getInstance()
    {
        if (instance == null)
        {
            instance = new CreativeTab();
        }
        return instance;
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.APPLE);
    }
}
