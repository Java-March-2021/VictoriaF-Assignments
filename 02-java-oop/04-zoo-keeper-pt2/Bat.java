public class Bat extends Mammal{

    public Bat(int energyLevel) {
        super(300);
    }
    public void fly() {
        System.out.println("hey im a bat");
        energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.printlm("eating humans");
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("im attacking town");
        energyLevel -= 100;
    }
 }