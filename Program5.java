//import stuff here?

//Your code here
public class Program5{
    public static void main(String[] args) {
        int royaleMiles = 286;
        int koopaKingMiles = 412;
        int pipeFrameMiles = 361;
        int badwagonMiles = 161;
        int royaleGallons = 9;
        int koopaKingGallons = 40;
        int pipeFrameGallons = 18;
        int badwagonGallons = 11;
        
        double royaleAverage =  (((int)((((double) royaleMiles / royaleGallons) + 0.05) *10))/10.0);
        double koopaKingAverage = (((int)((((double) koopaKingMiles / koopaKingGallons) + 0.05) *10))/10.0);
        double pipeFrameAverage = (((int)((((double) pipeFrameMiles / pipeFrameGallons) + 0.05) *10))/10.0);
        double bandwagonAverage = (((int)((((double) badwagonMiles / badwagonGallons) + 0.05) *10))/10.0);
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon");
        System.out.println("Royale averaged " + royaleAverage + " m/g");
        System.out.println("Koopa King averaged " + koopaKingAverage + " m/g");
        System.out.println("Pipe Frame averaged " + pipeFrameAverage + " m/g");
        System.out.println("Bandwagon averaged " + bandwagonAverage + " m/g");
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Bandwagon averaged 14.6 m/g
*/
