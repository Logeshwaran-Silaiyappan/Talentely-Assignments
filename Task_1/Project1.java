package project1;

import java.util.*;

public class Project1 {

  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter expression: ");

    String s=sc.nextLine();

    int n=s.length();

    StringBuilder a= new StringBuilder();

    char []b=new char[n];

    char []c=new char[n];

    s=s.replaceAll("\\s", "");

    int j=0,k=0;

    for(int i=0;i<n;i++)

    {

      if(s.charAt(i)>='0' && s.charAt(i)<='9')

      {

        b[j]=s.charAt(i);

        j++;

      }

      else if(s.charAt(i)=='+' || s.charAt(i)=='/' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='%')

      {

        c[k]=s.charAt(i);

        k++;

      }

      else

      {

      }

    }

    for(int i=0;i<n;i++)

    {

      a=a.append(b[i]);

      a=a.append(c[i]);

    }

    System.out.println(a);

    int sum;

    sum=(char) a.charAt(0)-'0';

    for(int i=1;i<n;i++)

    {

      switch (a.charAt(i)) {

        case '+':

          sum+=(char) a.charAt(++i)-'0';

          break;

        case '-':

          sum-=(char) a.charAt(++i)-'0';

          break;

        case '*':

          sum*=(char) a.charAt(++i)-'0';

          break;

        case '/':

          sum/=(char) a.charAt(++i)-'0';

          break;

        case '%':

          sum%=(char) a.charAt(++i)-'0';

          break;

        default:

          break;

      }

    }

    System.out.println(sum);

  }

}