import java.util.Scanner;
import java.io.File;
public class NBody {

    private double duration;
    private static double tIncrement;

    public NBody(double d, double t) {
        duration = d;
        tIncrement = t;
    }

    public static void main (String[] args) throws Exception {

        // Takes input from text file and puts it into variables and an array
        File file = new File("C:\\Users\\mariev718_lpsk12\\IdeaProjects\\nbody-simulation-koolkoders\\planets.txt");

        Scanner input = new Scanner(file);

        int numBodies = Integer.parseInt((input.nextLine()));

        Planet[] bodies = new Planet[numBodies];

        String uRadius = input.nextLine();

        // Constructs each planet in the bodies array
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

    // updates forces for each planet in an array
    public static void updateForces(int numBodies, Planet bodies[]) {

        for(int k = 0; k < numBodies; k++) {

            long yf = 0;
            long xf = 0;

            for(int j = 0; j < numBodies; j++) {

                if((k != j) && (k != 3)) {

                    yf += yForce(bodies[k], bodies[j]);

                    xf += xForce(bodies[k], bodies[j]);

                }

            }

            bodies[k].setyForce(yf);
            bodies[k].setxForce(xf);

            long nf = (long) Math.sqrt((yf*yf) + (xf*xf));
            bodies[k].setNetForce(nf);

        }

    }

    public static void updateVelocity(Planet p) {



    }

    public static void updatePosition(Planet p) {

        p.setxCoord((long)(p.getxVelocity() * tIncrement));
        p.setyCoord((long)(p.getyVelocity() * tIncrement));

    }

    public static void updateAcceleration(Planet p) {

        p.setxAccel(p.getxForce() / p.getMass());
        p.setyAccel(p.getyForce() / p.getMass());

    }

    // Calculates the y Force between planet 1 and planet 2
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
        return (long) (force * Math.sin(angle));
    }

    // Calculates x Force between planet 1 and planet 2
    public static long xForce(Planet p1, Planet p2) {

        double g = 6.67 * Math.pow(10,-11);


        // change in x = planet1 x - planet2 x
        // change in y = planet1 y - planet2 y
        long deltaX = p1.getxCoord() - p2.getxCoord();
        long deltaY = p1.getyCoord() - p2.getyCoord();

        // r = square root of ((change in x)(squared) + (change in y)(squared))
        long r = (long) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

        // force = (G*m1*m2) / (r squared)
        long force = (long) ((g * p1.getMass() * p2.getMass()) / (r * r)) ;

        // angle = (change in x) / r
        long angle = deltaX / r;

        // x force = force * sin(angle)
        return (long) (force * Math.cos(angle));
    }

    public static long xForce() {

        return 0L;

    }

    public static long fTotal() {

        return 0L;

    }



}
