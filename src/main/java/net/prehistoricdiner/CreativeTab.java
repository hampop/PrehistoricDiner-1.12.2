package net.prehistoricdiner;

import net.prehistoricdiner.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs {
    public CreativeTab() {
        super("prehistoricdiner");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.food_item);
    }
}