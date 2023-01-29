package net.prehistoricdiner.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemDamageableCrafted extends Item {

    public ItemDamageableCrafted(int maxDamage) {
        setContainerItem(this);
        setMaxDamage(maxDamage);
    }

    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack itemStack) {
        ItemStack result = itemStack.copy();
        result.setItemDamage(itemStack.getItemDamage() + 1);
        return result;
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack) {
        return stack.getItemDamage() < stack.getMaxDamage();
    }
}
