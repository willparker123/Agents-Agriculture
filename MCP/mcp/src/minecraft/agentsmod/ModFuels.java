
package agentsmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="ModFuels", name="Agent's Mod", version="Alpha")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class ModFuels {
	
	public static final String modid = "ModFuels";

	public static Item organicfuel;
	public static Item organicfuel2;
	public static Item organicfuel3;
	public static Item firefuel;
	public static Item firefuel2;
	public static Item firefuel3;
	
	
	public static Block organicfuelBlock;
	public static Block organicfuelBlock2;
	public static Block organicfuelBlock3;
	public static Block firefuelBlock;
	public static Block firefuelBlock2;
	public static Block firefuelBlock3;
	
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	

	// The instance of your mod that Forge uses.
	@Instance("ModFuels")
	public static ModFuels instance;
	// This loads up your common and client proxies. change the location of the proxies and the public static to fit your setup
	@SidedProxy(clientSide="agentsmod.ClientProxy", serverSide="agentsmod.CommonProxy")
	public static CommonProxy proxy;
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{	
		organicfuel = new ItemFuel(ModConfig.organicfuelID).setUnlocalizedName("organicfuel");
		LanguageRegistry.addName(organicfuel, "Organic Coal");
		
		organicfuel2 = new ItemFuel(ModConfig.organicfuel2ID).setUnlocalizedName("organicfuel2");
		LanguageRegistry.addName(organicfuel2, "Organismal Coal");
		
		organicfuel3 = new ItemFuel(ModConfig.organicfuel3ID).setUnlocalizedName("organicfuel3");
		LanguageRegistry.addName(organicfuel3, "Biotic Coal");
		
		
		
		organicfuelBlock = new BlockFuel(ModConfig.organicfuelBlockID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(1.6F).setResistance(4.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("organicfuelBlock");
		GameRegistry.registerBlock(organicfuelBlock);
		LanguageRegistry.addName(organicfuelBlock, "Organic Coal Block");
		
		organicfuelBlock2 = new BlockFuel(ModConfig.organicfuelBlock2ID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(2.6F).setResistance(6.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("organicfuelBlock2");
		GameRegistry.registerBlock(organicfuelBlock2);
		LanguageRegistry.addName(organicfuelBlock2, "Organismal Coal Block");
		
		organicfuelBlock3 = new BlockFuel(ModConfig.organicfuelBlock3ID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(8.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("organicfuelBlock3");
		GameRegistry.registerBlock(organicfuelBlock3);
		LanguageRegistry.addName(organicfuelBlock3, "Biotic Coal Block");
		
		
		
		firefuel = new ItemFuel(ModConfig.firefuelID).setUnlocalizedName("firefuel");
		LanguageRegistry.addName(firefuel, "Fiery Coal");
		
		firefuel2 = new ItemFuel(ModConfig.firefuel2ID).setUnlocalizedName("firefuel2");
		LanguageRegistry.addName(firefuel2, "Blazing Coal");
		
		firefuel3 = new ItemFuel(ModConfig.firefuel3ID).setUnlocalizedName("firefuel3");
		LanguageRegistry.addName(firefuel3, "Inferno Coal");
		
		
		
		firefuelBlock = new BlockFuel(ModConfig.firefuelBlockID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(1.6F).setResistance(4.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("firefuelBlock");
		GameRegistry.registerBlock(firefuelBlock);
		LanguageRegistry.addName(firefuelBlock, "Fiery Coal Block");
		
		firefuelBlock2 = new BlockFuel(ModConfig.firefuelBlock2ID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(2.6F).setResistance(6.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("firefuelBlock2");
		GameRegistry.registerBlock(firefuelBlock2);
		LanguageRegistry.addName(firefuelBlock2, "Blazing Coal Block");
		
		firefuelBlock3 = new BlockFuel(ModConfig.firefuelBlock3ID, Material.rock).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(8.0F).setCreativeTab(ModCreativeTabs.tabFuels).setUnlocalizedName("firefuelBlock3");
		GameRegistry.registerBlock(firefuelBlock3);
		LanguageRegistry.addName(firefuelBlock3, "Inferno Coal Block");
	}

	@Init
	public void load (FMLInitializationEvent event)
	{
		//GameRegistry.addShapelessRecipe(new ItemStack(ModFruits.weedCrushed, 1), new Object[]{new ItemStack(ModTools.foodgrinder, 1, WILDCARD_VALUE), new ItemStack(ModFruits.weedDry)}); 
		//GameRegistry.addSmelting(Block.planks.blockID, new ItemStack(ModFruits.ash), 0.4f);
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel), new Object[] {"YXY", "XGX", "YXY", 'G', Item.coal, 'X', Item.seeds, 'Y', ModFruits.ash});
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel), new Object[] {"YXY", "XGX", "YXY", 'G', Item.coal, 'Y', Item.seeds, 'X', ModFruits.ash});
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel2), new Object[] {"YXY", "XGX", "YXY", 'G', new ItemStack(Item.dyePowder,1,15), 'X', ModFuels.organicfuel, 'Y', ModFruits.ash});
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel3), new Object[] {"YXY", "XGX", "YXY", 'G', new ItemStack(Item.dyePowder,1,15), 'X', ModFuels.organicfuel2, 'Y', ModFruits.ash});
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel2), new Object[] {"YXY", "XGX", "YXY", 'G', new ItemStack(Item.dyePowder,1,15), 'Y', ModFuels.organicfuel, 'X', ModFruits.ash});
		GameRegistry.addRecipe(new ItemStack(ModFuels.organicfuel3), new Object[] {"YXY", "XGX", "YXY", 'G', new ItemStack(Item.dyePowder,1,15), 'Y', ModFuels.organicfuel2, 'X', ModFruits.ash});
		
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel), new Object[] {"YXY", "XGX", "YXY", 'G', Item.bucketLava, 'X', Item.coal, 'Y', Item.fireballCharge});
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel), new Object[] {"YXY", "XGX", "YXY", 'G', Item.bucketLava, 'Y', Item.coal, 'X', Item.fireballCharge});
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel2), new Object[] {"XXX", "YGY", "XXX", 'G', new ItemStack(Item.bucketLava), 'X', ModFuels.organicfuel, 'Y', Item.coal});
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel3), new Object[] {"XXX", "YGY", "XXX", 'G', new ItemStack(Item.bucketLava), 'X', ModFuels.organicfuel2, 'Y', Item.coal});
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel2), new Object[] {"XXX", "YGY", "XXX", 'G', new ItemStack(Item.bucketLava), 'Y', ModFuels.organicfuel, 'X', Item.coal});
		GameRegistry.addRecipe(new ItemStack(ModFuels.firefuel3), new Object[] {"XXX", "YGY", "XXX", 'G', new ItemStack(Item.bucketLava), 'Y', ModFuels.organicfuel2, 'X', Item.coal});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuel, 9), new Object[]{new ItemStack(ModFuels.organicfuelBlock)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuel2, 9), new Object[]{new ItemStack(ModFuels.organicfuelBlock2)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuel3, 9), new Object[]{new ItemStack(ModFuels.organicfuelBlock3)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuelBlock, 1), new Object[]{new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel), new ItemStack(ModFuels.organicfuel)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuelBlock2, 1), new Object[]{new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2), new ItemStack(ModFuels.organicfuel2)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.organicfuelBlock3, 1), new Object[]{new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3), new ItemStack(ModFuels.organicfuel3)}); 
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuel, 9), new Object[]{new ItemStack(ModFuels.firefuelBlock)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuel2, 9), new Object[]{new ItemStack(ModFuels.firefuelBlock2)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuel3, 9), new Object[]{new ItemStack(ModFuels.firefuelBlock3)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuelBlock, 1), new Object[]{new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel), new ItemStack(ModFuels.firefuel)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuelBlock2, 1), new Object[]{new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2), new ItemStack(ModFuels.firefuel2)}); 
		GameRegistry.addShapelessRecipe(new ItemStack(ModFuels.firefuelBlock3, 1), new Object[]{new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3), new ItemStack(ModFuels.firefuel3)}); 
		
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		// this is the post initialization.
	}
}