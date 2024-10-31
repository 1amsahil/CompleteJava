// What is Polymorphism in Java ?
// Java Polymorphism is the ability of a message to be displayed in more than one form. Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.

// Types of Java Polymorphism
// In Java Polymorphism is mainly divided into two types: 

// 1.) Compile-time Polymorphism
// 2.) Runtime Polymorphism

// 1.) Compile-Time Polymorphism in Java :- 
//      It is also known as static polymorphism. This type of polymorphism is achieved by function/Method overloading. 

// 2.) Runtime Polymorphism in Java :-
//      It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding. Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class. That base function is said to be overridden.

package Java_OOPs.SevenPolymorphism;

class A
{
    public void show()
    {
        System.out.println("Inside A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("Inside B");
    }   
}

class C extends B
{
    public void show()
    {
        System.out.println("Inside C");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }   
}
