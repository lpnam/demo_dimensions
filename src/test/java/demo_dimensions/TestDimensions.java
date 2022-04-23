package demo_dimensions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDimensions {
    
    private static String[][] twoDimentionsData =       {{"2","6","8"},{"3","5","7"},{"4","1","9"}};

    private static String[]   oneDimentionsData =       {"2","6","8","3","5","7"};

    private static String[]   blankOneDimentionsData =  {};

    private static String[][] blankTwoDimentionsData =  {};

    public static void startTest(){
        System.out.println("---------------------------START TEST---------------------------");
    }

    @Test(description = "TC01: 0-Pattern One Dimension")
    public void tc01() throws Exception {
        System.out.println("-----------------------TC01: 0-Pattern One Dimension-----------------------");
        String string = "No pattern getData[]";
        String result_str = Dimensions.CheckAndReturnInputLine(oneDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("-----------------------TC01: 0-Pattern One Dimension-----------------------");
    }

    @Test(description = "TC02: 0-Pattern Two Dimension")
    public void tc02() throws Exception {
        System.out.println("-----------------------TC02: 0-Pattern Two Dimension-----------------------");
        String string = "No pattern getData[]";
        String result_str = Dimensions.CheckAndReturnInputLine(twoDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("-----------------------TC02: 0-Pattern Two Dimension-----------------------");
    }

    @Test(description = "TC03: 1-Pattern One Dimension")
    public void tc03() throws Exception {
        System.out.println("-----------------------TC03: 1-Pattern One Dimension-----------------------");
        String string = "One pattern (1): ${_getData[4]}";
        String result_str = Dimensions.CheckAndReturnInputLine(oneDimentionsData, string);
        System.out.println("String will change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(!string.equals(result_str));
        System.out.println("-----------------------TC03: 1-Pattern One Dimension-----------------------");
    }

    @Test(description = "TC04: 1-Pattern Two Dimension")
    public void tc04() throws Exception {
        System.out.println("-----------------------TC04: 1-Pattern Two Dimension-----------------------");
        String string = "One pattern (2): ${_getData[2][1]}";
        String result_str = Dimensions.CheckAndReturnInputLine(twoDimentionsData, string);
        System.out.println("String will change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(!string.equals(result_str));
        System.out.println("-----------------------TC04: 1-Pattern Two Dimension-----------------------");
    }

    @Test(description = "TC05: 2/more-Patterns One Dimension")
    public void tc05() throws Exception {
        System.out.println("----------------------TC05: 2/more-Patterns One Dimension----------------------");
        String string = "2/more-Patterns pattern (1): ${_getData[2]} and ${_getData[3]}";
        String result_str = Dimensions.CheckAndReturnInputLine(oneDimentionsData, string);
        System.out.println("String will change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(!string.equals(result_str));
        System.out.println("----------------------TC05: 2/more-Patterns One Dimension----------------------");
    }

    @Test(description = "TC06: 2/more-Patterns Two Dimension")
    public void tc06() throws Exception {
        System.out.println("----------------------TC06: 2/more-Patterns Two Dimension----------------------");
        String string = "2/more-Patterns pattern (2): ${_getData[2][0]} and ${_getData[0][1]}";
        String result_str = Dimensions.CheckAndReturnInputLine(twoDimentionsData, string);
        System.out.println("String will change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(!string.equals(result_str));
        System.out.println("----------------------TC06: 2/more-Patterns Two Dimension----------------------");
    }

    @Test(description = "TC07: Have Patterns But Blank OneDimension")
    public void tc07() throws Exception {
        System.out.println("----------------------TC07: Have Patterns But Blank OneDimension----------------------");
        String string = "Patterns But Blank (1): ${_getData[2]} and ${_getData[3]}";
        String result_str = Dimensions.CheckAndReturnInputLine(blankOneDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC07: Have Patterns But Blank OneDimension----------------------");
    }

    @Test(description = "TC08: Have Patterns But Blank TwoDimension")
    public void tc08() throws Exception {
        System.out.println("----------------------TC08: Have Patterns But Blank OneDimension----------------------");
        String string = "Patterns But Blank (2): ${_getData[2][2]} and ${_getData[3][9]}";
        String result_str = Dimensions.CheckAndReturnInputLine(blankTwoDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC08: Have Patterns But Blank OneDimension----------------------");
    }

    @Test(description = "TC09: Have Patterns But Out Of Array OneDimension")
    public void tc09() throws Exception {
        System.out.println("----------------------TC09: Have Patterns But Out Of Array OneDimension----------------------");
        String string = "Patterns But Out Of Array (1): ${_getData[9]} and ${_getData[11]}";
        String result_str = Dimensions.CheckAndReturnInputLine(oneDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC09: Have Patterns But Out Of Array OneDimension----------------------");
    }

    @Test(description = "TC10: Have Patterns But Out Of Array TwoDimension")
    public void tc10() throws Exception {
        System.out.println("----------------------TC10: Have Patterns But Out Of Array TwoDimension----------------------");
        String string = "Patterns But Out Of Array (1): ${_getData[9][9]} and ${_getData[11][2]}";
        String result_str = Dimensions.CheckAndReturnInputLine(twoDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC10: Have Patterns But Out Of Array TwoDimension----------------------");
    }

    @Test(description = "TC11: Have Pattern[][] But OneDimension")
    public void tc11() throws Exception {
        System.out.println("----------------------TC11: Have Pattern[][] But OneDimension----------------------");
        String string = "Pattern[][] But OneDimension (1): ${_getData[1][0]}";
        String result_str = Dimensions.CheckAndReturnInputLine(oneDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC11: Have Pattern[][] But OneDimension----------------------");
    }

    @Test(description = "TC12: Have Pattern[] But TwoDimension")
    public void tc12() throws Exception {
        System.out.println("----------------------TC12: Have Pattern[] But TwoDimension----------------------");
        String string = "Pattern[] But TwoDimension (1): ${_getData[1]}";
        String result_str = Dimensions.CheckAndReturnInputLine(twoDimentionsData, string);
        System.out.println("String will not change");
        System.out.println("Result: " + result_str);
        Assert.assertTrue(string.equals(result_str));
        System.out.println("----------------------TC12: Have Pattern[] But TwoDimension----------------------");
    }

}
