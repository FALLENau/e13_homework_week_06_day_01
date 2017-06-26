import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusStopTest {

  BusStop busstop;

  @Before
  public void before() {
    busstop = new BusStop("High Town");
  }

  @Test
  public void HasPeople() {
    assertEquals(4, busstop.personCount());
  }

}
