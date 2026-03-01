import java.util.*;

class Employee1 {
    int empid;
    String name;

    Employee1(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public String toString() {
        return empid + " " + name;
    }
}

public class sort_by_name {

    public static void main(String[] args) {

        List<Employee1> e1 = new ArrayList<>();

        e1.add(new Employee1(34, "Ayush"));
        e1.add(new Employee1(35, "Hello"));
        e1.add(new Employee1(36, "Come1"));
        e1.add(new Employee1(37, "Ayu"));


        e1.sort((f1, f2) -> f1.name.compareTo(f2.name));

        System.out.println(e1);
    }
}