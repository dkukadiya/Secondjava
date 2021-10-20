public class Mkt //learning about non static and static variable in the main methods
{
 static int a=10; //static variable
 double b=0.01; //non static variable
  void dumb() //non static method
  {
      System.out.println("you are a dumb");
  }
 static void deaf() //static method
 {
     System.out.println("you are deaf");
 }
 public static void main(String[] args) //main method
 {
     System.out.println("we love software testing");
     deaf();
     Mkt m1=new Mkt();
     m1.dumb();
     System.out.println(a);//static variable print 10
     m1.b=80;
     System.out.println(m1.b); //nonstatic variable print 0.01
 }
}
