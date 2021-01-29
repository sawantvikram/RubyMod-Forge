package com.purplepineapple.rubymod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


public class RubyBlock extends Block {


    public RubyBlock() {

        super(Block.Properties.create(Material.IRON)
        .hardnessAndResistance(5.5f, 30.5f)
        .sound(SoundType.METAL)
        .harvestLevel(4)
        .harvestTool(ToolType.PICKAXE)
        .setRequiresTool()
        );
    }
}
