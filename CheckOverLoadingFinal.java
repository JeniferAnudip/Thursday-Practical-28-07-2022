class A
{
 final void check() 
{
  System.out.println("Statement 1");
}
  final void check( int k) 
{
  System.out.println("Statement 2"+k);
}
}

class CheckOverLoadingFinal{
  public static void main(String[] args)
{
   A k = new A();
   k.check();
   k.check(5);
   
}
}