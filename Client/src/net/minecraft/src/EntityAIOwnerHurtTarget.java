package net.minecraft.src;

public class EntityAIOwnerHurtTarget extends EntityAITarget
{
    EntityTameable theEntityTameable;
    EntityLiving field_48391_b;

    public EntityAIOwnerHurtTarget(EntityTameable par1EntityTameable)
    {
        super(par1EntityTameable, 32.0F, false);
        this.theEntityTameable = par1EntityTameable;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.theEntityTameable.isTamed())
        {
            return false;
        }
        else
        {
            EntityLiving var1 = this.theEntityTameable.getOwner();

            if (var1 == null)
            {
                return false;
            }
            else
            {
                this.field_48391_b = var1.getLastAttackingEntity();
                return this.isSuitableTarget(this.field_48391_b, false);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.field_48391_b);
        super.startExecuting();
    }
}
