package strategy;

/**
 * Attacking with no weapon for a Character.
 *
 * @author Samuel Wu
 */
public class WeaponNone extends WeaponBehavior {
  /** Unable to attack because they do not know any attacks. */
  @Override
  public void attack() {
    System.out.println("Unable to attack, you do not know any attacks.");
  }
}
