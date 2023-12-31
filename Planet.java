import java.util.Scanner;

public class Planet { //ben make a accident

    // x-coordinate of planet
    private long xCoord;
    private long yCoord;
    private long xVelocity;
    private long yVelocity;
    private long netVelocity;
    private long mass;
    private String fileName;
    private long xForce;
    private long yForce;
    private long netForce;
    private long xAccel;
    private long yAccel;

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

    public long getxForce() {

        return xForce;

    }

    public long getyForce() {

        return yForce;

    }

    public long getxAccel() {

        return xAccel;

    }

    public long getyAccel() {

        return yAccel;

    }

    public long getNetForce() {

        return netForce;

    }

    public long getNetVelocity() {

        return netVelocity;

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

    public void setNetVelocity(long nV) {

        netVelocity = nV;

    }

    public void setMass(long m) {

        mass = m;

    }

    public void setxForce(long xF) {

        xForce = xF;

    }

    public void setyForce(long yF) {

        yForce = yF;

    }

    public void setNetForce(long nF) {

        netForce = nF;

    }

    public void setxAccel(long xA) {

        xAccel = xA;

    }

    public void setyAccel(long yA) {

        yAccel = yA;

    }

    public void addToxCoord(long input) {

        xCoord += input;

    }

    public void addToyCoord(long input) {

        yCoord += input;

    }

    public void addToxVelocity(long input) {

        xVelocity += input;

    }

    public void addToyVelocity(long input) {

        yVelocity += input;

    }

    public void addToMass(long input) {

        mass += input;

    }

    public void addToxForce(long input) {

        xForce += input;

    }

    public void addToyForce(long input) {

        yForce += input;

    }

}
