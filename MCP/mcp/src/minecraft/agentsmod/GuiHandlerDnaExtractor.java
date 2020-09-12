package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerDnaExtractor implements IGuiHandler
{

	public GuiHandlerDnaExtractor()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiDnaExtractor.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiDnaExtractor.guiIdDnaExtractor:
				if (entity instanceof TileEntityDnaExtractor)
				{
					return new ContainerDnaExtractor(player.inventory, (TileEntityDnaExtractor) entity);
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
			case ModGuiDnaExtractor.guiIdDnaExtractor:
				if (entity instanceof TileEntityDnaExtractor)
				{
					return new GuiDnaExtractor(player.inventory, (TileEntityDnaExtractor) entity);
				}
			}
		}

		return null;
	}

}
