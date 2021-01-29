package com.purplepineapple.rubymod.util;

import com.purplepineapple.rubymod.RubyMod;
import com.purplepineapple.rubymod.blocks.BlockItemBase;
import com.purplepineapple.rubymod.blocks.RubyBlock;
import com.purplepineapple.rubymod.items.ItemBase;
import com.purplepineapple.rubymod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RubyMod.MOD_ID);

    public static void init(){

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Ruby Item
    public static final RegistryObject<Item> RUBY =ITEMS.register("ruby", ItemBase::new);

    //Ruby Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 5, -2.4F, new Item.Properties().group(ItemGroup.COMBAT)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 1, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 11, 1.0f, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 5, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, 1, -1.0f, new Item.Properties().group(ItemGroup.TOOLS)));


    //Ruby Block/Ruby Ore
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);

    //Ruby Block Item/Ruby Ore Item
    public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(RUBY_BLOCK.get()));
}
