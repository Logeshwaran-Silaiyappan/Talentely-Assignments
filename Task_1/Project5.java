package date25ex3;

import java.util.*;

public class Project5{

  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);

    int n=in.nextInt(),m;

    //int a[]=new int[n];

    ArrayList<Integer> a=new ArrayList<Integer>();

    for(int i=0;i<n;i++)

    {

      m=in.nextInt();

      int f=0;

      for(int j=2;j<m;j++){

        if(m%j==0)

        {

          f=1;

          break;

        }

      }

      if(f==0)

        a.add(m);

    }

    Collections.sort(a);

    int sum=0;

    for(int i=1;i<a.size();i++){

    sum+=a.get(i);

    }

    System.out.println(sum);

  }

}

