package ooplab6;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class myStringToken {
    public static void main(String[] args) {
       String s = "welcome to RMUTSV";
        StringTokenizer tokenizer = new StringTokenizer(s);
        System.out.println(tokenizer.countTokens());
        //count word in String
        System.out.println(tokenizer.countTokens());
        //cut word in String
        //reverse word in String
        while (tokenizer.hasMoreElements()){
            StringBuffer buffer = new StringBuffer(tokenizer.nextToken());
            System.out.println(buffer.reverse());
        }







    }//main


}//class
