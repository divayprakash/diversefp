/**
 * Created by Divay Prakash on 21-Oct-16.
 */
import ca.pfv.spmf.algorithms.frequentpatterns.fpgrowth.*;
import ca.pfv.spmf.patterns.itemset_array_integers_with_count.Itemsets;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainClass {
    public static void main(String [] args) {
        AlgoFPGrowth algo = new AlgoFPGrowth();
        try {
            Itemsets item = algo.runAlgorithm("mushroom.txt", "output_file.txt", 0.7);

            algo.printStats();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();

        }
        catch (IOException e)
        {
         e.printStackTrace();
        }
    diverseFPAlgo();
    }
    public void diverseFPAlgo()
    {
        int h=height();
        int plf[h];
        int dr=0;
        int temp=0;
        for(int l=h-1;l<=1;l--)
            plf[l]=[2*(h-l)]/(h-l)*h;
        for(int i=0;i<size(item);i++)
        {
            dr=0;
            l=h-1;
            gfp=length(item[i]);

            while (temp==0)
            {
                GFP=GFPgen(item[i],l);
                GFP1=GFPGen(item[i],l+1);
                if(size(GFP)==1)
                    break;
                mf=[size(GFP)-1]/[size(GFP1)-1];
                dr=dr+(plf[l]*mf);
                l--;
            }
            if (dr>mindiv)
                System.out.println(item[i],dr);
        }

    }
}
