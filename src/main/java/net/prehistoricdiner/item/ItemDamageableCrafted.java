package net.prehistoricdiner.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDamageableCrafted extends Item {

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack result = stack.copy();
        result.setItemDamage(stack.getItemDamage() + 1);
        return result;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return stack.getItemDamage() < stack.getMaxDamage();
    }
}
