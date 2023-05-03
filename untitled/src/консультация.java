
public class консультация {
    public static void main(String[] args) {
        int book1=1699;
        int book2=2556;
        int book3=540;

        //-----------------------------------------
        String strMin="";
        String strMidl="";
        String strMax="";
        int min=0;
        int midl=0;
        int max=0;

        if(book1>book2){
            min=book2;
            strMin="book2";
            max = book1;
            strMax = "book1";
        } else {
            min=book1;
            strMin="book1";
            max = book2;
            strMax= "book2";
        }
        if(min<=book3 && book3<=max){
            midl= book3;
            strMidl = "book3";
        } else if (book3>max){
            midl = max;
            strMidl=strMax;
            max=book3;
            strMax="book3";
        } else {
            midl = min;
            strMidl=strMin;
            min=book3;
            strMin= "book3";
        }
        //----------------------------------------

        System.out.println("min: "+strMin + "("+min+")");
        System.out.println("midl: "+ strMidl+ "("+midl+")");
        System.out.println("max: "+strMax+ "("+max+")");

    }
}

