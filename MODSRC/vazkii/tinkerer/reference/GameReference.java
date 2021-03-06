/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 19 Jan 2013
package vazkii.tinkerer.reference;

/**
 * GameReference
 *
 * General reference for game balance constants.
 *
 * @author Vazkii
 */
public final class GameReference {

	/** How much elementium dust is gotten from a reaction
	 * with an elementium block per block of glowstone around **/
	public static final int ELEMENTIUM_DUST_PER_BLOCK = 4;

	/** How much elementium dust is gotten from a reaction
	 * with an elementium block per block of glowstone around, if
	 * that block happens to be a redstone lamp **/
	public static final int ELEMENTIUM_DUST_PER_LAMP = 2;

	/** The chance of getting elementium dust from mob drops **/
	public static final double ELEMENTIUM_DUST_MOB_DROP_CHANCE = 0.075;

	/** How much power does the explosion from a reaction with an
	 * elementium block do per block of glowstone **/
	public static final float EXPLOSION_MULTIPLIER_GLOWSTONE = 0.125F;

	/** How much power does the explosion from a reaction with an
	 * elementium block do per block of glowstone, if that
	 * block happens to be a redstone lamp **/
	public static final float EXPLOSION_MULTIPLIER_LAMP = 0.0625F;

	/** The time it takes for the Odd Claw to recharge **/
	public static final int ODD_CLAW_RECHARGE_TIME = 50;

	/** The chance of creating a fire arrow with the Odd Claw **/
	public static final float ODD_CLAW_FIRE_ARROW_CHANCE = 0.2F;

	/** The chance of creating a knockback arrow with the Odd Claw **/
	public static final float ODD_CLAW_KB_ARROW_CHANCE = 0.3F;
}
