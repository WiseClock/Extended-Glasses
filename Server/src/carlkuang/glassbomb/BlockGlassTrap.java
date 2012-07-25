package carlkuang.glassbomb;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;
import net.minecraft.src.mod_ExtendedGlasses;

public class BlockGlassTrap extends Block {
	
	private double yaxis = 0.0;
	
	public BlockGlassTrap(int par1, int par2, Material par3Material) {
		super(par1, par2, par3Material);
        this.setBlockBounds(0.0F, 0.90F, 0.0F, 1.0F, 0.96F, 1.0F);
	}
	
	@Override
    public int quantityDropped(Random par1Random)
    {
    	return 0;
    }
	
	public boolean isOpaqueCube()
    {
        return false;
    }

	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity){
		if (par5Entity.posY > yaxis) {
			if (par5Entity instanceof EntityLiving && !par5Entity.isSprinting()){
				this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
				par1World.setBlockWithNotify(par2, par3, par4, 0);
				par1World.playAuxSFX(2002, par2, par3, par4, 0);
			}
		}
	}
	
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		yaxis = par3 + 0.90F;
	}
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
		int v1 = par1World.getBlockId(par2, par3 - 1, par4);
		int v2 = par1World.getBlockId(par2, par3 + 1, par4);
		if (v1 != mod_ExtendedGlasses.GlassTrapID && v2 != mod_ExtendedGlasses.GlassTrapID){
			return true;
		}
        return false;
    }
	
	public void addCreativeItems(ArrayList itemList)
    {
    	itemList.add(new ItemStack(this));
    }

}
