package mattparks.mods.starcraft.core.items;

import mattparks.mods.starcraft.core.SCCoreConfigManager;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class SCCoreItems
{
    public static Item coreItemBasic;
    public static Item gemPickaxe;
    public static Item gemAxe;
    public static Item gemHoe;
    public static Item gemSpade;
    public static Item gemSword;
    public static Item jetpack;
    public static Item gemHelmet;
    public static Item gemChestplate;
    public static Item gemLeggings;
    public static Item gemBoots;

    public static Item spaceshipT4;
    public static Item spaceshipT5;
    public static Item rocketEngine;
//    public static Item schematic;

    public static EnumArmorMaterial ARMORGEM = EnumHelper.addArmorMaterial("GEM", 42, new int[] { 4, 9, 7, 4 }, 12);
    public static EnumToolMaterial TOOLGEM = EnumHelper.addToolMaterial("GEM", 3, 1024, 5.0F, 2.5F, 8);
    public static EnumArmorMaterial ARMORJETPACK = EnumHelper.addArmorMaterial("JETPACK", 200, new int[] {0, 0, 0, 0}, 0);
    
    public static void initItems()
    {
        SCCoreItems.coreItemBasic = new SCCoreItem(SCCoreConfigManager.idItemVenusBasic);
        SCCoreItems.gemPickaxe = new SCCoreItemPickaxe(SCCoreConfigManager.idToolGemPickaxe, SCCoreItems.TOOLGEM).setUnlocalizedName("gemPick");
        SCCoreItems.gemAxe = new SCCoreItemAxe(SCCoreConfigManager.idToolGemAxe, SCCoreItems.TOOLGEM).setUnlocalizedName("gemAxe");
        SCCoreItems.gemHoe = new SCCoreItemHoe(SCCoreConfigManager.idToolGemHoe, SCCoreItems.TOOLGEM).setUnlocalizedName("gemHoe");
        SCCoreItems.gemSpade = new SCCoreItemSpade(SCCoreConfigManager.idToolGemSpade, SCCoreItems.TOOLGEM).setUnlocalizedName("gemSpade");
        SCCoreItems.gemSword = new SCCoreItemSword(SCCoreConfigManager.idToolGemSword, SCCoreItems.TOOLGEM).setUnlocalizedName("gemSword");

        SCCoreItems.jetpack = new SCCoreItemJetpack(SCCoreConfigManager.idArmorJetpack, SCCoreItems.ARMORJETPACK, 11, 1, false).setUnlocalizedName("jetpack");
        
        SCCoreItems.gemHelmet = new SCCoreItemArmor(SCCoreConfigManager.idArmorGemHelmet, SCCoreItems.ARMORGEM, 7, 0, false).setUnlocalizedName("gemHelmet");
        SCCoreItems.gemChestplate = new SCCoreItemArmor(SCCoreConfigManager.idArmorGemChestplate, SCCoreItems.ARMORGEM, 7, 1, false).setUnlocalizedName("gemChestplate");
        SCCoreItems.gemLeggings = new SCCoreItemArmor(SCCoreConfigManager.idArmorGemLeggings, SCCoreItems.ARMORGEM, 7, 2, false).setUnlocalizedName("gemLeggings");
        SCCoreItems.gemBoots = new SCCoreItemArmor(SCCoreConfigManager.idArmorGemBoots, SCCoreItems.ARMORGEM, 7, 3, false).setUnlocalizedName("gemBoots");

        SCCoreItems.spaceshipT4 = new SCCoreItemSpaceshipTier4(SCCoreConfigManager.idItemSpaceshipTier4).setUnlocalizedName("spaceshipTier4");
        SCCoreItems.spaceshipT5 = new SCCoreItemSpaceshipTier5(SCCoreConfigManager.idItemSpaceshipTier5).setUnlocalizedName("spaceshipTier5");
        
        SCCoreItems.rocketEngine = new SCCoreItemRocketParts(SCCoreConfigManager.idItemRocketEngine, "engine");
//        SCCoreItems.schematic = new SCCoreItemSchematic(SCCoreConfigManager.idItemSchematicMars).setUnlocalizedName("schematic");
    }
    
    public static void registerHarvestLevels()
    {
    }
}