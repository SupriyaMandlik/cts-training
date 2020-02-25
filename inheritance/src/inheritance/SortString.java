package inheritance;

public class SortString {
	public static void main(String[] args){
 
		String s1="helloword";
		 String s2 = "PROGRAMR";
       char[] ch=s1.toCharArray();
       char[] ch1=s2.toCharArray();
      for (int i=0;i<(ch.length-1);i++)
      {
      for (int j=i+1;j>0;j--)
      {
        if (ch[j]<ch[j-1])
          {
          char temp=ch[j-1];
          ch[j-1]=ch[j];
          ch[j]=temp;
          }
       }
   }
      for (int i=0;i<(ch1.length-1);i++)
      {
      for (int j=i+1;j>0;j--)
      {
        if (ch1[j]<ch1[j-1])
          {
          char temp=ch1[j-1];
          ch1[j-1]=ch1[j];
          ch1[j]=temp;
          }
       }
   }
  s1=String.valueOf(ch);
  System.out.println(s1);
  s2=String.valueOf(ch1);
  System.out.println(s2);
  	}
}