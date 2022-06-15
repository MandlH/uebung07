import at.fhj.msd.Liquid;
import at.fhj.msd.SimpleDrink;
import at.fhj.msd.SimpleDrinkQueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class SimpleDrinkQueueTest {

    SimpleDrink cherry, cola, alcohol;
    SimpleDrinkQueue queue;
    private static Liquid whisky, liqueur, soda;

    @BeforeAll
    public static void setUp(){

        whisky = new Liquid("Mountain Whisky", 0.02, 38.5);
        liqueur = new Liquid("Berry Cherry", 0.15, 18);
        soda = new Liquid("Cola", 0.35, 0);

    }
    @BeforeEach()
    public void inizialize(){
        queue = new SimpleDrinkQueue(3);
        cherry = new SimpleDrink("The Harry Cherry", liqueur);
        cola = new SimpleDrink("Coca Cola", soda);
        alcohol = new SimpleDrink("OneShot", whisky);
    }

    @Test
    public void offerTest(){
        Assertions.assertTrue(queue.offer(cherry));
        Assertions.assertTrue(queue.offer(cola));
        Assertions.assertTrue(queue.offer(alcohol));
    }

    @Test
    public void offerFalseTest(){
        queue.offer(cherry);
        queue.offer(alcohol);
        queue.offer(cola);
        Assertions.assertFalse(queue.offer(cherry));
    }

    @Test
    public void pollTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.poll());
    }

    @Test
    public void pollNullTest(){
        Assertions.assertNull(queue.poll());
    }

    @Test
    public void elementExceptionTest(){
        Assertions.assertThrows(NoSuchElementException.class, ()-> queue.element());
    }

    @Test
    public void elementTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.element());
    }

    @Test
    public void removeExceptionTest(){
        Assertions.assertThrows(NoSuchElementException.class, ()-> queue.remove());
    }

    @Test
    public void removeTest(){
        queue.offer(cherry);
        Assertions.assertEquals(cherry, queue.remove());
    }

}
