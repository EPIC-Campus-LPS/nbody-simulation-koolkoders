import java.math.BigInteger;

public class Planet {

    // x-coordinate of planet
    private BigInteger xCoord;

    // y-coordinate of planet
    private BigInteger yCoord;

    // x-component of initial velocity
    private BigInteger xVelocity;

    // y-component of initial velocity
    private BigInteger yVelocity;

    // mass of planet
    private BigInteger mass;

    // filename of planet image
    private String image;

    public Planet (BigInteger xC, BigInteger yC, BigInteger xV, BigInteger yV, BigInteger m, String i) {

        xCoord = xC;
        yCoord = yC;
        xVelocity = xV;
        yVelocity = yV;
        mass = m;
        image = i;

    }

}
