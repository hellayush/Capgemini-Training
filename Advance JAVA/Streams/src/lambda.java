import java.util.*;


interface lab {
    int add(int a, int b);
}


class my implements lab {
    public int add(int a, int b) {
        return a + b;
    }
}


class Employee {
    int empid;
    String name;

    Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    public String toString() {
        return empid + " " + name;
    }
}

public class lambda {

    public static void main(String[] args) {


        my c1 = new my();
        System.out.println("Sum: " + c1.add(6, 4));


        lab c2 = new lab() {
            public int add(int a, int b) {
                return a + b;
            }
        };


        lab c4 = (int a, int b) -> {
            return a + b;
        };

        lab c5 = (a, b) -> a + b;

        System.out.println("Lambda Sum: " + c5.add(10, 20));


        List<Employee> l1 = new ArrayList<>();

        l1.add(new Employee(34, "Ayush"));
        l1.add(new Employee(35, "Hello"));
        l1.add(new Employee(36, "Come1"));
        l1.add(new Employee(37, "Ayu"));


        Comparator<Employee> comp = new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
                return o1.empid - o2.empid;
            }
        };

        l1.sort(comp);


        l1.sort((e1, e2) -> e1.empid - e2.empid);

        System.out.println(l1);
    }
}