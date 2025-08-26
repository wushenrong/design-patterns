package strategy;

/**
 * A knife weapon in a text-based game.
 *
 * @author Samuel Wu
 */
public class WeaponKnife extends WeaponBehavior {
  /** Knife's attack by throwing it. */
  @Override
  public void attack() {
    Resources.clear();

    System.out.println("Throwing Knife");

    printAttack("", "-|=>", " ");
  }
}
