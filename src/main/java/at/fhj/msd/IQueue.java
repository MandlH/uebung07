package at.fhj.msd;

// fastly written (not really nice) comments but good enough to understand
public interface IQueue {
  /* 
  add object to queue, return true if works, otherwise false
  */
  public abstract boolean offer(SimpleDrink obj); //ERROR:2 should be an Object

  /* 
  returns and deletes first element; null if no element in there
   */
  public abstract SimpleDrink poll();

  /* 
  like poll but if no elment exists NoSuchElementException is throwin instead of null return value
   */
  public abstract SimpleDrink remove();

  /* 
  gives first element but does not delete, null if nothing there
   */
  public abstract SimpleDrink peek();

  /*
  like peek but NoSuchElementException instead of null
   */
  public abstract SimpleDrink element();
}