import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {

  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("Magic Bus");
    person = new Person();
  }

  @Test
  public void hasName() {
    assertEquals("Magic Bus", bus.getName());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.personCount());
  }

  @Test
  public void canTakePeople() {
    bus.take(person);
    assertEquals(1, bus.personCount());
  }

  @Test
  public void cannotTakePeopleWhenBusIsFull() {
    for (int i = 0; i < 12; i++) {
      bus.take(person);
    }
    assertEquals(5, bus.personCount());
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 12; i++ ) {
      bus.take(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void shouldEmptyBusAfterStop() {
    bus.take(person);
    bus.stop();
    assertEquals(0, bus.personCount());
  }



}
