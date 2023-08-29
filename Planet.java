import java.util.Scanner;

public class Planet { //ben make a accident

    // x-coordinate of planet
    private long xCoord;
    private long yCoord;
    private long xVelocity;
    private long yVelocity;
    private long mass;
    private String fileName;
    private long xAcceleration;
    private long yAcceleration;


    public Planet (long xC, long yC, long xV, long yV, long m, String i, long xA, long yA) {

        xCoord = xC;
        yCoord = yC;
        xVelocity = xV;
        yVelocity = yV;
        mass = m;
        fileName = i;
        xAcceleration = xA;
        yAcceleration = yA;

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

    public long getxAcceleration() {

        return xAcceleration;

    }

    public long getyAcceleration() {

        return yAcceleration;

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

    public void setxAcceleration(long xA) {

        xAcceleration = xA;

    }

    public void setyAcceleration(long yA) {

        yAcceleration = yA;

    }



}
