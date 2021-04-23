public class Wizzard extends Human {
    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }
    public void health(Human target) {
        target.health += this.intelligence;
    }
    public void fireball(Humana target) {
        target.hjealth -= (this.intelligence * 3);
    }
}