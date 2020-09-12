package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerSeedExtractor implements IGuiHandler
{

	public GuiHandlerSeedExtractor()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiSeedExtractor.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiSeedExtractor.guiIdSeedExtractor:
				if (entity instanceof TileEntitySeedExtractor)
				{
					return new ContainerSeedExtractor(player.inventory, (TileEntitySeedExtractor) entity);
				}
			}
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiSeedExtractor.guiIdSeedExtractor:
				if (entity instanceof TileEntitySeedExtractor)
				{
					return new GuiSeedExtractor(player.inventory, (TileEntitySeedExtractor) entity);
				}
			}
		}

		return null;
	}

}
