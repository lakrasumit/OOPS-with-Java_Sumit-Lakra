import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {

    public void writeStudent() {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("students.txt", true);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            fw.write(id + " " + name + " " + marks + "\n");
            fw.close();

        } catch (InputMismatchException e) {
            System.out.println("IInvalid Input");

        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public void readStudents() {
        try {
            Scanner sc = new Scanner(new File("students.txt"));
            System.out.println("\nStudent Records:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
