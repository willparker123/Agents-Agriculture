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
import net.minecraft.item.Item;
import net.minecraft.src.*;

public class BlockGrass2 extends BlockFlower
{
public BlockGrass2(int par1, Material cloth)
{
         super(par1, Material.cloth);
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

if (r < 0.30)
{
	return ModFruits.cottonSeed.itemID;
}
else if (r < 0.10)
{
	return Item.silk.itemID;
}
else if (r < 0.60)
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
