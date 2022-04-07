package Task_8_aqa.unit;

import Task_2.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalcTest {

    @DataProvider
    public static Object[][] addingDataProvider() {
        Object[][] res = new Object[4][3];

        res[0][0]=1.0; res[0][1]=2.0; res[0][2]=3.0;
        res[1][0]=-5.0; res[1][1]=5.0; res[1][2]=0.0;
        res[2][0]=4.0; res[2][1]=2.0; res[2][2]=6.0;
        res[3][0]=0.0; res[3][1]=2.0; res[3][2]=3.0;

        return res;
    }

    @Test
    void divideTest() {
        Assert.assertEquals(Calculator.divide(1,1),1d, "invalid dividing operation");
    }

    @Test(dataProvider = "addingDataProvider")
    void addTest(double a, double b, double expectedResult) {
        Assert.assertEquals(Calculator.add(a,b),expectedResult, "invalid adding operation");
    }



}
