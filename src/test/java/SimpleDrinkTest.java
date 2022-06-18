import at.fhj.msd.Liquid;
import at.fhj.msd.SimpleDrink;
import org.junit.jupiter.api.*;

/**
 * Class for the SimpleDrinkTests
 */
public class SimpleDrinkTest {

    /**
     * implementation of the SimpleDrinks
     */
    SimpleDrink cherry, cola;
    /**
     * implementation of the liquids
     */
    private static Liquid liqueur, soda;

    /**
     * the setup method, implementation of the liquids
     */
    @BeforeAll
    public static void setUp(){

        liqueur = new Liquid("Berry Cherry", 0.15, 18);
        soda = new Liquid("Cola", 0.15, 0);
    }

    /**
     * implementation of the SimpleDrinks for every method
     */
    @BeforeEach
    public void inizialize(){
        cherry = new SimpleDrink("The Harry Cherry", liqueur);
        cola = new SimpleDrink("Coca Cola", soda);
    }

    /**
     * test for the volume of the drinks
     */
    @Test
    public void getVolumeTest(){
        Assertions.assertEquals(0.15, cherry.getVolume());
    }

    /**
     * test for the alcohol percentage
     */
    @Test
    public void getAlcoholPercentTest(){
        Assertions.assertEquals(18, cherry.getAlcoholPercent());
    }

    /**
     * test for the isAlcoholic method
     */
    @Test
    public void isAlcoholicTest(){
        Assertions.assertTrue(cherry.isAlcoholic());
    }

    /**
     * test for the isAlcoholic method to get a non alcoholic drink
     */
    @Test
    public void isNotAlcoholicTest(){
        Assertions.assertFalse(cola.isAlcoholic());
    }

    /**
     * test to set the name of the drink
     */
    @Test
    public void setNameTest(){
        cola.setName("newCola");
        Assertions.assertEquals("newCola", cola.getName());
    }

    /**
     * test to get the name of the drink
     */
    @Test
    public void liquidGetNameTest(){
        Assertions.assertEquals("Coca Cola", cola.getName());
    }

    /**
     * test to get the name of the liquid
     */
    @Test
    public void liquidSetNameTest(){
        liqueur.setName("NewName");
        Assertions.assertEquals("NewName", liqueur.getName());
    }

    /**
     * test to set the volume of the liquid
     */
    @Test
    public void liquidSetVolume(){
        liqueur.setVolume(12);
        Assertions.assertEquals(12, liqueur.getVolume());
    }

    /**
     * test to set the alcohol percentage of the liquid
     */
    @Test
    public void liquidSetAlcoholPercent(){
        liqueur.setAlcoholPercent(45);
        Assertions.assertEquals(45, liqueur.getAlcoholPercent());
    }
}
