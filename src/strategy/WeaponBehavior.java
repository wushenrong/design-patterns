package strategy;

/**
 * The weapon that a Character will use to attack.
 *
 * @author Samuel Wu
 */
public abstract class WeaponBehavior {
  /** The speed of the weapon, in columns per second. */
  protected int speed = 2;

  /** The weapon's method of attack. */
  public abstract void attack();
}
