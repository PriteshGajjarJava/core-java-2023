class StringFunctionsPuzzle {
 public static void main(String[] args) {
 	String s = "String functions are helpful.";

 	System.out.println(s.substring(7,10)); //3 chars starting from 7th index - fun
 	System.out.println(s.indexOf("help"));//21
 	System.out.println(s.contains("ring"));//true
 	System.out.println(s.charAt(10));//c

 	String s1 = s.substring(7);//functions are helpful
 	s1 = "Java " + s;
 	System.out.println(s1);//Java String functions are helpful
 	String s3 = s1.substring(0, 4);//Java
 	s3 = s3.toUpperCase(); // JAVA
 	System.out.println(s3);// JAVA
 	s1 = s1.replace("i", "!");//Java Str!ng funct!ons are helpful
 	System.out.println(s1);
 }
}