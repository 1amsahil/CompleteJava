package Java_Adv.FourEnum;

enum Stats
{
    Running, Success, Pending, Failed;
}

public class IfElseAndSwitch
{
    public static void main(String[] args) {

        Stats s = Stats.Running;

        if(s == Stats.Running)
        {
            System.out.println("All Good");
        }

        else if(s == Stats.Success)
        {
            System.out.println("Done");
        }

        switch(s)
        {
            case Running : System.out.println("All Good");
            break;

            case Success : System.out.println("Done");
            break;

            case Pending : System.out.println("Please Wait");
            break;

            default : System.out.println("Try Again");
            break;
        }
    }
}