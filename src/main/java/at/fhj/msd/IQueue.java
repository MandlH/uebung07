package at.fhj.msd;

/**
 * The Interface for the Queues
 */
public interface IQueue {

  /**
   * add object to queue, return true if works, otherwise false
   *
   * @param obj the drink
   */
  public abstract boolean offer(SimpleDrink obj); //ERROR:2 should be an Object

  /**
   * returns and deletes first element; null if no element in the queue
   */
  public abstract SimpleDrink poll();

  /**
   * also deletes the first element (like poll), but if there is no element in the queue a "NoSuchElementException" is thrown
   * instead of the null return
   */
  public abstract SimpleDrink remove();

  /**
   * gives a look on the first element in your queue, if there is nothing the method returns null
   */
  public abstract SimpleDrink peek();

  /**
   * gives a look on the first element like peek but throws a "NoSuchElementException" instead of null if
   * there is nothing in the queue
   */
  public abstract SimpleDrink element();
}