package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public final class TabFuels extends CreativeTabs
{
        public TabFuels(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        //sets the image for the creative tab
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
           //there is a diference between items and blocks. will give an example of both
                return Item.coal.itemID;//items
               // return Yourmod.YourBlock.BlockID; for if you want to use a block
        }
   
        //sets the title/name for the creative tab
        public String getTranslatedTabLabel()
        {
         return "\2472(Agent's Agriculture) Fuels";
        }
}
