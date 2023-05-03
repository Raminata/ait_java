public class Array1 {
    public static void main(String[] args) {
        String[] patients = new String[30];
        System.out.println(patients[0]);

        for(int i=0; i<30; i++){
            patients[i] = "Patient " + (i+1);
            System.out.println(patients[i]);
        }
    }
}



