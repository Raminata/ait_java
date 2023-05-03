public abstract class Project {
    private String title;
    protected double budget;

    public String getTitle(){
        return title;
    }



    public void info() {
        System.out.println(title);
    }

    public  void specialInfo(){
        info();
    }
    public Project(String title, double budget){
        this(title);
        this.budget = budget;
    }
    public Project(String title){
        this.title = title;
    }
    public Project(){
        System.out.println("Конструктор бзового класса");
    }

}
