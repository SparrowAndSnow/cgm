package com.mrcrayfish.guns.init;

import com.mrcrayfish.guns.Reference;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds 
{
	public static final DeferredRegister<SoundEvent> REGISTER = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_FIRE = register("item.pistol.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SILENCED_FIRE = register("item.pistol.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_ENCHANTED_FIRE = register("item.pistol.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_RELOAD = register("item.pistol.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_COCK = register("item.pistol.cock");

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SURVIVAL_FIRE = register("item.pistol_survival.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SURVIVAL_SILENCED_FIRE = register("item.pistol_survival.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SURVIVAL_ENCHANTED_FIRE = register("item.pistol_survival.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SURVIVAL_RELOAD = register("item.pistol_survival.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SURVIVAL_COCK = register("item.pistol_survival.cock");

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_AUTO_FIRE = register("item.pistol_auto.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_AUTO_SILENCED_FIRE = register("item.pistol_auto.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_AUTO_ENCHANTED_FIRE = register("item.pistol_auto.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_AUTO_RELOAD = register("item.pistol_auto.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_AUTO_COCK = register("item.pistol_auto.cock");

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_TTI_FIRE = register("item.pistol_tti.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_TTI_SILENCED_FIRE = register("item.pistol_tti.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_TTI_ENCHANTED_FIRE = register("item.pistol_tti.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_TTI_RELOAD = register("item.pistol_tti.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_TTI_COCK = register("item.pistol_tti.cock");

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SAR_FIRE = register("item.pistol_sar.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SAR_SILENCED_FIRE = register("item.pistol_sar.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SAR_ENCHANTED_FIRE = register("item.pistol_sar.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SAR_RELOAD = register("item.pistol_sar.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_SAR_COCK = register("item.pistol_sar.cock");

	public static final RegistryObject<SoundEvent> ITEM_PISTOL_DAR_FIRE = register("item.pistol_dar.fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_DAR_SILENCED_FIRE = register("item.pistol_dar.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_DAR_ENCHANTED_FIRE = register("item.pistol_dar.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_DAR_RELOAD = register("item.pistol_dar.reload");
	public static final RegistryObject<SoundEvent> ITEM_PISTOL_DAR_COCK = register("item.pistol_dar.cock");

	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_FIRE = register("item.shotgun.fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_SILENCED_FIRE = register("item.shotgun.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_ENCHANTED_FIRE = register("item.shotgun.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_RELOAD = register("item.shotgun.reload");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_COCK = register("item.shotgun.cock");

	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_TACTICAL_FIRE = register("item.shotgun_tactical.fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_TACTICAL_SILENCED_FIRE = register("item.shotgun_tactical.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_TACTICAL_ENCHANTED_FIRE = register("item.shotgun_tactical.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_TACTICAL_RELOAD = register("item.shotgun.reload");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_TACTICAL_COCK = register("item.shotgun_tactical.cock");

	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_AUTO_FIRE = register("item.shotgun_auto.fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_AUTO_SILENCED_FIRE = register("item.shotgun_auto.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_AUTO_ENCHANTED_FIRE = register("item.shotgun_auto.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_AUTO_RELOAD = register("item.shotgun.reload");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_AUTO_COCK = register("item.shotgun_auto.cock");

	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_QB_FIRE = register("item.shotgun_qb.fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_QB_SILENCED_FIRE = register("item.shotgun_qb.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_QB_ENCHANTED_FIRE = register("item.shotgun_qb.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_QB_RELOAD = register("item.shotgun_qb.reload");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_QB_COCK = register("item.shotgun_qb.cock");

	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_DB_FIRE = register("item.shotgun_db.fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_DB_SILENCED_FIRE = register("item.shotgun_db.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_DB_ENCHANTED_FIRE = register("item.shotgun_db.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_DB_RELOAD = register("item.shotgun_db.reload");
	public static final RegistryObject<SoundEvent> ITEM_SHOTGUN_DB_COCK = register("item.shotgun_db.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_TACTICAL_FIRE = register("item.rifle_tactical.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_TACTICAL_SILENCED_FIRE = register("item.rifle_tactical.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_TACTICAL_ENCHANTED_FIRE = register("item.rifle_tactical.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_TACTICAL_RELOAD = register("item.rifle_tactical.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_TACTICAL_COCK = register("item.rifle_tactical.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_FIRE = register("item.rifle_assault.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_SILENCED_FIRE = register("item.rifle_assault.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ENCHANTED_FIRE = register("item.rifle_assault.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_RELOAD = register("item.rifle_assault.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_COCK = register("item.rifle_assault.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ZIPTIE_FIRE = register("item.rifle_assault_ziptie.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ZIPTIE_SILENCED_FIRE = register("item.rifle_assault_ziptie.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ZIPTIE_ENCHANTED_FIRE = register("item.rifle_assault_ziptie.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ZIPTIE_RELOAD = register("item.rifle_assault_ziptie.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_ASSAULT_ZIPTIE_COCK = register("item.rifle_assault_ziptie.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_FIRE = register("item.rifle_battle.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SILENCED_FIRE = register("item.rifle_battle.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_ENCHANTED_FIRE = register("item.rifle_battle.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_RELOAD = register("item.rifle_battle.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_COCK = register("item.rifle_battle.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SOVIET_FIRE = register("item.rifle_battle_soviet.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SOVIET_SILENCED_FIRE = register("item.rifle.rifle_battle_soviet");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SOVIET_ENCHANTED_FIRE = register("item.rifle.rifle_battle_soviet");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SOVIET_RELOAD = register("item.rifle_battle_soviet.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_BATTLE_SOVIET_COCK = register("item.rifle_battle_soviet.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_FIRE = register("item.rifle_scout.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_SILENCED_FIRE = register("item.rifle_scout.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_ENCHANTED_FIRE = register("item.rifle_scout.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_RELOAD = register("item.rifle_scout.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_COCK = register("item.rifle_scout.cock");

	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_KAISER_FIRE = register("item.rifle_scout_kaiser.fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_KAISER_SILENCED_FIRE = register("item.rifle_scout_kaiser.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_KAISER_ENCHANTED_FIRE = register("item.rifle_scout_kaiser.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_KAISER_RELOAD = register("item.rifle_scout_kaiser.reload");
	public static final RegistryObject<SoundEvent> ITEM_RIFLE_SCOUT_KAISER_COCK = register("item.rifle_scout_kaiser.cock");

	public static final RegistryObject<SoundEvent> ITEM_SMG_FIRE = register("item.smg.fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_SILENCED_FIRE = register("item.smg.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_ENCHANTED_FIRE = register("item.smg.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_RELOAD = register("item.smg.reload");
	public static final RegistryObject<SoundEvent> ITEM_SMG_COCK = register("item.smg.cock");

	public static final RegistryObject<SoundEvent> ITEM_SMG_ADVANCED_FIRE = register("item.smg_advanced.fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_ADVANCEDSILENCED_FIRE = register("item.smg_advanced.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_ADVANCED_ENCHANTED_FIRE = register("item.smg_advanced.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SMG_ADVANCED_RELOAD = register("item.smg_advanced.reload");
	public static final RegistryObject<SoundEvent> ITEM_SMG_ADVANCED_COCK = register("item.smg_advanced.cock");

	public static final RegistryObject<SoundEvent> ITEM_LMG_FIRE = register("item.lmg.fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_SILENCED_FIRE = register("item.lmg.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_ENCHANTED_FIRE = register("item.lmg.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_RELOAD = register("item.lmg.reload");
	public static final RegistryObject<SoundEvent> ITEM_LMG_COCK = register("item.lmg.cock");

	public static final RegistryObject<SoundEvent> ITEM_LMG_GP_FIRE = register("item.lmg_gp.fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_GP_SILENCED_FIRE = register("item.lmg_gp.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_GP_ENCHANTED_FIRE = register("item.lmg_gp.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_LMG_GP_RELOAD = register("item.lmg_gp.reload");
	public static final RegistryObject<SoundEvent> ITEM_LMG_GP_COCK = register("item.lmg_gp.cock");

	public static final RegistryObject<SoundEvent> ITEM_SNIPER_FIRE = register("item.sniper.fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_SILENCED_FIRE = register("item.sniper.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_ENCHANTED_FIRE = register("item.sniper.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_RELOAD = register("item.sniper.reload");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_COCK = register("item.sniper.cock");

	public static final RegistryObject<SoundEvent> ITEM_SNIPER_CHEYTAC_FIRE = register("item.sniper_cheytac.fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_CHEYTAC_SILENCED_FIRE = register("item.sniper_cheytac.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_CHEYTAC_ENCHANTED_FIRE = register("item.sniper_cheytac.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_CHEYTAC_RELOAD = register("item.sniper_cheytac.reload");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_CHEYTAC_COCK = register("item.sniper_cheytac.cock");

	public static final RegistryObject<SoundEvent> ITEM_SNIPER_GRENADE_FIRE = register("item.sniper_grenade.fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_GRENADE_SILENCED_FIRE = register("item.sniper_grenade.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_GRENADE_ENCHANTED_FIRE = register("item.sniper_grenade.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_GRENADE_RELOAD = register("item.sniper_grenade.reload");
	public static final RegistryObject<SoundEvent> ITEM_SNIPER_GRENADE_COCK = register("item.sniper_grenade.cock");

	public static final RegistryObject<SoundEvent> ITEM_RAILGUN_FIRE = register("item.railgun.fire");
	public static final RegistryObject<SoundEvent> ITEM_RAILGUN_SILENCED_FIRE = register("item.railgun.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_RAILGUN_ENCHANTED_FIRE = register("item.railgun.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_RAILGUN_RELOAD = register("item.railgun.reload");
	public static final RegistryObject<SoundEvent> ITEM_RAILGUN_COCK = register("item.railgun.cock");

	public static final RegistryObject<SoundEvent> ITEM_BECKER_FIRE = register("item.becker.fire");
	public static final RegistryObject<SoundEvent> ITEM_BECKER_SILENCED_FIRE = register("item.becker.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_BECKER_ENCHANTED_FIRE = register("item.becker.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_BECKER_RELOAD = register("item.becker.reload");
	public static final RegistryObject<SoundEvent> ITEM_BECKER_COCK = register("item.becker.cock");

	public static final RegistryObject<SoundEvent> ITEM_GRENADE_LAUNCHER_FIRE = register("item.grenade_launcher.fire");
	public static final RegistryObject<SoundEvent> ITEM_BAZOOKA_FIRE = register("item.bazooka.fire");
	public static final RegistryObject<SoundEvent> ITEM_MINI_GUN_FIRE = register("item.mini_gun.fire");
	public static final RegistryObject<SoundEvent> ITEM_MINI_GUN_ENCHANTED_FIRE = register("item.mini_gun.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_MACHINE_PISTOL_FIRE = register("item.machine_pistol.fire");
	public static final RegistryObject<SoundEvent> ITEM_MACHINE_PISTOL_SILENCED_FIRE = register("item.machine_pistol.silenced_fire");
	public static final RegistryObject<SoundEvent> ITEM_MACHINE_PISTOL_ENCHANTED_FIRE = register("item.machine_pistol.enchanted_fire");
	public static final RegistryObject<SoundEvent> ITEM_GRENADE_PIN = register("item.grenade.pin");
	public static final RegistryObject<SoundEvent> ENTITY_STUN_GRENADE_EXPLOSION = register("entity.stun_grenade.explosion");
	public static final RegistryObject<SoundEvent> ENTITY_STUN_GRENADE_RING = register("entity.stun_grenade.ring");
	public static final RegistryObject<SoundEvent> UI_WEAPON_ATTACH = register("ui.weapon.attach");

	private static RegistryObject<SoundEvent> register(String key)
	{
		return REGISTER.register(key, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Reference.MOD_ID, key)));
	}
}
