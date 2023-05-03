package list.tasks.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ListTasksTest {
    private ListTasks listTasks;

    @BeforeEach
    public void init() {
        listTasks = new ListTasks();
        System.out.println("hey");
    }


    @Test
    public void test1() {
        listTasks.compareYesNo(new ArrayList<>(), new ArrayList<>());
    }
    @Test
    public void test2() {
        listTasks.compareYesNo(new ArrayList<>(), new ArrayList<>());
    }
    @Test
    public void test3() {
        listTasks.compareYesNo(new ArrayList<>(), new ArrayList<>());
    }
}