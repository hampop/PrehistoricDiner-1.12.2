package net.prehistoricdiner;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(
        modid = "prehistoricdiner"
)
public class RegistrationHandler {
    public RegistrationHandler() {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item[] items = new Item[]{
                ((Item)(new ItemFood(2, 2F, false)).setRegistryName("prehistoricdiner", "food_item")).setTranslationKey("prehistoricdiner.food_item").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),


        };
        event.getRegistry().registerAll(items);
    }
}
