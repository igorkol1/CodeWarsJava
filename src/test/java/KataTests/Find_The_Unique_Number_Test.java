package KataTests;

import KataClasses.Find_The_Unique_Number;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


/**
 * Created by Igor on 24.06.2017.
 */
public class Find_The_Unique_Number_Test {

        private double precision = 0.0000000000001;



        @Test
        public void sampleTestCases() {
            assertEquals(1.0, Find_The_Unique_Number.findUniq(new double[]{0, 1, 0}), precision);
            assertEquals(0.0, Find_The_Unique_Number.findUniq(new double[]{1, 0, 1}), precision);
            assertEquals(2.0, Find_The_Unique_Number.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
            assertEquals(0.0,Find_The_Unique_Number.findUniq(new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0 }),precision);
        }
    }


