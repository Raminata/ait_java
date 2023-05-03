package animals_veterenar;

public class Dog extends Animal {
        String bread;

        public Dog(String name, String bread) {
            super(name);
            this.bread = bread;
        }

        public void makeNoise() {
            System.out.println("Gav - gav...");
        }

        public void eat() {
            System.out.println("Dog is eating");
        }

        public void getDescription() {
            System.out.println("Description of dogs");
        }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


