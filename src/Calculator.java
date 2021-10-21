public class Calculator {
   //instance variables-without static keyword
    int a=20;
    int b=10;
    gitpublic void add() // calling instance method
 {System.out.println(a+b);}public void subs()
 {
     System.out.println(a-b);
 }
 public void div()
 {
     System.out.println(a/b);
 }
 public void multi()
 {
     System.out.println(a*b);
 }
    // learning about creating new class and accessing static and non static method in a single class.
    public static void main(String[] args)
    {Calculator calculator=new Calculator();//this is object for calling non static method to static method
        calculator.add();
        calculator.subs();
        calculator.div();
        calculator.multi();}}



