package carlkuang.glassbomb;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;

public class ItemGlassDust extends Item implements ITextureProvider {

	public ItemGlassDust(int par1) {
		super(par1);
        maxStackSize = 64;
	}
	
	public String getTextureFile() {
        return "/carlkuang/icons/items.png";
    }

}
