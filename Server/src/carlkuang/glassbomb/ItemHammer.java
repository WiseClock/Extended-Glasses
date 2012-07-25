package carlkuang.glassbomb;

import net.minecraft.src.*;

public class ItemHammer extends Item {
	
	public ItemHammer(int par1) {
		super(par1);
        maxStackSize = 1;
        setNoRepair();
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }
	
	public String getTextureFile() {
        return "/carlkuang/icons/items.png";
    }

}
