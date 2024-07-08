import java.util.*;
class Employee
{
    int eno,esalary;
    String ename;
    void read(int no,int sal,String name)
    {
        this.eno=no;
        this.esalary=sal;
        this.ename=name;
    }
    void display()
    {
        System.out.println("Employee no :"+eno);
        System.out.println("Employee name :"+ename);
        System.out.println("Employee salary :"+esalary);
    }
}
public class index
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=s.nextInt();
        Employee[] obj=new Employee[n];
        for (int i=0;i<n;i++)
        {
            obj[i]=new Employee();
            System.out.println("Enter Employee no :");
            int no=s.nextInt();
            System.out.println("Enter Employee name :");
            String name=s.next();
            System.out.println("Enter Employee salary :");
            int sal=s.nextInt();
            obj[i].read(no,sal,name);
        }
        System.out.println("Employee deatails");
        for(int i=0;i<n;i++)
            obj[i].display();
        System.out.println("Enter the search value");
        int sval=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(obj[i].eno==sval)
            obj[i].display();
        }
    }
}