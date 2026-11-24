class student
{
String name;
static string college="akash";
}
class demo
{
public static void main(string[]args)
{
student s1=new student();
        s1.name="ram";
        s1.name="arjun";
student s2=new student();
        s2.name="vijay";
System.out.println(s1.name+ "" +s1.college);
System.out.println(s2.name+ "" +s2.college);
}
}