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

public class BlockPlantCorn extends BlockFlower
{
public BlockPlantCorn(int par1, Material grass)
{
         super(par1, Material.grass);
         this.setCreativeTab(CreativeTabs.tabAllSearch);
}

public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)));
}

public int quantityDropped(Random par1Random)
{
	return 0 + par1Random.nextInt(3);
}

public int idDropped(int par1, Random par2Random, int par3)
{
    return ModFruits.cornSeed.itemID;
}

public int quantityDropped1(Random par1Random)
{
	return 2 + par1Random.nextInt(3);
}

public int idDropped1(int par1, Random par2Random, int par3)
{
    return ModFruits.corn.itemID;
}

public int getRenderType()
{
    return 1;
}

}
