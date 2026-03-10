package collections;

import java.util.*;
public class Student_Attendence {

    public static void main(String[] args) {

        System.out.println("Welcome to the attendance Management System" +
                "\n Enter the password to continue;");
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int password = 1111;
        if (n == password) {
            ArrayList<String> lst = new ArrayList<>();
            ArrayList<Integer> marks = new ArrayList<>();
            while (true) {
                System.out.println("Choose one of the following option" +
                        "\n 1-For registering" +
                        "\n 2-Acces the materials" +
                        "\n 3-Access Total Marks" +
                        "\n 4-Change the password");

                int a = sc.nextInt();
                switch (a) {
                    case 1:

                        System.out.println("Enter the student details");
                        sc.nextLine();
                        String c = sc.nextLine();
                        lst.add(c);
                        int e = sc.nextInt();
                        marks.add(e);
                        break;
                    case 2:
                        System.out.println("Enter the Materials you want to access");
                        System.out.println("1-for pdf" +
                                "\n 2-for doc");
                        int d = sc.nextInt();

                        System.out.println("You have accessed");
                        break;
                    case 3:
                        System.out.println("Enter the student name for total marks");
                        String f = sc.nextLine();

                        if(lst.contains(f)){
                            marks.get(lst.indexOf(f));
                        } else {
                            System.out.println("Student does not exist");
                        }
                        break;

                    case 4:
                        System.out.println("Enter the new password");
                        int g = sc.nextInt();
                        password=g;
                        break;

                    case 5:
                        System.out.println("Thank you for visiting");
                        return;

                }
            }
        }else{
                    System.out.println("Wrong password");
                }
            }
        }