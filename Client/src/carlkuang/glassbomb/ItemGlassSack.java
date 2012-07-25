package carlkuang.glassbomb;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;
import net.minecraft.src.forge.ITextureProvider;

public class ItemGlassSack extends Item implements ITextureProvider
{
public ItemGlassSack(int par1)
{
    super(par1);
}

public boolean hasEffect(ItemStack par1ItemStack)
{
    return false;
}

/**
 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
 */
public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
{
    if (!par3EntityPlayer.capabilities.isCreativeMode)
    {
        --par1ItemStack.stackSize;
    }

    par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    if (!par2World.isRemote)
    {
        par2World.spawnEntityInWorld(new EntityGlassSack(par2World, par3EntityPlayer));
    }

    return par1ItemStack;
}

public String getTextureFile() {
    return "/carlkuang/icons/items.png";
}
}
