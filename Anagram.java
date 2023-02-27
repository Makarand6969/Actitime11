import java.util.Scanner;
class Anagram
{
 public static void main(String[]args)
{
 String s1="KEEP";
 String s2="PEEK";
 char []s3=s1.toCharArray();
 char []s4=s2.toCharArray();
 int count=0;
 for(int i=0;i<s3.length;i++)
{
 for(int j=0;j<s4.length;j++)
{
 if(s3[i]==s4[j])
{
 s4[j]=0;
 count++;
}
}
}
 if(count==s1.length())
{
  System.out.println("It is Anagram");
}
else
{
 System.out.println("It is not Anagram");
}
}
}
