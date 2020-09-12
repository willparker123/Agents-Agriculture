package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerGrinder implements IGuiHandler
{

	public GuiHandlerGrinder()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiGrinder.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiGrinder.guiIdGrinder:
				if (entity instanceof TileEntityGrinder)
				{
					return new ContainerGrinder(player.inventory, (TileEntityGrinder) entity);
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
			case ModGuiGrinder.guiIdGrinder:
				if (entity instanceof TileEntityGrinder)
				{
					return new GuiGrinder(player.inventory, (TileEntityGrinder) entity);
				}
			}
		}

		return null;
	}

}
