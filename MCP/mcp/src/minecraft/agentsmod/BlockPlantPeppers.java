package agentsmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.world.World;

public class BlockPlantPeppers extends BlockFlower
{
public BlockPlantPeppers(int par1, Material par2)
{
         super(par1, Material.grass);
         this.setCreativeTab(CreativeTabs.tabAllSearch);
}
public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)));
}


public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
{
	super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);

	if (par1World.isRemote)
		{
		 return;
		}

	int i = 1 + par7;

	for (int j = 0; j < i; j++)
		{
		if (par1World.rand.nextInt(2) == 0)
			{
			 float f = 0.7F;
			 float f1 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
			float f2 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
			float f3 = par1World.rand.nextFloat() * f + (1.0F - f) * 0.5F;
			 EntityItem entityitem = new EntityItem(par1World, (float)par2 + f1, (float)par3 + f2, (float)par4 + f3, new ItemStack(ModFruits.peppersSeed));
entityitem.delayBeforeCanPickup = 10;
par1World.spawnEntityInWorld(entityitem);
}
}
}

public int quantityDropped(Random par1Random)
{
	return 1 + par1Random.nextInt(2);
}

public int idDropped(int par1, Random par2Random, int par3)
{
    return ModFruits.pepperGreen.itemID;
}


public int getRenderType()
{
    return 1;
}


}
