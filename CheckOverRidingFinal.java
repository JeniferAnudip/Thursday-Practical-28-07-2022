class A
{
 final void check() 
{
  System.out.println("Statement 1");
}
}
class B extends A{
 final void check(){
 System.out.println("Statement 2");	
}
}
class CheckOverRidingFinal{
  public static void main(String[] args)
{
   A k = new A();
   k.check();
   
}
}