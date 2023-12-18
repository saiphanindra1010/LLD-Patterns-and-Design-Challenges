/* Annotations are used to extract information about a program 
Annotations provide metadata to class or method */
package Concepts.OOP.miscellaneous;
class parent {
    public void showAge() {
        System.out.println("age of parent");
    }
}

class child1 extends parent {
    @Override
    public void showAge() {
        System.out.println("age of child");
    }
    @Deprecated
    public void oldAge() {
        System.out.println("age of child before");
    }
}

public class javaAnnotation {


    public static void main(String[] args) {

        child1 c1 = new child1();
        c1.showAge();
        c1.oldAge();
    }

}