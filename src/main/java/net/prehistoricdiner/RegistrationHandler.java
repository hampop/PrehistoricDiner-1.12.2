package net.prehistoricdiner;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.prehistoricdiner.item.ItemDamageableCrafted;

@EventBusSubscriber(
        modid = "prehistoricdiner"
)
public class RegistrationHandler {
    public RegistrationHandler() {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        Item[] items = new Item[]{
                //Example ("amount" is amount of health bars restored, "saturation" is how much it gives you health once hunbger is full (0.5 is about 1-2 hearts).
                ((Item)(new ItemFood(2, 0.5F, false)).setRegistryName("prehistoricdiner", "food_item")).setTranslationKey("prehistoricdiner.food_item").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),

                //Food items:
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_baiera")).setTranslationKey("prehistoricdiner.jam_baiera").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_czekanowskia")).setTranslationKey("prehistoricdiner.jam_czekanowskia").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_nystroemia")).setTranslationKey("prehistoricdiner.jam_nystroemia").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_ginkgoites")).setTranslationKey("prehistoricdiner.jam_ginkgoites").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_phoenicopsis")).setTranslationKey("prehistoricdiner.jam_phoenicopsis").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_polyspermophyllum")).setTranslationKey("prehistoricdiner.jam_polyspermophyllum").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_sphenobaiera")).setTranslationKey("prehistoricdiner.jam_sphenobaiera").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_trichopitys")).setTranslationKey("prehistoricdiner.jam_trichopitys").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(1, 1F, false)).setRegistryName("prehistoricdiner", "jam_umaltolepis")).setTranslationKey("prehistoricdiner.jam_umaltolepis").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemFood(3, 1F, false)).setRegistryName("prehistoricdiner", "grilled_fish_skewer")).setTranslationKey("prehistoricdiner.grilled_fish_skewer").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),


                //Non edible Ingredient Items:
                ((Item)(new Item()).setRegistryName("prehistoricdiner", "flour")).setTranslationKey("prehistoricdiner.flour").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new Item()).setRegistryName("prehistoricdiner", "fiddlehead")).setTranslationKey("prehistoricdiner.fiddlehead").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new Item()).setRegistryName("prehistoricdiner", "pine_nut_oil")).setTranslationKey("prehistoricdiner.pine_nut_oil").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),


                //Non-food items:
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "skillet")).setTranslationKey("prehistoricdiner.skillet").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "pot")).setTranslationKey("prehistoricdiner.pot").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "knife")).setTranslationKey("prehistoricdiner.knife").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "ladle")).setTranslationKey("prehistoricdiner.ladle").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "grinder")).setTranslationKey("prehistoricdiner.grinder").setCreativeTab(PrehistoricDiner.CREATIVE_TAB),
                ((Item)(new ItemDamageableCrafted(32)).setRegistryName("prehistoricdiner", "rolling_pin")).setTranslationKey("prehistoricdiner.rolling_pin").setCreativeTab(PrehistoricDiner.CREATIVE_TAB)


        };
        event.getRegistry().registerAll(items);
    }
}
