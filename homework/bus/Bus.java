public class Bus {

  private String name;
  private Person[] bus;

  public Bus(String name) {
    this.name = name;
    this.bus = new Person[5];
  }

  public String getName() {
    return this.name;
  }

  public int personCount() {
    int numberOfPeople = 0;

    for (Person person : this.bus) {
      if (person != null) {
          numberOfPeople++;
      }
    }

    return numberOfPeople;
  }

  public void take(Person person) {
    if (isBusFull()) {
      return;
    }
    int index = personCount();
    this.bus[index] = person;
  }

  public boolean isBusFull() {
    return personCount() == this.bus.length;
  }

  public void stop() {
    for (int i = 0; i < this.bus.length; i++) {
      this.bus[i] = null;
    }
  }
}
