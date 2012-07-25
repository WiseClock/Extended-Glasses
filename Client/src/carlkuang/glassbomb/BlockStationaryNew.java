package carlkuang.glassbomb;

import net.minecraft.src.*;

public class BlockStationaryNew extends BlockStationary
{
    public BlockStationaryNew(int par1, Material par2Material)
    {
        super(par1, par2Material);
        this.setTickRandomly(false);

        if (par2Material == Material.lava)
        {
            this.setTickRandomly(true);
        }
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity){
    	if (par5Entity instanceof EntityLiving && par5Entity.isSprinting() && this.blockMaterial != Material.lava){
    		par5Entity.motionY = 0.2F;
    	}
    }

}
