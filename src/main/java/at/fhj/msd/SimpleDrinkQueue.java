package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * class that represents the queue for the drinks
 */
public class SimpleDrinkQueue implements IQueue {

  /**
   * created an ArrayList for the drinks
   */
  private List<SimpleDrink> elements = new ArrayList<SimpleDrink>();

  /**
   * initialized the size of the queue
   */
  private int maxSize = 5;

  /**
   * Constructor for the drinksqueue
   *
   * @param maxSize the size of the queue (indicates, how many drinks there are in the queue)
   */
  public SimpleDrinkQueue(int maxSize) {
    this.maxSize = maxSize;   //wrong maxSize value (maxSized not maxsized)
  }

  /**
   * adds a new drink to the queue, if the queue still has space
   * @param obj the drink
   * @return true if the offer was successful
   * @return false if the offer was not successful
   */
  @Override
  public boolean offer(SimpleDrink obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * deletes the first element of the queue
   * @return the element which got deleted
   * @return null if there was no element in the queue
   */
  @Override
  public SimpleDrink poll() {
    SimpleDrink element = peek();

    if (elements.size() == 0) {
      element = null;             //return values missed
    } else{                 
      elements.remove(0);
    }

    return element;
  }

  /**
   * removes the first element of the queue
   * @return the first element of the queue if there was a drink in the queue
   * @throws NoSuchElementException when the queue is empty
   */
  @Override
  public SimpleDrink remove() {
    SimpleDrink element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * looks at the first element of the queue
   * @return the element on the first place
   * @return null when the queue is empty
   */
  @Override
  public SimpleDrink peek() {
    SimpleDrink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * takes a look at the first element in the queue
   * @return the first drink
   * @throws NoSuchElementException when the queue is empty
   */
  @Override
  public SimpleDrink element() {
    SimpleDrink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}