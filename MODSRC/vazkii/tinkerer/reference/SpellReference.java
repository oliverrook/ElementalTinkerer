/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 26 Jan 2013
package vazkii.tinkerer.reference;

/**
 * SpellReference
 *
 * Reference for Spell. Holds some values like IDs, labels and display names.
 *
 * @author Vazkii
 */
public final class SpellReference {

	/** The Compound Tag name of the Spell Data **/
	public static final String COMPOUND_TAG_NAME = "spells";

	/** The Compound Tag name of the Cooldowns **/
	public static final String COMPOUND_COOLDOWN_TAG_NAME = "cooldowns";

	/** Spell IDs **/
	public static final short ID_THUNDERBOLT = 0,
							  ID_FROSTBOLT = 1,
							  ID_BOULDER_TOSS = 2,
							  ID_FIREBALL = 3,
							  ID_AEREAL_PUSH = 4,
							  ID_FROSTSHOCK = 5,
							  ID_IMPLOSION = 6,
							  ID_FLAME_RING = 7;

	/** Passive IDs **/
	public static final short PID_EXTENDED_BREATH = 0,
							  PID_RAIN_ACCUMULATION = 1,
							  PID_NATURE_AURA = 2,
							  PID_BURNING_CLOUD = 3,
							  PID_UNDERSHIRT = 4;

	/** Spell Labels **/
	public static final String LABEL_THUNDERBOLT = "thunderbolt",
							   LABEL_FROSTBOLT = "frostbolt",
							   LABEL_BOULDER_TOSS = "boulderToss",
							   LABEL_FIREBALL = "fireball",
							   LABEL_AEREAL_PUSH = "aerealPush",
							   LABEL_FROSTSHOCK = "frostshock",
							   LABEL_IMPLOSION = "implosion",
							   LABEL_FLAME_RING = "flameRing",
							   LABEL_EXTENDED_BREATH = "extendedBreath",
							   LABEL_RAIN_ACCUMULATION = "rainAccumulation",
							   LABEL_NATURE_AURA = "natureAura",
							   LABEL_BURNING_CLOUD = "burningCloud",
							   LABEL_UNDERSHIRT = "undershirt";

	/** Spell Display Names **/
	public static final String DISPLAY_NAME_THUNDERBOLT = "Thunderbolt",
							   DISPLAY_NAME_FROSTBOLT = "Frostbolt",
							   DISPLAY_NAME_BOULDER_TOSS = "Boulder Toss",
							   DISPLAY_NAME_FIREBALL = "Fireball",
							   DISPLAY_NAME_AEREAL_PUSH = "Aerial Push",
							   DISPLAY_NAME_FROSTSHOCK = "Frostshock",
							   DISPLAY_NAME_IMPLOSION = "Implosion",
							   DISPLAY_NAME_FLAME_RING = "Flame Ring",
							   DISPLAY_NAME_EXTENDED_BREATH = "Extended Breath",
							   DISPLAY_NAME_RAIN_ACCUMULATION = "Rain Accumulation",
							   DISPLAY_NAME_NATURE_AURA = "Nature Aura",
							   DISPLAY_NAME_BURNING_CLOUD = "Burning Cloud",
							   DISPLAY_NAME_UNDERSHIRT = "Undershirt";

	/** Spell Cooldowns **/
	public static final int COOLDOWN_FIREBALL = 60,
							COOLDOWN_FROSTBOLT = 160,
							COOLDOWN_THUNDERBOLT = 40,
							COOLDOWN_BOULDER_TOSS = 120,
							COOLDOWN_AEREAL_PUSH = 190,
							COOLDOWN_FROSTSHOCK = 280,
							COOLDOWN_IMPLOSION = 2400,
							COOLDOWN_FLAME_RING = 1800;

	/** Chargable Spells max times **/
	public static final int MAX_TIME_AEREAL_PUSH = 30;

	/** Spell Damages (direct spell attacks) **/
	public static final int DMG_THUNDERBOLT = 4,
							DMG_THUNDERBOLT_MAG = 5,
							DMG_FROSTSHOCK = 4,
							DMG_FROSTSHOCK_MAG = 6;

	/** Spell Ranges (for AoE spells) **/
	public static final int RANGE_AEREAL_PUSH = 4;

	/** The display name for the spell change keybind **/
	public static final String KEYBIND_NAME = "Change Spells (" + AnnotationConstants.MOD_ID + ")";
}