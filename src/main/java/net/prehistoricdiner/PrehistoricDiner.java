package net.prehistoricdiner;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import net.prehistoricdiner.item.ItemDamageableCrafted;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = "prehistoricdiner",
        version = "1.0"
)
public class PrehistoricDiner {
    public static final String MODID = "prehistoricdiner";
    public static final String NAME = "The Prehistoric Diner";
    public static final String VERSION = "1.0";
    public static final String MCVERSION = "[1.12.2]";
    public static final Logger LOGGER = LogManager.getLogger("prehistoricdiner");
    public static final CreativeTabs CREATIVE_TAB = new CreativeTab();

    public PrehistoricDiner() {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        try {
            for (Object item : Item.REGISTRY) {
                if (item instanceof ItemDamageableCrafted) {
                    String oreDict = ForgeRegistries.ITEMS.getKey((Item)item).toString();
                    OreDictionary.registerOre(oreDict, new ItemStack((Item) item, 1));
                    int i = 1;
                    while (i <= ((ItemDamageableCrafted) item).getMaxDamage()) {
                        ItemStack stack = new ItemStack((Item) item, 1);
                        stack.setItemDamage(i);
                        OreDictionary.registerOre(oreDict, stack);
                        i ++;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
