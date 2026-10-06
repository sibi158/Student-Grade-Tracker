import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] grades = new int[100];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT GRADE TRACKER =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Show Average Grade");
            System.out.println("4. Show Highest Grade");
            System.out.println("5. Show Lowest Grade");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 100) {
                        System.out.print("Enter student name: ");
                        names[count] = sc.next();

                        System.out.print("Enter grade: ");
                        grades[count] = sc.nextInt();

                        count++;

                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students added.");
                    } else {
                        System.out.println("\n===== STUDENT DETAILS =====");

                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                (i + 1) + ". " + names[i] + " : " + grades[i]
                            );
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No grades available.");
                    } else {
                        int total = 0;

                        for (int i = 0; i < count; i++) {
                            total = total + grades[i];
                        }

                        double average = (double) total / count;

                        System.out.println("Average Grade: " + average);
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No grades available.");
                    } else {
                        int highest = grades[0];

                        for (int i = 1; i < count; i++) {
                            if (grades[i] > highest) {
                                highest = grades[i];
                            }
                        }

                        System.out.println("Highest Grade: " + highest);
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No grades available.");
                    } else {
                        int lowest = grades[0];

                        for (int i = 1; i < count; i++) {
                            if (grades[i] < lowest) {
                                lowest = grades[i];
                            }
                        }

                        System.out.println("Lowest Grade: " + lowest);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Student Grade Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}