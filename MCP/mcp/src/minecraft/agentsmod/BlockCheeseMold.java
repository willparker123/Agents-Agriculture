package agentsmod;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCheeseMold extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon blockTop;
    
public BlockCheeseMold(int par1, Material par2)
{
         super(par1, Material.rock);
         this.setCreativeTab(CreativeTabs.tabBlock);
         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
         this.setLightOpacity(255);
}

public Icon getIcon(int par1, int par2)
{
    return par1 == 1 ? this.blockTop : this.blockIcon;
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
	this.blockIcon = par1IconRegister.registerIcon((ModBlocks.modid) + ":" + (this.getUnlocalizedName().substring(5)));
    this.blockTop = par1IconRegister.registerIcon((ModBlocks.modid) + ":" + (this.getUnlocalizedName().substring(5)) + "2");
}

public void setBlockBoundsForItemRender()
{
    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
    //0F 0F 0F Width Height Length
}

public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
{
    this.setBlockBoundsBasedOnState(par1World, par2, par3, par4);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
}

public boolean renderAsNormalBlock()
{
    return false;
}

public boolean isOpaqueCube()
{
    return false;
}

public int idDropped(int par1, Random par2Random, int par3)
{
		return ModTools.cheesemold.itemID;
}

public int quantityDropped(Random par1Random)
{
	return 1;
}

public int idPicked(World par1World, int par2, int par3, int par4)
{
    return ModTools.cheesemold.itemID;
}

}
