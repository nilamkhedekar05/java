class Transaction
{
  int withdrawamt=1000,depositeamt=2000,balanceamt=5000;
  public void withdraw()
  {
    balanceamt=balanceamt - withdrawamt;
    System.out.println("After Withdraw= "+balanceamt);
   }
   public void deposite()  
   {
     balanceamt=balanceamt+depositeamt;
     System.out.println("After Deposite="+ balanceamt);
    }
}
