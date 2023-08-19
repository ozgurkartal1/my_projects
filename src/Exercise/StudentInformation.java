package Exercise;

import java.util.Scanner;

public class StudentInformation {

    private String name = " ";
    private String surname = " ";
    private int schoolNumber;
    public double balance = 0;

   public StudentInformation(String name, String surname, int schoolNumber){
       this.name = name;
       this.surname = surname;
       this.schoolNumber = schoolNumber;
   }

    public void LoadMoney() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value you want to load : ");
        int loadedMoney = input.nextInt();

        this.balance += loadedMoney;
    }

    public void TakeCourse() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter course you want to get : Math Course(0), English Course(1), Computer Course(2) ->");
        byte numberOfChoosen = input.nextByte();
        String nameOfCourse = " ";
        double priceOfCourses = 0;
        switch (numberOfChoosen) {
            case 0:
                nameOfCourse = "Math Course";
                priceOfCourses = 500;
                while (true) {
                    if (this.balance >= priceOfCourses) {
                        System.out.println("You can get " + nameOfCourse);
                        System.out.println("The ramaining balance is $" + (this.balance - priceOfCourses));
                        System.exit(1);
                    } else {
                        System.out.println("Please load enough money. " + nameOfCourse + " Courses is -> $" + priceOfCourses);
                        LoadMoney();
                    }
                }
            case 1:
                nameOfCourse = "English Course";
                priceOfCourses = 450;
                while (true) {
                    if (this.balance >= priceOfCourses) {
                        System.out.println("You can get " + nameOfCourse);
                        System.out.println("The ramaining balance is $" + (this.balance - priceOfCourses));
                        System.exit(1);
                    } else {
                        System.out.println("Please load enough money. " + nameOfCourse + " Courses is -> $" + priceOfCourses);
                        LoadMoney();
                    }
                }
            case 2:
                nameOfCourse = "Computer Course";
                priceOfCourses = 600;
                while (true) {
                    if (this.balance >= priceOfCourses) {
                        System.out.println("You can get " + nameOfCourse);
                        System.out.println("The ramaining balance is $" + (this.balance - priceOfCourses));
                        System.exit(1);
                    } else {
                        System.out.println("Please load enough money. " + nameOfCourse + " Courses is -> $" + priceOfCourses);
                        LoadMoney();
                    }
                }
            default:
                System.out.println("Invalid input. Please enter a valid number");
                System.exit(1);
        }
    }

    public void EnterSystem() {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter student's name : ");
            String name = input.nextLine();

            System.out.print("Enter student's surname : ");
            String surname = input.nextLine();

            System.out.print("Enter student's school number : ");
            int schoolNumber = input.nextInt();

            if (name.toLowerCase().equals(this.name.toLowerCase()) && surname.toLowerCase().equals(this.surname.toLowerCase()) &&
                    schoolNumber == this.schoolNumber) {
                System.out.println("Login is succesful. You can go course purchase page... ");
                TakeCourse();
                System.exit(1);
            } else {
                System.out.println("Login is unsuccesful. Informations are incorrect. Try again...");
            }
        }
    }
}
