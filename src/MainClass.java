/**
 * Created by Divay Prakash on 21-Oct-16.
 */
import ca.pfv.spmf.algorithms.frequentpatterns.fpgrowth.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String [] args) {
        AlgoFPGrowth algo = new AlgoFPGrowth();
        try {
            algo.runAlgorithm("mushroom.txt", "output_file.txt", 40.00);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        catch (IOException e)
        {
         e.printStackTrace();
        }

    }
}
