// The Concept Of Multitasking
// To help users Operating System accommodates users the privilege of multitasking, where users can perform multiple actions simultaneously on the machine. This Multitasking can be enabled in two ways: 

// 1. Process-Based Multitasking 
// 2. Thread-Based Multitasking 

// Thread :-
 
package Java_Adv.TenThread;

class House extends Thread
{
    public void run()
    {
        System.out.println("Hello, World !");
    }
}

public class Basic {
    public static void main(String[] args) {
        
        new House().start();
    }
}
