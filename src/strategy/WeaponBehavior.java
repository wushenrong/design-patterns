package strategy;

/**
 * The weapon that a Character will use to attack.
 *
 * @author Samuel Wu
 */
public abstract class WeaponBehavior {
  /** The speed of the weapon, in columns per second. */
  protected int speed = 2;

  protected static final int NUMBER_OF_COLUMNS = 80;
  protected static final int SECOND_IN_MILLISECONDS = 100;

  /** The weapon's method of attack. */
  public abstract void attack();

  /**
   * Prints out the weapon's attack.
   *
   * @param weapon The base weapon, if it can be thrown then it should be a projectile.
   * @param projectile The weapon that is being thrown or shot.
   * @param filler What to fill between the weapon and projectile.
   */
  protected void printAttack(String weapon, String projectile, String filler) {
    for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
      System.out.print("\r");

      if (!weapon.isBlank()) {
        System.out.print(weapon);
      }

      System.out.print(filler.repeat(i) + projectile);

      Resources.sleep(SECOND_IN_MILLISECONDS / this.speed);
    }

    System.out.println();
  }
}
