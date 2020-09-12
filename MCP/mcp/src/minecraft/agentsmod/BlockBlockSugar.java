package agentsmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockBlockSugar extends Block
{
    
    public BlockBlockSugar(int par1, Material par2)
    {
        super(par1, Material.cactus);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public BlockBlockSugar(int par1, int par2, Material par3Material)
    {
        super(par1, par3Material);
    }

    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(ModBlocks.modid + ":" + (this.getUnlocalizedName().substring(5)));
    }
    /**
     * Called when the falling block entity for this block hits the ground and turns back into a block
     */
    public void onFinishFalling(World par1World, int par2, int par3, int par4, int par5) {}

    public int idDropped(int par1, Random par2Random, int par3)
	{
			return Item.sugar.itemID;
	}

	public int quantityDropped(Random par1Random)
	{
		return 9;
	}
	
    public String getTextureFile()
    {
     return "/agentsmod/blocks.png";
    }
    
    }

