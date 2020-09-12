package agentsmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockBlockReed extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon blockTop;
    
public BlockBlockReed(int par1, Material grass)
{
         super(par1, Material.grass);
         this.setCreativeTab(CreativeTabs.tabBlock);
}

public Icon getIcon(int par1, int par2)
{
    return par1 == 1 ? this.blockTop : par1 == 0 ? this.blockTop : this.blockIcon;
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
	this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
    this.blockTop = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)) + "2");
}


public int idDropped(int par1, Random par2Random, int par3)
{
		return Item.reed.itemID;
}

public int quantityDropped(Random par1Random)
{
	return 9;
}

}
