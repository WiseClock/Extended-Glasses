package net.minecraft.src;

import java.io.File;

import net.minecraft.src.forge.Configuration;
import net.minecraft.src.forge.EnumHelper;
import net.minecraft.src.forge.MinecraftForge;
import net.minecraft.src.forge.NetworkMod;
import carlkuang.glassbomb.*;

public class mod_ExtendedGlasses extends NetworkMod {
	public static final String UNIQUE_NAME = "ExtendedGlasses";
	public static final String VERSION = "0.9 BETA";
	static Configuration configuration = new Configuration(new File("config/mod_ExtendedGlasses.cfg"));
	
	public static final EnumToolMaterial GlassTool;
	public static final EnumArmorMaterial GlassArmor;
	
	public static final Item GlassDust;
	public static final Item GunnySack;
	public static final Item GlassSack;
	public static final Item PoweredGlassSack;
	public static final Item GlassPiece;
	public static final Block ShinyGlass;
	public static final Block GlassAwl;
	public static final Block GlassTrap;

	public static final Item GlassPickaxe;
	public static final Item GlassAxe;
	public static final Item GlassShovel;
	public static final Item GlassHoe;
	public static final Item GlassSword;
	
	public static final Item GlassArmorHelmet;
	public static final Item GlassArmorChest;
	public static final Item GlassArmorLegs;
	public static final Item GlassArmorBoots;
	
	public static final Item StoneHammer;
	public static final Item IronHammer;
	public static final Item GoldHammer;
	public static final Item DiamondHammer;
	
	public static int GlassDustID;
	public static int GunnySackID;
	public static int GlassSackID;
	public static int PoweredGlassSackID;
	public static int GlassPieceID;
	public static int ShinyGlassID;
	public static int GlassAwlID;
	public static int GlassTrapID;
	
	public static int GlassPickaxeID;
	public static int GlassAxeID;
	public static int GlassShovelID;
	public static int GlassHoeID;
	public static int GlassSwordID;
	
	public static int GlassArmorHelmetID;
	public static int GlassArmorChestID;
	public static int GlassArmorLegsID;
	public static int GlassArmorBootsID;
	
	public static int StoneHammerID;
	public static int IronHammerID;
	public static int GoldHammerID;
	public static int DiamondHammerID;

	@Override
	public String getVersion() {
		return UNIQUE_NAME + " " + VERSION;
	}

	public mod_ExtendedGlasses() {
	}

