import java.util.*;
class showroom
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    Scanner in=new Scanner(System.in);
showroom()
{
    String name="";
    long mobno=0;
    
}
void input()
{
    System.out.println("Enter your name and mobile number");
    name=in.nextLine();
    mobno=in.nextInt();
    System.out.println("Enter the cost");
    cost=in.nextInt();
}
void cal()
{
    if(cost<=10000)
    amount=cost-(cost * 5 / 100);
    else if(cost> 10000 && cost<=20000)
    amount=cost-(cost*10/100);
    else if(cost>20000 && cost<=35000)
    amount=cost-(cost*15/100);
    
}
void display()
{
System.out.println("Name of person is " + name);
System.out.println("Monile number is " + mobno);
System.out.println("Amount to be paid is " + amount);
}
public static void main(String args[])
{
    showroom ob=new showroom();
    ob.input();
    ob.cal();
    ob.display();
}
}
