import java.util.Scanner;
class ScannerExample
{
   public static void main(String[ ]args)
      {
        int id;
        char gender;
        byte age;
        long mobileno;
        float cgpa;
     
                    Scanner sc=new Scanner(System.in);
    
                                System.out.println("Enter Student Id:");
                                id=sc.nextInt();
                                System.out.println("Student Id:" +id);

                                System.out.println("Enter Gender:");
                                gender=sc.next().charAt(0);
                                System.out.println("Gender:" +gender);
    
                                System.out.println("Enter Age:");
                                age=sc.nextByte();
                                System.out.println("Age:" +age);

                               System.out.println("Enter Mobile no:");
                               mobileno=sc.nextLong();
                              System.out.println("Mobile no:" +mobileno);
    
                              System.out.println("Enter CGPA:");
                             cgpa=sc.nextFloat();
                              System.out.println("CGPA:" +cgpa);
        }
 }
    

   
    
    
    