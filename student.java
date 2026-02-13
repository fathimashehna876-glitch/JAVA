import java.util.Scanner;

public class student
{
    int rollNo, m1, m2, m3;
    String name;
    int total;
    float avg;

    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter student Name, Roll No and marks of 3 Subjects:");

        name = scan.nextLine();
        rollNo = scan.nextInt();
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        m3 = scan.nextInt();
    }

    void cal()
    {
        total = m1 + m2 + m3;
        avg = total / 3.0f;

        System.out.println("Total marks: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String args[])
    {
        student r = new student();

        r.getData();

        System.out.println("\n\nStudent Details\n");
        System.out.println("Name: " + r.name);
        System.out.println("Roll No: " + r.rollNo);

        r.cal();
    }
}
