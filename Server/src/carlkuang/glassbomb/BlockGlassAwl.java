package carlkuang.glassbomb;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockFlower;
import net.minecraft.src.DamageSource;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class BlockGlassAwl extends BlockFlower implements ITextureProvider {

    public BlockGlassAwl(int par1, int par2)
    {
        super(par1, par2, Material.glass);
        float var3 = 0.4F;
        this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.8F, 0.5F + var3);
    }

    /**
     * Gets passed in the blockID of the block below and supposed to return true if its allowed to grow on the type of
     * blockID passed in. Args: blockID
     */
    public boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Block.sand.blockID || par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.stone.blockID;
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return this.blockIndexInTexture;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return -1;
    }
	
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.attackEntityFrom(DamageSource.cactus, 3);
        if (par5Entity instanceof EntityLiving){
        	((EntityLiving)par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30 * 20, 0));
        }
    }
    
    public String getTextureFile()
    {
        return "/carlkuang/icons/blocks.png";
    }

}
