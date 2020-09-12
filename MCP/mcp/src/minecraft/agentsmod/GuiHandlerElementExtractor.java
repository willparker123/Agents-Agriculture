package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerElementExtractor implements IGuiHandler
{

	public GuiHandlerElementExtractor()
	{
		NetworkRegistry.instance().registerGuiHandler(ModGuiElementExtractor.instance, this); //
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		if (entity != null)
		{
			switch(ID)
			{
			case ModGuiElementExtractor.guiIdElementExtractor:
				if (entity instanceof TileEntityElementExtractor)
				{
					return new ContainerElementExtractor(player.inventory, (TileEntityElementExtractor) entity);
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
			case ModGuiElementExtractor.guiIdElementExtractor:
				if (entity instanceof TileEntityElementExtractor)
				{
					return new GuiElementExtractor(player.inventory, (TileEntityElementExtractor) entity);
				}
			}
		}

		return null;
	}

}
