package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerDnaFabricator implements IGuiHandler
{

	public GuiHandlerDnaFabricator()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiDnaFabricator.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiDnaFabricator.guiIdDnaFabricator:
				if (entity instanceof TileEntityDnaFabricator)
				{
					return new ContainerDnaFabricator(player.inventory, (TileEntityDnaFabricator) entity);
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
			case ModGuiDnaFabricator.guiIdDnaFabricator:
				if (entity instanceof TileEntityDnaFabricator)
				{
					return new GuiDnaFabricator(player.inventory, (TileEntityDnaFabricator) entity);
				}
			}
		}

		return null;
	}

}
