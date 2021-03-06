package com.ethereal.vanillax.objects.tools;

import com.ethereal.vanillax.VanillaX;
import com.ethereal.vanillax.init.ItemInit;
import com.ethereal.vanillax.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

    public ToolHoe(String name, ToolMaterial material) {
        super(material);
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
