class StudentInfo
{
  public static void main(String[ ] args)
    {
       Scanner sc=new Scanner(System.in)
       
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
       float height=sc.nexFloat();

       System.out.println("Weight:");
       byte weight=sc.nextByte();
      
       System.out.println("Degree Persued:");
      String degree=sc.next();
      
       System.out.println("Year Of Study:");
       int year=sc.nextInt();

       System.out.println("Average GPA:");
       float gpa=sc.nexFloat();

     System.out.println("Tution Grant(with/without):");
       String tution-grant=sc.next();
      

        
       


   
       
    }
}