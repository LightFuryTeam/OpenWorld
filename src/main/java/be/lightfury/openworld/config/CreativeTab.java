package be.lightfury.openworld.config;

import be.lightfury.openworld.OpenWorld;
import net.minecraft.client.gui.screen.inventory.CreativeScreen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class CreativeTab extends Creative {
    private static CreativeTab instance = null;

    protected CreativeTab() {
        super(OpenWorld.NAME);
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
