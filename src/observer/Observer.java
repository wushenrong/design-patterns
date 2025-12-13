package observer;

/**
 * A Observer that watches updates from notice issuers.
 *
 * @author Samuel Wu
 */
public interface Observer {
  /**
   * Update and react to a notice or warning from a notice issuers.
   *
   * @param warning Is the notice a warning?
   * @param note The level of the notice.
   */
  void update(boolean warning, int note);
}
