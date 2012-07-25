package carlkuang.glassbomb;

import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EntityThrowable;
import net.minecraft.src.ItemStack;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;
import net.minecraft.src.mod_ExtendedGlasses;

public class EntityPoweredGlassSack extends EntityThrowable {

    public EntityPoweredGlassSack(World par1World)
    {
        super(par1World);
    }

    public EntityPoweredGlassSack(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntityPoweredGlassSack(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
    	if (par1MovingObjectPosition.entityHit != null){
    		byte var2 = 5;
    		if (par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), var2))
            {
                ;
            }
    	}
        if (!this.worldObj.isRemote)
        {
            this.worldObj.playSoundEffect((double)this.posX + 0.5D, (double)this.posY + 0.5D, (double)this.posZ + 0.5D, "random.glass", 1.0F, this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
        	this.setDead();
        	if (this.worldObj.rand.nextFloat() <= 0.1) {
        		worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(mod_ExtendedGlasses.PoweredGlassSack)));
        	}else{
        		worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX, this.posY, this.posZ, new ItemStack(mod_ExtendedGlasses.GunnySack)));
        		int drop = this.worldObj.rand.nextInt(7);
        		for (int i = 0; i<drop; i++){
        			worldObj.spawnEntityInWorld(new EntityItem(worldObj, this.posX + worldObj.rand.nextDouble(), this.posY + worldObj.rand.nextDouble(), this.posZ + worldObj.rand.nextDouble(), new ItemStack(mod_ExtendedGlasses.GlassDust)));
        		}
        	}
        }
    }
}
