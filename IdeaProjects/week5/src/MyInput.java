import java.util.Scanner;

public class MyInput {
    public static void main(String[] arg) {

        String name, message;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your first name.");
        name = myObj.next();

        System.out.println("Hello "+name+", please enter your age");
        age = myObj.nextInt();

        System.out.println("Thank you "+name+", now enter your yearly salary");
        salary = myObj.nextDouble();



if (salary < 50_000) {
        message = "Times are tough.";
    } else if(salary >= 50_000 && salary < 60_000) {
        message = "Not bad, but hard to survive in Seattle.";
    } else if(salary >= 60_000 && salary < 70_000) {
        message = "Salary is improving.";
    } else if(salary >= 70_000 && salary < 80_000) {
        message = "Almost livable in Seattle.";
    } else {
        message = "Doing well!";
}
        System.out.println("First Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: $"+salary);
        System.out.println("Message: "+message);


    }
}
