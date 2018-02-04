package com.ethereal.vanillax.objects.creativetab;

import com.ethereal.vanillax.init.ItemInit;
import com.ethereal.vanillax.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTab extends CreativeTabs {

    public ModCreativeTab() {
        super(Reference.MODID);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.DRAGON_GLASS_HELMET);
    }
}
