import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalFactoryTest {
    private final static AnimalFactory animalFactory = new AnimalFactory();

    @Test
    public void returnsMoo() {
        Animal cow = animalFactory.create("cow");
        assertEquals("moo", cow.makeNoise());
    }

    @Test
    public void returnsMeow() {
        Animal cat = animalFactory.create("cat");
        assertEquals("meow", cat.makeNoise());
    }

    @Test
    public void returnsBark() {
        Animal dog = animalFactory.create("dog");
        assertEquals("bark", dog.makeNoise());
    }

    @Test
    public void returnsQuack() {
        Animal duck = animalFactory.create("duck");
        assertEquals("quack", duck.makeNoise());
    }
}

