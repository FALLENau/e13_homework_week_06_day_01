public class BusStop {

  public int foodCount() {
    int numberOfSalmon = 0;

    for (Salmon salmon : this.belly) {
      if (salmon != null) {
          numberOfSalmon++;
      }
    }
}
