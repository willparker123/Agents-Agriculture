package agentsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

@Cancelable
@Event.HasResult
public class FertiliserEvent extends PlayerEvent
{
    /**
     * This event is called when a player attempts to use Bonemeal on a block.
     * It can be canceled to completely prevent any further processing.
     * 
     * You can also set the result to ALLOW to mark the event as processed 
     * and use up a bonemeal from the stack but do no further processing.
     * 
     * setResult(ALLOW) is the same as the old setHandeled()
     */

    public final World world;
    public final int ID;
    public final int X;
    public final int Y;
    public final int Z;
    
    public FertiliserEvent(EntityPlayer player, World world, int id, int x, int y, int z)
    {
        super(player);
        this.world = world;
        this.ID = id;
        this.X = x;
        this.Y = y;
        this.Z = z;
    }
    
    
}

