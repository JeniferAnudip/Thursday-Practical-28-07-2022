class A
{
 static void check() 
{
  System.out.println("Statement 1");
}
 static void check(int k){
  System.out.println("Statement 2"+k);
}
}
class CheckOverLoadingStatic{
  public static void main(String[] args)
{
   A k = new A();
   k.check();
   k.check(10);
}
}