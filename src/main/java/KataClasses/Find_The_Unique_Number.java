package KataClasses;

/**
 * Created by Igor on 24.06.2017.
 */
public class Find_The_Unique_Number {

    private static boolean checkCandidate(double[] doubles,double candidate){
        int numberOfAccures = 0;

        boolean status = true;

        for (int i=0;i<doubles.length;i++){
            if(candidate==doubles[i]){
                numberOfAccures++;
            }
            if(numberOfAccures>1){
                status = false;
                break;
            }
        }
        return status;
    }

    public static double findUniq(double[] doubles) {

        int index=0;
        for (int i =0;i<doubles.length;i++){
            if(doubles[i]!=doubles[i+1]){
                index = i;
                break;
            }
        }

        if(!checkCandidate(doubles,doubles[index])){
            index++;
        }

        return doubles[index];
    }

}