	@Override
	public void load() {
		ModLoader.registerBlock(ShinyGlass);
		ModLoader.registerBlock(GlassAwl);
		ModLoader.registerBlock(GlassTrap);
		
		ModLoader.addName(GlassDust, "Glass Dust");
		ModLoader.addName(GunnySack, "Gunny Sack");
		ModLoader.addName(GlassSack, "Glass Sack");
		ModLoader.addName(PoweredGlassSack, "Powered Glass Sack");
		ModLoader.addName(GlassPiece, "Glass Piece");
		ModLoader.addName(ShinyGlass, "Shiny Glass");
		ModLoader.addName(GlassAwl, "Glass Awl");
		ModLoader.addName(GlassTrap, "Glass Trap");
		
		ModLoader.addName(GlassPickaxe, "Glass Pickaxe");
		ModLoader.addName(GlassAxe, "Glass Axe");
		ModLoader.addName(GlassShovel, "Glass Shovel");
		ModLoader.addName(GlassHoe, "Glass Hoe");
		ModLoader.addName(GlassSword, "Glass Sword");
		
		ModLoader.addName(GlassArmorHelmet, "Glass Helmet");
		ModLoader.addName(GlassArmorChest, "Glass Chest");
		ModLoader.addName(GlassArmorLegs, "Glass Legs");
		ModLoader.addName(GlassArmorBoots, "Glass Boots");
		
		ModLoader.addName(StoneHammer, "Stone Hammer");
		ModLoader.addName(IronHammer, "Iron Hammer");
		ModLoader.addName(GoldHammer, "Golden Hammer");
		ModLoader.addName(DiamondHammer, "Diamond Hammer");
		
		MinecraftForge.registerEntity(EntityGlassSack.class, this, 1, 160, 5, true);
		MinecraftForge.registerEntity(EntityPoweredGlassSack.class, this, 1, 160, 5, true);
		
		ModLoader.addRecipe(new ItemStack(Block.glass, 1), new Object[]
                {
                    "XXX", "XXX", "XXX", 'X', GlassDust
                });
		ModLoader.addRecipe(new ItemStack(ShinyGlass, 1), new Object[]
                {
                    "XXX", "XAX", "XXX", 'X', GlassDust, 'A', Item.lightStoneDust
                });
		ModLoader.addRecipe(new ItemStack(GlassAwl, 1), new Object[]
                {
                    " X ", " X ", "XXX", 'X', GlassDust
                });
		ModLoader.addRecipe(new ItemStack(GunnySack, 1), new Object[]
                {
                    " I ", "I I", "IXI", 'I', Item.silk, 'X', Item.leather
                });
		ModLoader.addShapelessRecipe(new ItemStack(GlassSack, 1), new Object[]
                {
                    GunnySack, GlassDust, GlassDust, GlassDust, GlassDust
                });
		ModLoader.addShapelessRecipe(new ItemStack(PoweredGlassSack, 1), new Object[]
                {
                    GunnySack, GlassDust, GlassDust, GlassDust, GlassDust, GlassDust, GlassDust, GlassDust, GlassDust
                });
		ModLoader.addShapelessRecipe(new ItemStack(GlassDust, 5), new Object[]
                {
                    Block.glass, new ItemStack(StoneHammer, 1, -1)
                });
		ModLoader.addShapelessRecipe(new ItemStack(GlassDust, 7), new Object[]
                {
                    Block.glass, new ItemStack(IronHammer, 1, -1)
                });
		ModLoader.addShapelessRecipe(new ItemStack(GlassDust, 15), new Object[]
                {
                    Block.glass, new ItemStack(GoldHammer, 1, -1)
                });
		ModLoader.addShapelessRecipe(new ItemStack(GlassDust, 9), new Object[]
                {
                    Block.glass, new ItemStack(DiamondHammer, 1, -1)
                });
		ModLoader.addRecipe(new ItemStack(GlassTrap, 1), new Object[]
                {
                    "XXX", 'X', GlassDust
                });
		ModLoader.addRecipe(new ItemStack(StoneHammer, 1), new Object[]
                {
                    "X", "S", "I", 'X', Block.cobblestone, 'I', Item.stick, 'S', Item.silk
                });
		ModLoader.addRecipe(new ItemStack(IronHammer, 1), new Object[]
                {
                    "X", "S", "I", 'X', Item.ingotIron, 'I', Item.stick, 'S', Item.silk
                });
		ModLoader.addRecipe(new ItemStack(GoldHammer, 1), new Object[]
                {
                    "X", "S", "I", 'X', Item.ingotGold, 'I', Item.stick, 'S', Item.silk
                });
		ModLoader.addRecipe(new ItemStack(DiamondHammer, 1), new Object[]
                {
                    "X", "S", "I", 'X', Item.diamond, 'I', Item.stick, 'S', Item.silk
                });
		ModLoader.addRecipe(new ItemStack(GlassPiece, 1), new Object[]
                {
                    "XX", "XX", 'X', GlassDust
                });
		ModLoader.addRecipe(new ItemStack(GlassPickaxe, 1), new Object[]
                {
                    "XXX", " I ", " I ", 'X', GlassPiece, 'I', Item.stick
                });
		ModLoader.addRecipe(new ItemStack(GlassAxe, 1), new Object[]
                {
                    "XX", "XI", " I", 'X', GlassPiece, 'I', Item.stick
                });
		ModLoader.addRecipe(new ItemStack(GlassShovel, 1), new Object[]
                {
                    "X", "I", "I", 'X', GlassPiece, 'I', Item.stick
                });
		ModLoader.addRecipe(new ItemStack(GlassHoe, 1), new Object[]
                {
                    "XX", " I", " I", 'X', GlassPiece, 'I', Item.stick
                });
		ModLoader.addRecipe(new ItemStack(GlassSword, 1), new Object[]
                {
                    "X", "X", "I", 'X', GlassPiece, 'I', Item.stick
                });
		ModLoader.addRecipe(new ItemStack(GlassArmorHelmet, 1), new Object[]
                {
                    "XXX", "X X", 'X', GlassPiece
                });
		ModLoader.addRecipe(new ItemStack(GlassArmorChest, 1), new Object[]
                {
                    "X X", "XXX", "XXX", 'X', GlassPiece
                });
		ModLoader.addRecipe(new ItemStack(GlassArmorLegs, 1), new Object[]
                {
                    "XXX", "X X", "X X", 'X', GlassPiece
                });
		ModLoader.addRecipe(new ItemStack(GlassArmorBoots, 1), new Object[]
                {
                    "X X", "X X", 'X', GlassPiece
                });

		Block.blocksList[20] = null;
		Block.blocksList[20] = (new BlockGlassDrop(20, 49, Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("glass");
		
	}
	
	static void configurationProperties()
    {
        configuration.load();
        
    	ShinyGlassID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("ShinyGlass", 200).value);
    	GlassAwlID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("GlassAwl", 201).value);
    	GlassTrapID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("GlassTrap", 202).value);
    	
