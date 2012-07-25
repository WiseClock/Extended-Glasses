package carlkuang.glassbomb;

import net.minecraft.src.Material;
import net.minecraft.src.forge.ITextureProvider;

public class BlockShinyGlass extends BlockGlassDrop implements ITextureProvider {

	public BlockShinyGlass(int par1, int par2, Material par3Material, boolean par4) {
		super(par1, par2, par3Material, par4);
	}

	public String getTextureFile() {
        return "/carlkuang/icons/blocks.png";
    }
}
