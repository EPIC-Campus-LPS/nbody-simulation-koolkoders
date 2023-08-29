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

        File file = new File("planets.txt");

        Scanner input = new Scanner(file);

        int bodies = 0;

        Planet[] game = new Planet[bodies];

    }

}
