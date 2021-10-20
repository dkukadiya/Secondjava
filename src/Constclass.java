public class Constclass //Learning about constructor overleading
{
  Constclass (int a)
  {
      System.out.println("My first Constructor");
  }
  Constclass(double b,int a)
  {
      System.out.println("My second Constructor");
  }
  Constclass(char c,double b,int a)
  {
      System.out.println("My third Constructor");
  }
  Constclass(char c,double b)
  {
      System.out.println("My fourth Constructor");
  }
   Constclass (double b)
  {
      System.out.println("My fifth Constructor");
  }
  public static void main(String[] args)
  {
      System.out.println("we love software testing");
      new Constclass(1);
      new Constclass(2.45,2);
      new Constclass('M',3.4,7);
      new Constclass('D',7.8);
      new Constclass(5.67);
  }

}
