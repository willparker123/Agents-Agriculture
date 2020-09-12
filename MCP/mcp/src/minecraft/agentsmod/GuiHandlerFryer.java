package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerFryer implements IGuiHandler
{

	public GuiHandlerFryer()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiFryer.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiFryer.guiIdFryer:
				if (entity instanceof TileEntityFryer)
				{
					return new ContainerFryer(player.inventory, (TileEntityFryer) entity);
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
			case ModGuiFryer.guiIdFryer:
				if (entity instanceof TileEntityFryer)
				{
					return new GuiFryer(player.inventory, (TileEntityFryer) entity);
				}
			}
		}

		return null;
	}

}
