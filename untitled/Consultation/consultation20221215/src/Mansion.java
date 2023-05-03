public class Mansion extends Project {
    private int numberOfFloors = 2;
    private int numberOfRooms = 10;
    private int square = 200;

    public Mansion(String title,double budget,
                   int numberOfFloors,
                   int square, int numberOfRooms){
        super(title, budget);
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.square = square;
    }
    @Override
    public  void info(){
        super.info();
    }

    public Mansion(){
        System.out.println("Конструктор производного класса");
    }

   /* public void randomMethod() {
        int x = 10;
        System.out.println(x);
    }*/
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getSquare() {
        return square;
    }
}
