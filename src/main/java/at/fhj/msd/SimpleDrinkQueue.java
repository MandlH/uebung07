package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class SimpleDrinkQueue implements IQueue {

  private List<SimpleDrink> elements = new ArrayList<SimpleDrink>();
  private int maxSize = 5;

  public SimpleDrinkQueue(int maxSize) {
    this.maxSize = maxSize;   //wrong maxSize value (maxSized not maxsized)
  }

  @Override
  public boolean offer(SimpleDrink obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

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

  @Override
  public SimpleDrink remove() {
    SimpleDrink element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public SimpleDrink peek() {
    SimpleDrink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public SimpleDrink element() {
    SimpleDrink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}