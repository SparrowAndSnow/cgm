package com.mrcrayfish.guns.datagen;

import com.google.gson.JsonObject;
import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.crafting.WorkbenchIngredient;
import com.mrcrayfish.guns.crafting.WorkbenchRecipeBuilder;
import com.mrcrayfish.guns.init.ModBlocks;
import com.mrcrayfish.guns.init.ModItems;
import com.mrcrayfish.guns.init.ModRecipeSerializers;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class RecipeGen extends RecipeProvider
{
    public RecipeGen(PackOutput output)
    {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer)
    {
        // Dye Item
        consumer.accept(new FinishedRecipe()
        {
            @Override
            public void serializeRecipeData(JsonObject json) {}

            @Override
            public RecipeSerializer<?> getType()
            {
                return ModRecipeSerializers.DYE_ITEM.get();
            }

            @Override
            public ResourceLocation getId()
            {
                return new ResourceLocation(Reference.MOD_ID, "dye_item");
            }

            @Override
            @Nullable
            public JsonObject serializeAdvancement()
            {
                return null;
            }

            @Override
            public ResourceLocation getAdvancementId()
            {
                return null;
            }
        });

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WORKBENCH.get())
                .pattern("CCC")
                .pattern("III")
                .pattern("I I")
                .define('C', Blocks.LIGHT_GRAY_CONCRETE)
                .define('I', Tags.Items.INGOTS_IRON)
                .unlockedBy("has_concrete", has(Blocks.LIGHT_GRAY_CONCRETE))
                .unlockedBy("has_iron", has(Tags.Items.INGOTS_IRON))
                .save(consumer);

        // Guns
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.PISTOL.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 14))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.SHOTGUN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 24))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.RIFLE_TACTICAL.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 24))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.GRENADE_LAUNCHER.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 32))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.BAZOOKA.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 44))
                .addIngredient(Items.REDSTONE, 4)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DYES_RED, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .addCriterion("has_redstone", has(Items.REDSTONE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.MINI_GUN.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 38))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.RIFLE_ASSAULT.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 28))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.PISTOL_AUTO.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 20))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.SNIPER.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.INGOTS_IRON, 36))
                .addCriterion("has_iron_ingot", has(Tags.Items.INGOTS_IRON))
                .build(consumer);

        // Ammo
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.P9.get(), 64)
                .addIngredient(WorkbenchIngredient.of(Items.COPPER_INGOT, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 1))
                .addCriterion("has_copper_ingot", has(Items.COPPER_INGOT))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.R556.get(), 32)
                .addIngredient(WorkbenchIngredient.of(Items.COPPER_INGOT, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 1))
                .addCriterion("has_copper_ingot", has(Items.COPPER_INGOT))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.G12.get(), 48)
                .addIngredient(WorkbenchIngredient.of(Items.COPPER_INGOT, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_GOLD, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 1))
                .addCriterion("has_copper_ingot", has(Items.COPPER_INGOT))
                .addCriterion("has_gold_nugget", has(Tags.Items.NUGGETS_GOLD))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.MISSILE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.GRENADE.get(), 2)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.STUN_GRENADE.get(), 2)
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GUNPOWDER, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_GLOWSTONE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gunpowder", has(Tags.Items.GUNPOWDER))
                .addCriterion("has_glowstone", has(Tags.Items.DUSTS_GLOWSTONE))
                .build(consumer);

        // Scope Attachments
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.SHORT_SCOPE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GEMS_AMETHYST, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_REDSTONE, 2))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_amethyst", has(Tags.Items.GEMS_AMETHYST))
                .addCriterion("has_redstone", has(Tags.Items.DUSTS_REDSTONE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.MEDIUM_SCOPE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GEMS_AMETHYST, 1))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DUSTS_REDSTONE, 4))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_amethyst", has(Tags.Items.GEMS_AMETHYST))
                .addCriterion("has_redstone", has(Tags.Items.DUSTS_REDSTONE))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.LONG_SCOPE.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.GEMS_AMETHYST, 2))
                .addIngredient(WorkbenchIngredient.of(Tags.Items.DYES_BLACK, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_amethyst", has(Tags.Items.GEMS_AMETHYST))
                .addCriterion("has_black_dye", has(Tags.Items.DYES_BLACK))
                .build(consumer);

        // Barrel Attachments
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.SILENCER.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Items.SPONGE, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .build(consumer);

        // Stock Attachments
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.LIGHT_STOCK.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 6))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.TACTICAL_STOCK.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 8))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.WEIGHTED_STOCK.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 12))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);

        // Under Barrel Attachments
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.LIGHT_GRIP.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 4))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);
        WorkbenchRecipeBuilder.crafting(RecipeCategory.COMBAT, ModItems.SPECIALISED_GRIP.get())
                .addIngredient(WorkbenchIngredient.of(Tags.Items.NUGGETS_IRON, 8))
                .addIngredient(WorkbenchIngredient.of(Items.GRAY_WOOL, 1))
                .addCriterion("has_iron_ingot", has(Tags.Items.NUGGETS_IRON))
                .addCriterion("has_gray_wool", has(Items.GRAY_WOOL))
                .build(consumer);
    }
}