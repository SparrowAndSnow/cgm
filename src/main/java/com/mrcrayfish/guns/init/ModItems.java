package com.mrcrayfish.guns.init;

import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.common.Attachments;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.AmmoItem;
import com.mrcrayfish.guns.item.BarrelItem;
import com.mrcrayfish.guns.item.GrenadeItem;
import com.mrcrayfish.guns.item.GunItem;
import com.mrcrayfish.guns.item.ScopeItem;
import com.mrcrayfish.guns.item.StockItem;
import com.mrcrayfish.guns.item.StunGrenadeItem;
import com.mrcrayfish.guns.item.UnderBarrelItem;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<GunItem> PISTOL = REGISTER.register("pistol", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> PISTOL_SURVIVAL = REGISTER.register("pistol_survival", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> PISTOL_AUTO = REGISTER.register("pistol_auto", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> PISTOL_TTI = REGISTER.register("pistol_tti", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> PISTOL_SAR = REGISTER.register("pistol_sar", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> PISTOL_DAR = REGISTER.register("pistol_dar", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOTGUN = REGISTER.register("shotgun", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOTGUN_TACTICAL = REGISTER.register("shotgun_tactical", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOTGUN_AUTO = REGISTER.register("shotgun_auto", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOTGUN_DB = REGISTER.register("shotgun_db", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOTGUN_QB = REGISTER.register("shotgun_qb", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_TACTICAL = REGISTER.register("rifle_tactical", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<GunItem> RIFLE_ASSAULT = REGISTER.register("rifle_assault", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_ASSAULT_ZIPTIE = REGISTER.register("rifle_assault_ziptie", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_BATTLE = REGISTER.register("rifle_battle", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_BATTLE_SOVIET = REGISTER.register("rifle_battle_soviet", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_SCOUT = REGISTER.register("rifle_scout", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RIFLE_SCOUT_KAISER = REGISTER.register("rifle_scout_kaiser", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SMG = REGISTER.register("smg", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SMG_ADVANCED = REGISTER.register("smg_advanced", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LMG = REGISTER.register("lmg", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LMG_GP = REGISTER.register("lmg_gp", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRENADE_LAUNCHER = REGISTER.register("grenade_launcher", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BAZOOKA = REGISTER.register("bazooka", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MINI_GUN = REGISTER.register("mini_gun", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SNIPER = REGISTER.register("sniper", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SNIPER_CHEYTAC = REGISTER.register("sniper_cheytac", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SNIPER_GRENADE = REGISTER.register("sniper_grenade", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RAILGUN = REGISTER.register("railgun", () -> new GunItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BECKER = REGISTER.register("becker", () -> new GunItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> P9 = REGISTER.register("p9", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> P45 = REGISTER.register("p45", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> R556 = REGISTER.register("r556", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> R762 = REGISTER.register("r762", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> G12 = REGISTER.register("g12", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> S50 = REGISTER.register("s50", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> X20 = REGISTER.register("x20", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> DART = REGISTER.register("dart", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> MISSILE = REGISTER.register("missile", () -> new AmmoItem(new Item.Properties()));
    public static final RegistryObject<Item> GRENADE = REGISTER.register("grenade", () -> new GrenadeItem(new Item.Properties(), 20 * 4));
    public static final RegistryObject<Item> STUN_GRENADE = REGISTER.register("stun_grenade", () -> new StunGrenadeItem(new Item.Properties(), 72000));

    /* Scope Attachments */
    public static final RegistryObject<Item> SHORT_SCOPE = REGISTER.register("short_scope", () -> new ScopeItem(Attachments.SHORT_SCOPE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEDIUM_SCOPE = REGISTER.register("medium_scope", () -> new ScopeItem(Attachments.MEDIUM_SCOPE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LONG_SCOPE = REGISTER.register("long_scope", () -> new ScopeItem(Attachments.LONG_SCOPE, new Item.Properties().stacksTo(1)));

    /* Barrel Attachments */
    public static final RegistryObject<Item> SILENCER = REGISTER.register("silencer", () -> new BarrelItem(Barrel.create(8.0F, GunModifiers.SILENCED, GunModifiers.REDUCED_DAMAGE), new Item.Properties().stacksTo(1)));

    /* Stock Attachments */
    public static final RegistryObject<Item> LIGHT_STOCK = REGISTER.register("light_stock", () -> new StockItem(Stock.create(GunModifiers.BETTER_CONTROL), new Item.Properties().stacksTo(1), false));
    public static final RegistryObject<Item> TACTICAL_STOCK = REGISTER.register("tactical_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), new Item.Properties().stacksTo(1), false));
    public static final RegistryObject<Item> WEIGHTED_STOCK = REGISTER.register("weighted_stock", () -> new StockItem(Stock.create(GunModifiers.SUPER_STABILISED), new Item.Properties().stacksTo(1)));

    /* Under Barrel Attachments */
    public static final RegistryObject<Item> LIGHT_GRIP = REGISTER.register("light_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.LIGHT_RECOIL), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SPECIALISED_GRIP = REGISTER.register("specialised_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.REDUCED_RECOIL), new Item.Properties().stacksTo(1)));
}
