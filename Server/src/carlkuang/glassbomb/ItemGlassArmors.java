package carlkuang.glassbomb;

import net.minecraft.src.EnumArmorMaterial;
import net.minecraft.src.ItemArmor;
import net.minecraft.src.ItemStack;
import net.minecraft.src.mod_ExtendedGlasses;
import net.minecraft.src.forge.ITextureProvider;

public class ItemGlassArmors extends ItemArmor implements ITextureProvider{

	public ItemGlassArmors(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}
	
	public String getTextureFile()
    {
        return "/carlkuang/icons/items.png";
    }
	
	public String getArmorTextureFile(ItemStack itemstack){
		if (itemstack.itemID == mod_ExtendedGlasses.GlassArmorHelmetID || itemstack.itemID == mod_ExtendedGlasses.GlassArmorChestID || itemstack.itemID == mod_ExtendedGlasses.GlassArmorBootsID){
			return "/carlkuang/icons/armor/glass_1.png";
		}else if(itemstack.itemID == mod_ExtendedGlasses.GlassArmorLegsID){
			return "/carlkuang/icons/armor/glass_2.png";
		}
		return "";
	}

}
