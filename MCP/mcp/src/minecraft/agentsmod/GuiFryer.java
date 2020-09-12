package agentsmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.I18n;

public class GuiFryer extends GuiContainer
{
	public static final ResourceLocation fryertexture = new ResourceLocation("modguifryer" + ":" + "textures/gui/fryer.png");
	
	public TileEntityFryer Fryer;
	
	public GuiFryer(InventoryPlayer inventoryPlayer, TileEntityFryer entity)
	{
		super(new ContainerFryer(inventoryPlayer, entity));
		
		this.Fryer = entity;
		
		this.xSize = 176;
		this.ySize = 198;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2)
	{
		String name = this.Fryer.isInvNameLocalized() ? this.Fryer.getInvName() : this.Fryer.getInvName();
		
		this.fontRenderer.drawString(name, this.xSize / 2 - this.fontRenderer.getStringWidth(name) / 2, 6, 4210752);
		this.fontRenderer.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(fryertexture);
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        
        if(this.Fryer.isBurning())
        {
        	int k = this.Fryer.getBurnTimeRemainingScaled(14);
        	this.drawTexturedModalRect(guiLeft + 80, guiTop + 78 + 14 - k, 176 , 14 - k, 10, k + 0);
        }
        
        int k = this.Fryer.getCookProgressScaled(10);
        this.drawTexturedModalRect(guiLeft + 82, guiTop + 42, 176 , 14, k + 1, 26);
	}

}
