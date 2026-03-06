import java.util.Scanner;
public class Emp
{
    int empno;
    String name;
    void getdata()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n \n Enter Employee Name:");
        name =scan.nextLine();
        System.out.println("\n \n Enter Emp no:");
        empno = scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No:"+empno);
    }
public static void main(String args[])
{
    Emp e=new Emp();
    e.getdata();
    System.out.println("\n \n Enter Employee Details \n");
    System.out.println("\n \n ----------\n");
    e.display();
}
}