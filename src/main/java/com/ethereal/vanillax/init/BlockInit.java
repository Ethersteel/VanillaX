package com.ethereal.vanillax.init;

import com.ethereal.vanillax.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block DRAGON_GLASS_BLOCK = new BlockBase("dragon_glass_block", Material.IRON);
}
