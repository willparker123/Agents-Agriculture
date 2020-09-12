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
import net.minecraft.src.*;

public class BlockGrass1 extends BlockFlower
{
public BlockGrass1(int par1, Material grass)
{
         super(par1, Material.grass);
         this.setCreativeTab(CreativeTabs.tabAllSearch);
         this.setCreativeTab(ModCreativeTabs.tabPlants);
}


public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)));
}

public int idDropped(int par1, Random par2Random, int par3)
{

double r = Math.random();

if (r < 0.05)
{
	return ModFruits.riceSeed.itemID;
}
else if (r < 0.25)
{
	return ModFruits.barleySeed.itemID;
}
else if (r < 0.70)
{
	return 0;
}
else
{
	return 0;
}
}


public int getRenderType()
{
    return 1;
}


}
