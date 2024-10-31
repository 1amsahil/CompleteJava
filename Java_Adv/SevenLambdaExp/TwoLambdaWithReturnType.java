package Java_Adv.SevenLambdaExp;

@FunctionalInterface
interface Network
{
    public String server(int code);
}

public class TwoLambdaWithReturnType {
    public static void main(String[] args) {

        // Lambda Expression with Return Type

        Network lane = (int code) -> 
                        {
                            return "Lane : Error 404";
                        };

        System.out.println(lane.server(9));

        // Modified Lambda Expression with Return Type

        Network fastlane = code -> "FastLane : Error 404";
        
        System.out.println( fastlane.server(10) );
    }
}
