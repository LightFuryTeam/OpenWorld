package be.ghosidevteam.aeextensions;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AEExtensionsMod.MODID, name = AEExtensionsMod.NAME, version = AEExtensionsMod.VERSION, dependencies = "required-after:appliedenergistics2")
public class AEExtensionsMod
{
    public static final String MODID = "ae-extendsions";
    public static final String NAME = "AE-Extensions";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
