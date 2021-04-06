import java.util.*;
class rate
{
    int r;
    int b;
    double sr;
    Scanner in=new Scanner(System.in);
    rate()
    {
        r=0;
        b=0;
        sr=0;
    }
    void input()
    {
        System.out.println("Enter the number of runs");
        r=in.nextInt();
        System.out.println("Enter the number of balls");
        b=in.nextInt();
    }
    void cal()
    {
        sr=(r*100)/b;
    }
    void print()
    {
        System.out.println("The strike rate of the batsman is   "  +sr);
    }
    public static void main(String args[ ])
    {
    rate ob=new rate();
    ob.input();
    ob.cal();
    ob.print();
}}






