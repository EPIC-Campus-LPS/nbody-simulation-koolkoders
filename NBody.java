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
//Calculating force FROM p1 to P2 🤑🤑🤑🤑🤑
    public static long yForce(Planet p1, Planet p2) {

        double g = 6.67 * Math.pow(10,-11);


        // change in x = planet1 x - planet2 x
        // change in y = planet1 y - planet2 y
        long deltaX = p1.getxCoord() - p2.getxCoord();
        long deltaY = p1.getyCoord() - p2.getyCoord();

        // r = square root of ((change in x)(squared) + (change in y)(squared))
        long r = (long) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        // force = (G*m1*m2) / (r squared)
        long force = (long) ((g * p1.getMass() * p2.getMass()) / (r * r)) ;

        // angel = 😇😇😇😇😇
        // angle = (change in y) / r
        // DON'T GET THEM CONFUSED
        long angle = deltaY / r;

        // y force = force * sin(angle)
        long yForce = (long) (force * Math.sin(angle));

        return yForce;
    }

}
