package BodyProgramming;

public class Badr {
    public static void main(String[] args) {
        /********************************
         * Data Types:
         * Numbers --> (-128 , 2 --> 127), (1, 2 --> 32000), (0, 1 , 2, 34646464), (0, 945145757164645464L) , (1.5, -3.45, 0.87), (1.545245487845456)
         *            [     Byte (byte)  <   Short (short)  <    Integer (int)   <      Long (long)    ],  Float (float)  <  Double (double)
         * Characters --> char ( 'Q' != 'q' ) , ('5'), (' '), ('.'), ('@'), ('\'' )
         * Booleans --> boolean (true), (false)
         * Strings --> ("Hello World!"), ("5"), (" "), ("hello " + "World" + "!")
         *******************************/
        /********************************
         * How to name a variable:`
         * 1 - No spaces ( X String first name = "BodyProgramming.Badr" X)
         * 2 - NO special chars except '_' (X String first*-name = "BodyProgramming.Badr" X)
         * 3 - In Java it's recommended to use Camel Case style [start with capital char from the second word]
         * ex : String firstName = "BodyProgramming.Badr"
         * If the name is an abbreviation, so all capitals
         * ex : USB, UPS, DSL, LAN, WAN, USA
         *******************************/
        byte x = 127;
        System.out.println(x);
        short y = 32000;
        System.out.println(y);
        int z = -4545154;
        System.out.println(z);
        long k = 945145757164645464l;
        System.out.println(k);
        float p =  1.56642538343f;
        System.out.println(p);
        double q = 1.56642538343;
        System.out.println(q);
        int a = 7;
    }
}