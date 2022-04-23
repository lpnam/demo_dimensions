package demo_dimensions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dimensions {

    public static String string1 = "(\\$\\{_getData\\[)(\\d+)(\\]\\[)(\\d+)(\\]\\})";
    public static String string2 = "(\\$\\{_getData\\[)(\\d+)(\\]\\})";

    public Dimensions() {
        super();
    }

    public static String CheckAndReturnInputLine(String[][] arr, String inputLine){
        
        if (arr.length == 0) {
            System.out.println("Blank array\n");
            return inputLine;
        }

        if (inputLine.length() < 17) {
            System.out.println("This input line not enough length\n");
            return inputLine;
        } else {
            int count =0;
            StringBuffer sb = new StringBuffer();  
            Pattern p = Pattern.compile(string1);
            Matcher m = p.matcher(inputLine);
            while(m.find()) {
                count++;
                int y = Integer.parseInt(m.group(2));
                int z = Integer.parseInt(m.group(4));
                if ((y < arr.length) && (z < arr[y].length)){  
                    String newInputLine =  arr[y][z];
                    // Replace to Line
                    m.appendReplacement(sb, newInputLine);
                }
                else {
                    System.out.print("Out of Array -- Matches:" + count +"\n");
                }
            }

            // Replace to Line
            m.appendTail(sb);
            inputLine = sb.toString();

            if (count == 0) {
                System.out.print("Not found special char\n");
            }    
        }

        return inputLine;
    }

    public static String CheckAndReturnInputLine(String[] arr, String inputLine){

        if (arr.length == 0) {
            System.out.println("Blank array\n");
            return inputLine;
        }

        if (inputLine.length() < 14) {
            System.out.println("This input line not enough length\n");
            return inputLine;
        } else {
            int count =0;
            Pattern p = Pattern.compile(string2);
            Matcher m = p.matcher(inputLine);
            StringBuffer sb = new StringBuffer();
            while(m.find()) {
                count++;
                int y = Integer.parseInt(m.group(2));

                if (y < arr.length){ 
                    String newInputLine =  arr[y];
                    // Replace to Line
                    m.appendReplacement(sb, newInputLine);
                }
                else {
                    System.out.print("Out of Array -- Matches:" + count +"\n");
                }
            }

            // Replace to Line
            m.appendTail(sb);
            inputLine = sb.toString();

            if (count == 0) {
                System.out.print("Not found special char\n");
            }    
        }

        return inputLine;
    }
    
}
