package agentsmod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;


public final class TabDrinks extends CreativeTabs
{
        public TabDrinks(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        //sets the image for the creative tab
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
           //there is a diference between items and blocks. will give an example of both
                return ModFood.orangejuice.itemID;//items
               // return Yourmod.YourBlock.BlockID; for if you want to use a block
        }
   
        //sets the title/name for the creative tab
        public String getTranslatedTabLabel()
        {
         return "\2472(Agent's Agriculture) Drinks + Sauces";
        }
}
