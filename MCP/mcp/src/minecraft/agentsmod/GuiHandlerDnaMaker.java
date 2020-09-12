package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerDnaMaker implements IGuiHandler
{
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
                TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                        case ModGuiDnaMaker.guiIdDnaMaker: return id == ModGuiDnaMaker.guiIdDnaMaker && world.getBlockId(x, y, z) == ModGuiDnaMaker.dnaMakerIdle.blockID ? new ContainerDnaMaker(player.inventory, world, x, y, z) : null;
                }
                return null;
                }
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
                TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                        case ModGuiDnaMaker.guiIdDnaMaker: return id == ModGuiDnaMaker.guiIdDnaMaker && world.getBlockId(x, y, z) == ModGuiDnaMaker.dnaMakerIdle.blockID ? new GuiDnaMaker(player.inventory, world, x, y, z) : null;
                }
                return null;
        }
}
