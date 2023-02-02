package net.prehistoricdiner.client;

import net.prehistoricdiner.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(
        value = {Side.CLIENT},
        modid = "prehistoricdiner"
)
public class ModelRegistrationHandler {
    public ModelRegistrationHandler() {
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        //Example:
        registerModel(ModItems.food_item, 0);

        //Food items:
        registerModel(ModItems.grilled_fish_skewer, 0);
        registerModel(ModItems.jam_baiera, 0);
        registerModel(ModItems.jam_czekanowskia, 0);
        registerModel(ModItems.jam_ginkgoites, 0);
        registerModel(ModItems.jam_nystroemia, 0);
        registerModel(ModItems.jam_phoenicopsis, 0);
        registerModel(ModItems.jam_polyspermophyllum, 0);
        registerModel(ModItems.jam_sphenobaiera, 0);
        registerModel(ModItems.jam_trichopitys, 0);
        registerModel(ModItems.jam_umaltolepis, 0);
        registerModel(ModItems.mushroom_fern_coelophysis, 0);


        //Non Edible Ingredient Items:
        registerModel(ModItems.flour, 0);
        registerModel(ModItems.araucaria_flour, 0);
        registerModel(ModItems.scorpion_flour, 0);
        registerModel(ModItems.fiddlehead, 0);
        registerModel(ModItems.pine_nut_oil, 0);




        //Utensils/Tools:
        registerModel(ModItems.skillet, 0);
        registerModel(ModItems.pot, 0);
        registerModel(ModItems.grinder, 0);
        registerModel(ModItems.rolling_pin, 0);
        registerModel(ModItems.knife, 0);
        registerModel(ModItems.ladle, 0);

    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
