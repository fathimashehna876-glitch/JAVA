import java.util.Scanner;

public class Employee
{
    int empid, TA, DA, HRA, TAX, netsal, basic;
    String empname;

    void getdata()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee name, id, Basic pay, TA, DA, HRA and TAX");

        empname = scan.nextLine();
        empid = scan.nextInt();
        basic = scan.nextInt();
        TA = scan.nextInt();
        DA = scan.nextInt();
        HRA = scan.nextInt();
        TAX = scan.nextInt();
    }

    void cal()
    {
        netsal = (basic + TA + DA + HRA) - TAX;
        System.out.println("Net Salary: " + netsal);
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee();

        e1.getdata();

        System.out.println("\nEmployee Details");
        System.out.println("------------");
        System.out.println("Employee ID: " + e1.empid);
        System.out.println("Employee Name: " + e1.empname);

        e1.cal();
    }
}
