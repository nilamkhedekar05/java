import java.io.Serializable;
class  Bus
 {
   private String color;
   public String getColor()
    {
       return color;
    }
      public void setColor(String c)
   {
      this.color=c;
   }
    public static void main(String[ ] args)
  {
    Bus b=new Bus();
    b.setColor("Red");
   System.out.println(b.getColor());
  }
}