    	GlassDustID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassDust", "item", 1500).value);
    	GunnySackID = Integer.parseInt(configuration.getOrCreateIntProperty("GunnySack", "item", 1501).value);
    	GlassSackID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassSack", "item", 1502).value);
    	PoweredGlassSackID = Integer.parseInt(configuration.getOrCreateIntProperty("PoweredGlassSack", "item", 1503).value);
    	GlassPieceID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassPiece", "item", 1504).value);
    	GlassPickaxeID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassPickaxe", "item", 1505).value);
    	GlassAxeID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassAxe", "item", 1506).value);
    	GlassShovelID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassShovel", "item", 1507).value);
    	GlassHoeID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassHoe", "item", 1508).value);
    	GlassSwordID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassSword", "item", 1509).value);
    	GlassArmorHelmetID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassHelmet", "item", 1510).value);
    	GlassArmorChestID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassChest", "item", 1511).value);
    	GlassArmorLegsID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassLegs", "item", 1512).value);
    	GlassArmorBootsID = Integer.parseInt(configuration.getOrCreateIntProperty("GlassBoots", "item", 1513).value);
    	StoneHammerID = Integer.parseInt(configuration.getOrCreateIntProperty("StoneHammer", "item", 1514).value);
    	IronHammerID = Integer.parseInt(configuration.getOrCreateIntProperty("IronHammer", "item", 1515).value);
    	GoldHammerID = Integer.parseInt(configuration.getOrCreateIntProperty("GoldHammer", "item", 1516).value);
    	DiamondHammerID = Integer.parseInt(configuration.getOrCreateIntProperty("DiamondHammer", "item", 1517).value);
        
