import at.fhj.msd.Liquid;
import at.fhj.msd.SimpleDrink;
import at.fhj.msd.SimpleDrinkQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * Testclass for the SimpleDrinkQueueTest
 */
public class SimpleDrinkQueueTest {

    /**
     * implementation of the simple drinks
     */
    SimpleDrink cherry, cola, alcohol;
    /**
     * implementation of the queue
     */
    SimpleDrinkQueue queue;
    /**
     * implementation of the liquids
     */
    private static Liquid whisky, liqueur, soda;

    /**
     * creation of all the liquids for the methods of this testclass
     */
    @BeforeAll
    public static void setUp(){

        whisky = new Liquid("Mountain Whisky", 0.02, 38.5);
        liqueur = new Liquid("Berry Cherry", 0.15, 18);
        soda = new Liquid("Cola", 0.35, 0);

    }

    /**
     * creation of the queue and the SimpleDrinks before each method
     */
    @BeforeEach()
    public void inizialize(){
        queue = new SimpleDrinkQueue(3);
        cherry = new SimpleDrink("The Harry Cherry", liqueur);
        cola = new SimpleDrink("Coca Cola", soda);
        alcohol = new SimpleDrink("OneShot", whisky);
    }

    /**
     * testing the offer method
     */
    @Test
    public void offerTest(){
        Assertions.assertTrue(queue.offer(cherry));
        Assertions.assertTrue(queue.offer(cola));
        Assertions.assertTrue(queue.offer(alcohol));
    }

    /**
     * testing the offer method
     */
    @Test
    public void offerFalseTest(){
        queue.offer(cherry);
        queue.offer(alcohol);
        queue.offer(cola);
        Assertions.assertFalse(queue.offer(cherry));
    }

    /**
     * testing the poll method
     */
    @Test
    public void pollTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.poll());
    }

    /**
     * testing the poll method
     */
    @Test
    public void pollNullTest(){
        Assertions.assertNull(queue.poll());
    }

    /**
     * testing the element method
     */
    @Test
    public void elementExceptionTest(){
        Assertions.assertThrows(NoSuchElementException.class, ()-> queue.element());
    }

    /**
     * testing the element method
     */
    @Test
    public void elementTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.element());
    }

    /**
     * testing the remove method
     */
    @Test
    public void removeExceptionTest(){
        Assertions.assertThrows(NoSuchElementException.class, ()-> queue.remove());
    }

    /**
     * testing the remove method
     */
    @Test
    public void removeTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.remove());
    }
}
