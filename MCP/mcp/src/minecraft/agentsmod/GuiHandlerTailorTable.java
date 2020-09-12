package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandlerTailorTable implements IGuiHandler
{
        @Override
        public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
                TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                        case ModGuiTailorTable.guiIdTailorTable: return id == ModGuiTailorTable.guiIdTailorTable && world.getBlockId(x, y, z) == ModGuiTailorTable.TailorTableIdle.blockID ? new ContainerTailorTable(player.inventory, world, x, y, z) : null;
                }
                return null;
                }
        @Override
        public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
        {
                TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
                switch(id)
                {
                        case ModGuiTailorTable.guiIdTailorTable: return id == ModGuiTailorTable.guiIdTailorTable && world.getBlockId(x, y, z) == ModGuiTailorTable.TailorTableIdle.blockID ? new GuiTailorTable(player.inventory, world, x, y, z) : null;
                }
                return null;
        }
}
