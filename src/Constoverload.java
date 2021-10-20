public class Constoverload {
    //Java program to overload constructors
        int id;
        String name;
        int age;
        //creating two arg constructor
        Constoverload(int i,String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        Constoverload(int i,String n,int a){
            id = i;
            name = n;
            age=a;
        }
        void display(){System.out.println(id+" "+name+" "+age);}

        public static void main(String args[]){
            Constoverload s1 = new Constoverload(111,"Karan");
            Constoverload s2 = new Constoverload(222,"Aryan",25);
            s1.display();
            s2.display();
        }
    }




