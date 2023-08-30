import java.util.Scanner;
import java.io.File;
public class NBody {

    private double duration;
    private double tIncrement;

    public NBody(double d, double t) {
        duration = d;
        tIncrement = t;
    }

    public static void main (String[] args) throws Exception {

        File file = new File("C:\\Users\\mariev718_lpsk12\\IdeaProjects\\nbody-simulation-koolkoders\\planets.txt");

        Scanner input = new Scanner(file);

        int numBodies = Integer.parseInt((input.nextLine()));

        Planet[] bodies = new Planet[numBodies];

        String uRadius = input.nextLine();

        for(int i = 0; i < numBodies; i++) {

            String line = input.nextLine();

            String[] temp = line.split(" ");

            long xCoord = Long.parseLong(temp[0]);
            long yCoord = Long.parseLong(temp[1]);
            long xVel = Long.parseLong(temp[2]);
            long yVel = Long.parseLong(temp[3]);
            long mass = Long.parseLong(temp[4]);
            String fortnite2 = temp[5];



            bodies[0] = new Planet(xCoord, yCoord, xVel, yVel, mass, fortnite2);

        }

    }

    public static long yForce() {

        long deltaX;
        long deltaY;
        long r;
        long force;
        long yForce;
        long angle;



        // change in x = sun x - earth x
        // change in y = sun y - earth y

        // r = square root of ((change in x)(squared) + (change in y)(squared))

        // force = (G*m1*m2) / (r squared)

        // y force = force * sin(angle)
        // angle = (change in y) / r
        // angel = 😇😇😇😇😇

    }

}
