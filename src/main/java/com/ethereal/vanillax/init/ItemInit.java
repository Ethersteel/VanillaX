package com.ethereal.vanillax.init;

import com.ethereal.vanillax.objects.Armor.ArmorBase;
import com.ethereal.vanillax.objects.items.ItemBase;
import com.ethereal.vanillax.objects.tools.*;
import com.ethereal.vanillax.utils.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    //Dragon Glass
    public static final Item.ToolMaterial TOOL_MATERIAL_DRAGON_GLASS = EnumHelper.addToolMaterial("tool_material_dragon_glass",2, 656, 7.0F, 3.0F, 18);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_DRAGON_GLASS = EnumHelper.addArmorMaterial("armor_material_dragon_glass", Reference.MODID + ":dragon_glass",24, new int[]{3, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

    //Items
    public static final Item DRAGON_GLASS = new ItemBase("dragon_glass");

    //Dragon Glass Tools
    public static final Item DRAGON_GLASS_AXE = new ToolAxe("dragon_glass_axe",TOOL_MATERIAL_DRAGON_GLASS);
    public static final Item DRAGON_GLASS_HOE = new ToolHoe("dragon_glass_hoe",TOOL_MATERIAL_DRAGON_GLASS);
    public static final Item DRAGON_GLASS_PICKAXE = new ToolPickaxe("dragon_glass_pickaxe",TOOL_MATERIAL_DRAGON_GLASS);
    public static final Item DRAGON_GLASS_SHOVEL = new ToolShovel("dragon_glass_shovel",TOOL_MATERIAL_DRAGON_GLASS);
    public static final Item DRAGON_GLASS_SWORD = new ToolSword("dragon_glass_sword",TOOL_MATERIAL_DRAGON_GLASS);

    //Dragon Glass Armor
    public static final Item DRAGON_GLASS_HELMET = new ArmorBase("dragon_glass_helmet",ARMOR_MATERIAL_DRAGON_GLASS, 1, EntityEquipmentSlot.HEAD);
    public static final Item DRAGON_GLASS_CHESTPLATE = new ArmorBase("dragon_glass_chestplate",ARMOR_MATERIAL_DRAGON_GLASS, 1, EntityEquipmentSlot.CHEST);
    public static final Item DRAGON_GLASS_LEGGINGS = new ArmorBase("dragon_glass_leggings",ARMOR_MATERIAL_DRAGON_GLASS, 2, EntityEquipmentSlot.LEGS);
    public static final Item DRAGON_GLASS_BOOTS = new ArmorBase("dragon_glass_boots",ARMOR_MATERIAL_DRAGON_GLASS, 1, EntityEquipmentSlot.FEET);
}
