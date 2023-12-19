//JAVA DEVELOPMENT
//ONLINE EXAMINATION
import java.util.Scanner;
public class online_exam {
    public static void main(String[] args) {
        int no=4;
        int choice;
        String stu_name;
        int id = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name:");
        stu_name = sc.next();
        System.out.print("Enter Password:");
        id = sc.nextInt();
        int count = 0;
        System.out.println("Welcome "+stu_name+" to Online Examination");

        do{
            System.out.println("1.Take Exam");
            System.out.println("2.View Marks");
            System.out.println("3.Exit");
            System.out.print("Enter your choice:");
            no=sc.nextInt();
            if(no==4)
            {
                System.out.println("Thanks for taking exam!!");
                break;
            }
            switch(no)
            {
                case 1:
                {
                    System.out.println("Select programming language:");
                    System.out.println("1.Java \n2.C++");
                    System.out.println("Enter your choice:");
                    int sub=sc.nextInt();
                    System.out.println("There are five questions in the examination");

                    if(sub==1)
                    {
                        count=0;
                        System.out.println("1) Who invented Java Programming:");

                        System.out.println("1.James Gosling \n2.Dennis Ritchie\n3.Guido van Rossum\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("2) Which of the following is not a Java features?");
                        System.out.println("1.Dynamic\n2.Architecture Neutral\n3.Use of pointers\n4.Object-oriented");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("3) ____ is used to find and fix bugs in the Java programs.");
                        System.out.println("1.JVM\n2.JRE\n3.JDK\n4.JDB");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("4) What does the expression float a = 35 / 0 return?");
                        System.out.println("1) 0\n2.Not a Number\n3.Infinity\n4.Run time exception");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("5) Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
                        System.out.println("1.getClass()\n2.intern()\n3.getName()\n4.toString()");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();

                        if(choice==3)
                        {
                            ++count;
                        }
                    }
                    else
                    {
                        count=0;
                        System.out.println("Q.1.C++ is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C++ is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.C++ is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C++ is:");
                        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.C++ is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("You scored "+count+" out of 5");
                    break;
                }
                case 3:
                    return;
            }
        }while(true);

    }
    public online_exam() {
    }
}
