package mattparks.mods.starcraft.venus.recipe;

import mattparks.mods.starcraft.core.items.SCCoreItems;
import mattparks.mods.starcraft.spacecraftBlocks.SpacecraftBlocks;
import mattparks.mods.starcraft.venus.items.GCVenusItems;
import micdoodle8.mods.galacticraft.api.recipe.CompressorRecipes;
import micdoodle8.mods.galacticraft.core.items.GCCoreItems;
import micdoodle8.mods.galacticraft.core.util.RecipeUtil;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class GCVenusRecipeManager
{
    public static void loadRecipes()
    {
        GCVenusRecipeManager.addUniversalRecipes();
    }

    private static void addUniversalRecipes()
    {
        OreDictionary.registerOre("ingotSulfer", new ItemStack(GCVenusItems.venusItemBasic, 1, 0));
        OreDictionary.registerOre("plateSulfer", new ItemStack(GCVenusItems.venusItemBasic, 1, 2));
        
        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferBoots), new Object[] { "X X", "X X", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2) });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferSword), new Object[] { "X", "X", "Y", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferPickaxe), new Object[] { "XXX", " Y ", " Y ", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferSpade), new Object[] { "X", "Y", "Y", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferHoe), new Object[] { "XX", "Y ", "Y ", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferHoe), new Object[] { "XX", " Y", " Y", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferAxe), new Object[] { "XX", "XY", " Y", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferAxe), new Object[] { "XX", "YX", "Y ", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2), 'Y', Item.stick });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferHelmet), new Object[] { "XXX", "X X", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2) });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferChestplate), new Object[] { "X X", "XXX", "XXX", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2) });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.sulferLeggings), new Object[] { "XXX", "X X", "X X", 'X', new ItemStack(GCVenusItems.venusItemBasic, 1, 2) });

        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.venusBattery, 1, GCVenusItems.venusBattery.getMaxDamage()), new Object[] { " T ", "TRT", "TCT", 'T', "plateSulfer", 'R', Item.redstone, 'C', Item.coal });
        
        RecipeUtil.addRecipe(new ItemStack(SpacecraftBlocks.VenusSulferBlock, 1, 0), new Object[] { "TTT", "TTT", "TTT", 'T', "ingotSulfer",});
        
        RecipeUtil.addRecipe(new ItemStack(SpacecraftBlocks.VenusRedGemBlock, 1, 0), new Object[] { "TTT", "TTT", "TTT", 'T', new ItemStack(SCCoreItems.coreItemBasic, 1, 0)});
        
        RecipeUtil.addRecipe(new ItemStack(GCVenusItems.venusItemBasic, 1, 5), new Object[] { "WXW", "WYW", "WZW", 'X', "compressedSteel", 'Y', Block.glass, 'Z', new ItemStack(GCCoreItems.canister, 1, 0), 'W', "plateSulfer" });
        
        GameRegistry.addShapelessRecipe(new ItemStack(GCVenusItems.venusItemBasic, 9, 0), new ItemStack(SpacecraftBlocks.VenusSulferBlock, 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(SCCoreItems.coreItemBasic, 9, 0), new ItemStack(SpacecraftBlocks.VenusRedGemBlock, 1, 0));
        
        GameRegistry.addShapelessRecipe(new ItemStack(GCVenusItems.venusItemBasic, 1, 4), new ItemStack(GCVenusItems.venusItemBasic, 1, 5), new ItemStack(GCVenusItems.venusItemBasic, 1, 3));
        
        GameRegistry.addShapelessRecipe(new ItemStack(SpacecraftBlocks.VenusBasalt, 1, 0),  new ItemStack(GCVenusItems.venusItemBasic, 1, 7), new ItemStack(GCVenusItems.venusItemBasic, 1, 7), new ItemStack(GCVenusItems.venusItemBasic, 1, 7), new ItemStack(GCVenusItems.venusItemBasic, 1, 7));
        
        GameRegistry.addShapelessRecipe(new ItemStack(SpacecraftBlocks.VenusHalfBasalt, 6, 0), new ItemStack(SpacecraftBlocks.VenusBasalt, 1, 0), new ItemStack(SpacecraftBlocks.VenusBasalt, 1, 0), new ItemStack(SpacecraftBlocks.VenusBasalt, 1, 0));
        
        // Compressor recipes
        
        CompressorRecipes.addShapelessRecipe(new ItemStack(GCVenusItems.venusItemBasic, 1, 2), "ingotSulfer", "ingotSulfer");
        
        CompressorRecipes.addShapelessRecipe(new ItemStack(GCVenusItems.venusItemBasic, 1, 1), new ItemStack(GCVenusItems.venusItemBasic, 1, 2), new ItemStack(GCVenusItems.venusItemBasic, 1, 2) );
        
        // Smelting
       
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusSulferOre.blockID, 0, new ItemStack(GCVenusItems.venusItemBasic, 1, 0), 0.2F);
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusCoalOre.blockID, 0, new ItemStack(Item.coal), 0.2F);
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusIronOre.blockID, 0, new ItemStack(Item.ingotIron), 0.2F);
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusCopperOre.blockID, 0, OreDictionary.getOres("ingotCopper").get(0), 0.2F);
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusTinOre.blockID, 0, OreDictionary.getOres("ingotTin").get(0), 0.2F);
        FurnaceRecipes.smelting().addSmelting(SpacecraftBlocks.VenusRedGemOre.blockID, 0, new ItemStack(SCCoreItems.coreItemBasic, 1, 0), 0.2F);
        FurnaceRecipes.smelting().addSmelting(GCVenusItems.venusItemBasic.itemID, 6, new ItemStack(GCVenusItems.venusItemBasic, 1, 7), 0.2F);
    }
}
