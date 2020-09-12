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

public class BlockPlantLettuce extends BlockFlower
{
public BlockPlantLettuce(int par1, Material grass)
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
	return 0 + par1Random.nextInt(2);
}

public int idDropped(int par1, Random par2Random, int par3)
{
    return ModFruits.lettuceSeed.itemID;
}

public int getRenderType()
{
    return 1;
}

}
