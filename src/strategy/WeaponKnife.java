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
    final int NUMBER_OF_COLUMNS = 80;
    final int SECOND_IN_MILLISECOND = 100;

    for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
      Resources.clear();

      System.out.println("Throwing Knife");

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.println("-|=>");

      Resources.sleep(SECOND_IN_MILLISECOND / this.speed);
    }
  }
}
