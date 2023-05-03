package ourEnum;

public class Main {
    public static void main(String[] args) {
        System.out.println(Direction.EAST);
        System.out.println(Direction.NORTH);
        System.out.println(Direction.SOUTH);
        System.out.println(Direction.WEST);

        Direction tr = Direction.WEST;

        switch (tr) {
            case EAST:
                System.out.println("This is east");
                break;
            case WEST:
                System.out.println("This is west");
                break;
            case NORTH:
                System.out.println("This is north");
            case SOUTH:
                System.out.println("This is south");
            default:
                System.out.println("You can go where you want");
        }
        //методы класса Enum:
        // .values() - содержит список всех констант нашего Enum
        //enumeration
        System.out.println("---------------------------------");
        Direction.values();
        for (Direction dir : Direction.values()) {
            System.out.println(dir);
        }
        //.valueOf() - возвращает ту из констант enum, значение которой соот-ет строке,
        //передаваемой в этом методе
        System.out.println(Direction.valueOf("SOUTH"));
        Direction south = Direction.valueOf("SOUTH");
        Direction west = Direction.WEST;


    }
}
