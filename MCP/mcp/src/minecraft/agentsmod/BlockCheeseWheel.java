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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCheeseWheel extends Block
{
public BlockCheeseWheel(int par1, Material par2)
{
         super(par1, Material.pumpkin);
         this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.3F, 0.9F);
         this.setLightOpacity(1);
         this.setCreativeTab(CreativeTabs.tabBlock);
}

public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
}

public void onEntityWalking(World world, int x, int y, int z, Entity entity)
{
	// Add to the entities upward velocity to send them up into the air
	entity.motionY += 0.8;
}

public void setBlockBoundsForItemRender()
{
    this.setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 0.3F, 0.9F);
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
		return ModFood.cheesewheel.itemID;
}

public int quantityDropped(Random par1Random)
{
	return 1;
}

public int idPicked(World par1World, int par2, int par3, int par4)
{
    return ModFood.cheesewheel.itemID;
}

}
