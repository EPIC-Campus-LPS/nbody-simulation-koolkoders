import java.util.Scanner;

public class Planet { //ben make a accident

    // x-coordinate of planet
    private long xCoord;
    private long yCoord;
    private long xVelocity;
    private long yVelocity;
    private long mass;
    private String fileName;

    public Planet (long xC, long yC, long xV, long yV, long m, String i) {

        xCoord = xC;
        yCoord = yC;
        xVelocity = xV;
        yVelocity = yV;
        mass = m;
        fileName = i;

    }

    public long getxCoord() {

        return xCoord;

    }

    public long getyCoord() {

        return yCoord;

    }

    public long getxVelocity() {

        return xVelocity;

    }

    public long getyVelocity() {

        return yVelocity;

    }

    public long getMass() {

        return mass;

    }

    public void setxCoord(long xC) {

        xCoord = xC;

    }

    public void setyCoord(long yC) {

        yCoord = yC;

    }

    public void setxVelocity(long xV) {

        xVelocity = xV;

    }

    public void setyVelocity(long yV) {

        yVelocity = yV;

    }

    public void setMass(long m) {

        mass = m;

    }

}
