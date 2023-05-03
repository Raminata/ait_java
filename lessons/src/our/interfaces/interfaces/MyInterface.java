package our.interfaces.interfaces;

public interface MyInterface {
    int getUserID(); //standard method

    default int getAdmin() {
        return 1;
    }
}
