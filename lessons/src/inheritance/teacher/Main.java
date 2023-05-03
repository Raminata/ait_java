package inheritance.teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println(javaTeacher.school);
        System.out.println(javaTeacher.job);
        System.out.println(javaTeacher.mainSubject);
        javaTeacher.work();

        FrontendTeacher frontendTeacher = new FrontendTeacher();
        System.out.println("Frontend teacher");
        System.out.println(frontendTeacher.school);
        System.out.println(frontendTeacher.job);
        System.out.println(frontendTeacher.mainSubject);
        javaTeacher.work();

        Teacher teacher = new Teacher();
        //teacher.
        //javaTeacher.
        //frontendTeacher.

        Teacher javaTeacher1 = new JavaTeacher();
        Teacher frontendTeacher1 = new FrontendTeacher();
        //javaTeacher1.
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();


    }

}
