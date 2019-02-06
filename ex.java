class Person
{
String name;
int age;
char  g;
Person(String name,int age,char g)
{
this.name=name;
this.age=age;
this.g=g;
}
}
class Student extends Person{
int roll;
int marks;
Student(String name,int age,char g,int roll,int marks)
{
super(name,age,g);
this.roll=roll;
this.marks=marks;
System.out.println(name +"\n"+age +"\n"+ g +"\n"+ roll +"\n"+marks);
}
}
class Teacher extends Person{
int salary;
String sub;
Teacher(String name,int age,char g,int salary,String sub)
{
super(name,age,g);
this.salary=salary;
this.sub=sub;
System.out.println(name +"\n"+age +"\n"+ g +"\n"+ salary +"\n"+sub);
}
}
class ex 
{
public static void main(String args[]){
Student s=new Student("yasir",20,'M',123,80);
Teacher t=new Teacher("yasir",20,'M',2555,"java");
}
}
