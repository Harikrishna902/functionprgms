package javaprgms;

public class Replace 
{
 public static void main(String[]args)
 {
 String s1="hari";
 String s2="hello <<username>> how are you?";
 System.out.println(s2.replace("<<username>>",s1));
 
}
}