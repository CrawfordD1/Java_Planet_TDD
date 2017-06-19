import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{

  Planet planet;

  @Before
  public void before(){
    planet = new Planet("Omicron Persei 8", 20000);
  }

  @Test
  public void hasName(){
    assertEquals("Omicron Persei 8", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(20000, planet.getSize());
  }

  @Test
  public void hasexplosion(){
    assertEquals("Boom! Omicron Persei 8 has exploded.", planet.explode());
  }

}