        configuration.save();
    }
	
	static {
		
		configurationProperties();
		
		GlassTool = EnumHelper.addToolMaterial("GlassTool", 3, 25, 10.0F, 0, 35);
		GlassArmor = EnumHelper.addArmorMaterial("GlassArmor", 6, new int[]
                {
				1, 3, 2, 1
            }, 45);
		
		GlassDust = (new ItemGlassDust(GlassDustID - 256)).setIconIndex(0).setItemName("GlassDust");
		GunnySack = (new ItemGunnySack(GunnySackID - 256)).setIconIndex(1).setItemName("GunnySack");
		GlassSack = (new ItemGlassSack(GlassSackID - 256)).setIconIndex(2).setItemName("GlassSack");
		PoweredGlassSack = (new ItemPoweredGlassSack(PoweredGlassSackID - 256)).setIconIndex(2).setItemName("PoweredGlassSack");
		GlassPiece = (new ItemGlassDust(GlassPieceID - 256)).setIconIndex(16).setItemName("GlassPiece");
		ShinyGlass = (new BlockShinyGlass(ShinyGlassID, 1, Material.glass, false)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setBlockName("ShinyGlass");
		GlassAwl = (BlockGlassAwl)(new BlockGlassAwl(GlassAwlID, 0)).setHardness(0.0F).setStepSound(Block.soundGlassFootstep).setBlockName("GlassAwl");
		GlassTrap = (new BlockGlassTrap(GlassTrapID, 49, Material.glass)).setHardness(0.3F).setStepSound(Block.soundGlassFootstep).setBlockName("GlassTrap");
		
		GlassPickaxe = (new ItemPickaxe((GlassPickaxeID - 256), GlassTool)).setIconIndex(3).setItemName("GlassPickaxe");
		GlassPickaxe.setTextureFile("/carlkuang/icons/items.png");
		GlassAxe = (new ItemAxe((GlassAxeID - 256), GlassTool)).setIconIndex(4).setItemName("GlassAxe");
		GlassAxe.setTextureFile("/carlkuang/icons/items.png");
		GlassShovel = (new ItemSpade((GlassShovelID - 256), GlassTool)).setIconIndex(5).setItemName("GlassShovel");
		GlassShovel.setTextureFile("/carlkuang/icons/items.png");
		GlassHoe = (new ItemHoe((GlassHoeID - 256), GlassTool)).setIconIndex(6).setItemName("GlassHoe");
		GlassHoe.setTextureFile("/carlkuang/icons/items.png");
		GlassSword = (new ItemSword((GlassSwordID - 256), GlassTool)).setIconIndex(7).setItemName("GlassSword");
		GlassSword.setTextureFile("/carlkuang/icons/items.png");
		
		GlassArmorHelmet = (new ItemGlassArmors(GlassArmorHelmetID - 256, GlassArmor, 5, 0)).setIconIndex(12).setItemName("GlassHelmet");
		GlassArmorChest = (new ItemGlassArmors(GlassArmorChestID - 256, GlassArmor, 5, 1)).setIconIndex(13).setItemName("GlassChest");
		GlassArmorLegs = (new ItemGlassArmors(GlassArmorLegsID - 256, GlassArmor, 5, 2)).setIconIndex(14).setItemName("GlassLegs");
		GlassArmorBoots = (new ItemGlassArmors(GlassArmorBootsID - 256, GlassArmor, 5, 3)).setIconIndex(15).setItemName("GlassBoots");
		
		StoneHammer = (new ItemHammer((StoneHammerID - 256))).setIconIndex(8).setItemName("StoneHammer").setMaxDamage(15);
		IronHammer = (new ItemHammer((IronHammerID - 256))).setIconIndex(9).setItemName("IronHammer").setMaxDamage(30);
		GoldHammer = (new ItemHammer((GoldHammerID - 256))).setIconIndex(10).setItemName("GoldHammer").setMaxDamage(15);
		DiamondHammer = (new ItemHammer((DiamondHammerID - 256))).setIconIndex(11).setItemName("DiamondHammer").setMaxDamage(75);
	}
	
	@Override
	public boolean clientSideRequired() {
		return true;
	}

	@Override
	public boolean serverSideRequired() {
		return false;
	}
	
	@Override
    public void takenFromCrafting(EntityPlayer e, ItemStack item, IInventory m)
    {
    	for(int i=0; i<m.getSizeInventory(); i++)
		{
    		if(m.getStackInSlot(i) != null)
    		{
    			ItemStack j = m.getStackInSlot(i);
    			if(j.getItem() != null && (j.getItem() == this.StoneHammer || j.getItem() == this.IronHammer || j.getItem() == this.GoldHammer || j.getItem() == this.DiamondHammer))
    			{				
    				ItemStack k = new ItemStack(j.getItem(), 2);
    				k.damageItem(j.getItemDamage() + 1, e);
    				m.setInventorySlotContents(i, k);
    			}
    		}		
		}
    }
}
