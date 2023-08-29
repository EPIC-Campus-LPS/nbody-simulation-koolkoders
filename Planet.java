import java.math.BigInteger;

public class Planet {

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

}
