public class Mammal {
    public static void main(String[] args){
        protected int energyLevel = 100;

        public int displayEnergy() {
            return energyLevel;
            System.out.println("Energy Level:" + energyLevel);
            
        }
        public Mammal(int energyLevel) {
            this.energyLevel = energyLevel;
        }
    }
  
}