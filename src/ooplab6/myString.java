package ooplab6;

public class myString {
    public static void main(String[] args) {

   String s;
   s = new String();
   s = "RmUTSV";
   System. out . println(s);
   s = "Welcom" + s;
   System.out.println(s);
   s = s.concat("2017");
   System.out.println(s);
   System.out.println(s.charAt(10));
   //comparaion String
           String s1 = "Hello";
   String s2 = "Hello";
   if (s1==s2)
       System.out.println("ข้อความนี้เหมือนกัน");
   else System.out.println("ข้อความนี้ไม่เหมือนกัน");
    // method
           if (s1.compareTo(s2)==0)
               System.out.println("ข้อความนี้เหมือนกัน");
   else if (s1.compareTo(s2)<0)
       System.out.println("ข้อความทางซ้ายน้อยกว่า");
   else //+
        System.out.println("ข้อความทางขวามากกว่า");
//trin method
        String s3 = "  Hello  ";
        System.out.println(s3.length());
        System.out.println("*"+s3+"*");
        System.out.println("*"+s3.trim()+"*");




    }//main

}//class
