import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BearTest {
  @Test
  public void hasName() {
    Bear bear = new Bear("Baloo");
    assertEquals("Baloo", bear.getName());
  }
}
