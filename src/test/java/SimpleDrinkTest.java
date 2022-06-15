import at.fhj.msd.Liquid;
import at.fhj.msd.SimpleDrink;
import org.junit.jupiter.api.*;

public class SimpleDrinkTest {

    SimpleDrink cherry, cola;
    private static Liquid liqueur, soda;

    @BeforeAll
    public static void setUp(){

        liqueur = new Liquid("Berry Cherry", 0.15, 18);
        soda = new Liquid("Cola", 0.15, 0);
    }

    @BeforeEach
    public void inizialize(){
        cherry = new SimpleDrink("The Harry Cherry", liqueur);
        cola = new SimpleDrink("Coca Cola", soda);
    }

    @Test
    public void getVolumeTest(){
        Assertions.assertEquals(0.15, cherry.getVolume());
    }

    @Test
    public void getAlcoholPercentTest(){
        Assertions.assertEquals(18, cherry.getAlcoholPercent());
    }

    @Test
    public void isAlcoholicTest(){
        Assertions.assertTrue(cherry.isAlcoholic());
    }

    @Test
    public void isNotAlcoholicTest(){
        Assertions.assertFalse(cola.isAlcoholic());
    }

    @Test
    public void setNameTest(){
        cola.setName("newCola");
        Assertions.assertEquals("newCola", cola.getName());
    }

    @Test
    public void liquidGetNameTest(){
        Assertions.assertEquals("Coca Cola", cola.getName());
    }

    @Test
    public void liquidSetNameTest(){
        liqueur.setName("NewName");
        Assertions.assertEquals("NewName", liqueur.getName());
    }

    @Test
    public void liquidSetVolume(){
        liqueur.setVolume(12);
        Assertions.assertEquals(12, liqueur.getVolume());
    }

    @Test
    public void liquidSetAlcoholPercent(){
        liqueur.setAlcoholPercent(45);
        Assertions.assertEquals(45, liqueur.getAlcoholPercent());
    }
}
