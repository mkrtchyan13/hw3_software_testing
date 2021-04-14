import org.testng.Assert;
import org.testng.annotations.Test;
import mymethods.*;

public class Testing {
//    @Test
//    public void isValid(){
//        Assert.assertEquals(MyMethods.isValid("zhenya@g.c"), true);
//        Assert.assertEquals(MyMethods.isValid("zhenya@gc"), false);
//
//    }
    @Test
    public void isValid(){
        Assert.assertEquals(MyMethods.isValidmail("zhenya@gmail.com"), true);
        Assert.assertEquals(MyMethods.isValidmail("zhenya"), false);
        Assert.assertEquals(MyMethods.isValidmail("zhenyan@ee"), false);
        Assert.assertEquals(MyMethods.isValidmail("zhenya.com"), false);
    }
    @Test
    public void isValidPassword(){
        Assert.assertEquals(MyMethods.isValidPassword("zhenya12M"), true);
        Assert.assertEquals(MyMethods.isValidPassword("zhenyM"), false);
        Assert.assertEquals(MyMethods.isValidPassword("zhenya20"), false);
        Assert.assertEquals(MyMethods.isValidPassword("z20M"), false);
    }
    @Test
    public void isValidNumber(){
        Assert.assertEquals(MyMethods.isValidArmenianNumber("37491222222"),true);
        Assert.assertEquals(MyMethods.isValidArmenianNumber("37491222"),false);
        Assert.assertEquals(MyMethods.isValidArmenianNumber("37591222222"),false);
    }
    @Test
    public void factorialTest() {
        Assert.assertEquals(MyMethods.factorial(0), 1);
        Assert.assertEquals(MyMethods.factorial(1), 1);
        Assert.assertEquals(MyMethods.factorial(3), 6);

    }
}
