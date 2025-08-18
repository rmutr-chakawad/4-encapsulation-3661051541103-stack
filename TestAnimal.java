public class TestAnimal {
    public static void main(String[] args) {
        Animal anna, bird, fish, tiger;
        anna = new Animal();
        bird = new Bird();
        fish = new Fish();
        tiger = new Tiger();
        polymor(anna);
        polymor(bird);
        polymor(fish);
        polymor(tiger);
    }
    public static void  polymor(Animal animal){
        animal.move();
    }
}
