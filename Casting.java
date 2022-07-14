class Casting
{
   public static void main(String[ ]args)
      {
        char c='Q';
        int i=c;
        System.out.println("i="+i+" "+"c=" +c);
        double d=323.142;
        i=(int)d;
       System.out.println("d="+d+" "+"  i="+  i);
       float f=72.38f;
       i=(int)f;
      System.out.println("f="+f+" "+"  i="+i);
       byte b=(byte) d;
        System.out.println("d="+d+" "+"  b="+b);
    }
}
       