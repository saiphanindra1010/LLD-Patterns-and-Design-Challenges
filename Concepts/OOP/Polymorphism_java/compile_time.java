package Concepts.OOP.Polymorphism_java;
/*also known as static Polymorphism we can achieve using method overloading 
 * method overloading : same name,same class with diff args or type of args
 * 
 */
public class compile_time {
      public void print()
      {
         System.out.println("this is no arg print");
      }
            public void print(int num)
      {
         System.out.println("this is 1 arg method");
      }
      public void main(int num)
      {
         System.out.println("this is 1 arg method");
      }
   public static void main(String[] args) {
    compile_time ct=new compile_time();
    ct.print();
    ct.print(3);
   } 
}
