import java.util.Scanner;
class StudentInfo
{
  public static void main(String[ ] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter Student ID:");
       long id=sc.nextLong();
       
       System.out.println("Enter Student Name:");
       String name=sc.next();

      System.out.println("Enter Address:");
      String address=sc.next();
      
      System.out.println("Enter MobileNo.:");
      long mb=sc.nextLong();

      System.out.println("Gender(M/F):");
      char gender=sc.next().charAt(0);

       System.out.println("Date Of Birth:");
       String dob=sc.next();

       System.out.println("Height:");
       float height=sc.nextFloat();

       System.out.println("Weight:");
       byte weight=sc.nextByte();
      
       System.out.println("Degree Persued:");
      String degree=sc.next();
      
       System.out.println("Year Of Study:");
       int year=sc.nextInt();

       System.out.println("Average GPA:");
       float gpa=sc.nextFloat();

       System.out.println("Tution Grant(with/without):");
       String tution_grant=sc.next();
      
      System.out.println("is/is not Scholar):");
      String scholar=sc.next();

        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");


     System.out.println("Student ID:"+id);
     System.out.println("Student Name:"+name);
     System.out.println("Address:"+address);
     System.out.println("MobileNo.:"+mb);
     System.out.println("Gender:"+gender);
     System.out.println("Date Of Birth:"+dob);
     System.out.println("Height:"+height);
     System.out.println("Weight:"+weight);
     System.out.println("Degree Persued:"+degree);
     System.out.println("Year Of Study:"+year);
     System.out.println("Average GPA:"+gpa);
     System.out.println("Tution Grant(with/without):"+tution_grant);
     System.out.println("is/is not Scholar):"+scholar);
   }
}

   





     


  