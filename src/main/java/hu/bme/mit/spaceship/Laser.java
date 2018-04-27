package hu.bme.mit.spaceship;

import java.util.Random;

public class Laser {
  private int energyReserve;
  private int temperature;

  public Laser() {
    energyReserve = 10;
    temperature = 24;
  }

  public boolean fire() {
    if(energyReserve > 0 && temperature < 100) {
      energyReserve--;
      temperature++;
      return true;
    }
  }

  public boolean operable() {
    if(energyReserve > 0 && temperature < 100) {
      return true;
    }
    return false;
  }
}
