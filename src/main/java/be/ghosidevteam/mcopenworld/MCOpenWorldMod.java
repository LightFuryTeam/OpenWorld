package be.ghosidevteam.mcopenworld;

import be.ghosidevteam.mcopenworld.blocks.NetworkPulverizer;
import be.ghosidevteam.mcopenworld.blocks.NetworkSmelter;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MCOpenWorldMod.MODID, name = MCOpenWorldMod.NAME, version = MCOpenWorldMod.VERSION, dependencies = "required-after:appliedenergistics2")
public class MCOpenWorldMod
{
    public static final String MODID = "mc-open-world";
    public static final String NAME = "MC-Open-World";
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
        logger.debug("Registering blocks");
        MinecraftForge.EVENT_BUS.register(NetworkSmelter.class);
        MinecraftForge.EVENT_BUS.register(NetworkPulverizer.class);
    }
}
