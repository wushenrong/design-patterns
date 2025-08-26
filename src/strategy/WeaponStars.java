package strategy;

/**
 * A stars weapon in a text-based game.
 *
 * @author Samuel Wu
 */
public class WeaponStars extends WeaponBehavior {
  /** Stars's attack by beaming it. */
  @Override
  public void attack() {
    Resources.clear();

    System.out.println("Beaming Stars");

    printAttack("*", "*", "*");
  }
}
