package com.ethereal.vanillax.objects.items;

import com.ethereal.vanillax.VanillaX;
import com.ethereal.vanillax.init.ItemInit;
import com.ethereal.vanillax.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(VanillaX.creativeTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        VanillaX.proxy.registerItemRenderer(this,0,"inventory");
    }
}
