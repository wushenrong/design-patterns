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
    final int NUMBER_OF_COLUMNS = 80;
    final int SECOND_IN_MILLISECOND = 100;

    Resources.clear();

    System.out.println("Shooting an arrow");
    System.out.print("<)");

    Resources.sleep(SECOND_IN_MILLISECOND * 5);

    for (int i = 0; i < NUMBER_OF_COLUMNS; i++) {
      Resources.clear();

      System.out.println("Shooting an arrow");
      System.out.print("|)");

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.println("->");
      Resources.sleep(SECOND_IN_MILLISECOND / this.speed);
    }
  }
}
