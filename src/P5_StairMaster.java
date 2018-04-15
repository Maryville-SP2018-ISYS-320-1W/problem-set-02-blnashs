/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_StairMaster {

    public static final int LENGTH=5;

    // The 'main method' prints out all the stairs with the appropriate indentations.
    public static void main(String[] args) {
        // outer loop
        for (int allStairs=0; allStairs<=4; allStairs++) {
            // first nested loops print the heads and tops of steps
            for (int spaces=1; spaces<=(-5*allStairs+20); spaces++) {
                printSpace();
            }
            System.out.print("    ******");
            for (int backWall=0; backWall<allStairs*(LENGTH); backWall++) {
                printSpace();
            }
            printStar();
            // second nexted loops print the body and the backs of the stairs
            for (int spaces = 1; spaces <= (-5 * allStairs + 20); spaces++) {
                printSpace();
            }
            System.out.print("  *");
            for (int backWall=1; backWall<=LENGTH*(allStairs+1); backWall++) {
                printSpace();
            }
            printStar();
            // third nested loops print the legs and lower backs of stairs
            for (int spaces = 1; spaces <= (-5 * allStairs + 20); spaces++) {
                printSpace();
            }
            System.out.print("  *");
            for (int backWall=1; backWall<=LENGTH*(allStairs+1); backWall++) {
                printSpace();
            }
            printStar();
        }
        // this loop prints the very bottom line of stars
        for (int lastLine=1; lastLine<=32; lastLine++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // printSpace() prints out a space
    public static void printSpace() {
        System.out.print(" ");
    }

    // printStar() prints out an asterisk
    public static void printStar() {
        System.out.println("*");
    }
}