package strategy;

/**
 * A bow weapon in a text-based game.
 *
 * @author Samuel Wu
 */
public class WeaponBow extends WeaponBehavior {
  /** Bow's attack by shooting an arrow. */
  @Override
  public void attack() {
    Resources.clear();

    System.out.println("Shooting an arrow");
    System.out.print("<)");

    Resources.sleep(SECOND_IN_MILLISECONDS * 5);

    printAttack("|)", "->", " ");
  }
}
