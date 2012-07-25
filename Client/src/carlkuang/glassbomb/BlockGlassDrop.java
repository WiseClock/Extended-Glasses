package carlkuang.glassbomb;

import java.util.Random;

import net.minecraft.src.BlockGlass;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.mod_ExtendedGlasses;

public class BlockGlassDrop extends BlockGlass {

	public BlockGlassDrop(int par1, int par2, Material par3Material, boolean par4) {
		super(par1, par2, par3Material, par4);
	}
	
	@Override
    public int quantityDropped(Random par1Random)
    {
    	return 0 + par1Random.nextInt(3);
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return mod_ExtendedGlasses.GlassDustID;
    }

}
