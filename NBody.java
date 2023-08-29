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

        File file = new File("C:\\Users\\nathanh236_lpsk12\\Documents\\nbody-simulation\\nbody-simulation-koolkoders\\planets.txt");

        Scanner input = new Scanner(file);
        StringBuffer sb = new StringBuffer();
        while (input.hasNext()) {

            sb.append(" " + input.nextLine());

        }

        int bodies = 0;

        Planet[] game = new Planet[bodies];

    }

}
