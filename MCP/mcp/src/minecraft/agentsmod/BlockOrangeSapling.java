package agentsmod;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



import net.minecraftforge.client.*;
import net.minecraftforge.event.terraingen.TerrainGen;


public class BlockOrangeSapling extends BlockFlower
{

        protected BlockOrangeSapling(int i)
        {
                super(i);
                float f = 0.4F;
                //the blockbounds set the hight and x/w of a block.
                setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
                this.setCreativeTab(ModCreativeTabs.tabPlants);
        }

        public void registerIcons(IconRegister par1IconRegister)
        {
            this.blockIcon = par1IconRegister.registerIcon(ModCrops.modid + ":" + (this.getUnlocalizedName().substring(5)));
        }
        
        public Icon getIcon(int par1, int par2)
        {
            return par1 == 0 ? this.blockIcon : this.blockIcon;
        }
        
        public void updateTick(World world, int i, int j, int k, Random random)
        {
                if(world.isRemote)
                {
                        return;
                }
                super.updateTick(world, i, j, k, random);

                if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(7) == 0)
                {
                        int l = world.getBlockMetadata(i, j, k);
                        if((l & 8) == 0)
                        {
                                world.setBlockMetadataWithNotify(i, j, k, l | 8, l);
                        } else
                        {
                                growOrangeTree(world, i, j, k, random);
                        }
                }
        }
        
        public void growOrangeTree(World par1World, int par2, int par3, int par4, Random par5Random)
        {
            if (!TerrainGen.saplingGrowTree(par1World, par5Random, par2, par3, par4)) return;

            int var6 = par1World.getBlockMetadata(par2, par3, par4);
            Object var7 = null;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = false;

                var7 = new WorldGenOrangeTree(true);

            if (var10)
            {
                par1World.setBlock(par2 + var8, par3, par4 + var9, 0);
            }
            else
            {
                par1World.setBlock(par2, par3, par4, 0);
            }

            if (!((WorldGenOrangeTree)var7).generate(par1World, par5Random, par2 + var8, par3, par4 + var9))
            {
                if (var10)
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, var6);
                }
                else
                {
                    par1World.setBlockMetadataWithNotify(par2, par3, par4, this.blockID, var6);
                }
            }
        }


}
