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
    final int NUMBER_OF_COLUMNS = 80;
    final int SECOND_IN_MILLISECOND = 100;

    Resources.clear();

    System.out.println("Beaming Stars");

    for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
      System.out.print("*");

      Resources.sleep(SECOND_IN_MILLISECOND / this.speed);
    }

    System.out.println();
  }
}
