package Stringfunctions;

public class Stringfuntions1 {

	public static void main(String[] args) {
String s="neenu";
// Length of a string

//System.out.println(s1.length());
int l=s.length();
System.out.println("lrngth"+l);

//join 2 string
String  s1="hello";
String s2="luminar";
System.out.println(s1.concat(s2));
System.out.println(s1+s2);
System.out.println(1+2+s1);
System.out.println(s1+1+2);
//upper and lower
String s3="luminar";
System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());
System.out.println(s3.endsWith("r"));
System.out.println(s3.startsWith("m"));

// compare 2 strings

String a1="abc";
String a2="Abc";
String x="welcome to luminar";
System.out.println(a1.equals(a2));
System.out.println(a1.equalsIgnoreCase(a2));
System.out.println(s3.contains("nar"));
System.out.println(x.contains("Luminar"));

//trim remove white spaces
String q="  hello  ";
System.out.println(q);
System.out.println(q.trim());

// extract portion
System.out.println("substring");
String y="welcome";
System.out.println(y.substring(3));
System.out.println(y.substring(0,6));

//replace
String z="welcome";
System.out.println(y.replace("el","xy"));

// to display particular character charAt()
System.out.println(z.charAt(4));

//Split
String w="welcome to luminar kerala";
String word[]=w.split(" ");
for(String q1:word)
{
System.out.println(q1);	
}

// tocharArray
String t="hello";
char[] abc=t.toCharArray(); 
for(char g:abc)
{
System.out.println(g);	
}





















	}
;
}
