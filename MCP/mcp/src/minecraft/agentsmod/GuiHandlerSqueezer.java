package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerSqueezer implements IGuiHandler
{

	public GuiHandlerSqueezer()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiSqueezer.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiSqueezer.guiIdSqueezer:
				if (entity instanceof TileEntitySqueezer)
				{
					return new ContainerSqueezer(player.inventory, (TileEntitySqueezer) entity);
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
			case ModGuiSqueezer.guiIdSqueezer:
				if (entity instanceof TileEntitySqueezer)
				{
					return new GuiSqueezer(player.inventory, (TileEntitySqueezer) entity);
				}
			}
		}

		return null;
	}

}
