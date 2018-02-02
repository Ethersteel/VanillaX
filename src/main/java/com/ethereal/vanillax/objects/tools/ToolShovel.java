package com.ethereal.vanillax.objects.tools;

import com.ethereal.vanillax.VanillaX;
import com.ethereal.vanillax.init.ItemInit;
import com.ethereal.vanillax.utils.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolShovel extends ItemSpade implements IHasModel {

    public ToolShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        VanillaX.proxy.registerItemRenderer(this,0,"inventory");
    }
}
