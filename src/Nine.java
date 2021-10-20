public class Nine //learning about method overloading
{
     void school(int a)
     {
         System.out.println("My first calling non static method");
     }
     static void school(double b,int a)
     {
         System.out.println("My second calling static method");
     }
     static void school(char c,double b,int a)
     {
         System.out.println("my third calling  static  method");
     }
     void school(char c,double b)
     {
         System.out.println("My fourth calling  non static method");
     }
     void school(double b)
     {
         System.out.println("My fifth calling non static method ");
     }
     public static void main(String[] args){
         System.out.println("we love software testing");
         Nine p1=new Nine();
         p1.school(10);
         school(20.12,8);
         school('A',10.30,25);
         p1.school('w',35.24);
         p1.school(34.78);
     }

}
