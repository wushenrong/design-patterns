package strategy;

/**
 * A Character that is in a text-based game.
 *
 * @author Samuel Wu
 */
public abstract class Character {
  /** The name of the character. */
  protected String name;

  /** The weapon the character will use to attack. */
  private WeaponBehavior weaponBehavior;

  /**
   * Creates a new Character with a given name.
   *
   * @param name The name of the character.
   */
  public Character(String name) {
    this.name = name;
    this.weaponBehavior = null;
  }

  /**
   * The character attacking with their weapon, if they do not have a weapon behavior, do nothing.
   */
  public void attack() {
    if (weaponBehavior != null) {
      weaponBehavior.attack();
    } else {
      System.out.println("Unable to attack, you do not know what weapon to attack with.");
    }
  }

  /**
   * Set the weapon of how the character will attack.
   *
   * @param weaponBehavior The behavior in which the character attack.
   */
  public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
    this.weaponBehavior = weaponBehavior;
  }

  /**
   * A string representation of the character.
   *
   * @return A string representation of the character.
   */
  public abstract String toString();
}
