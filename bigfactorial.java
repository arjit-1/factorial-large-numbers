import java.io.*;
import java.util.Scanner;
import java.math.BigInteger;
class bigfactorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
       BigInteger fact = new BigInteger("1");
       for (int j = 1; j <= n; j++) 
       {
           fact = fact.multiply(new BigInteger(j + ""));
       }
       BigInteger num=new BigInteger("1");
       
       BigInteger k = new BigInteger("1");
       num=k;
       BigInteger z = new BigInteger("0");
       BigInteger s = new BigInteger("0");
       while(num.compareTo(fact)<=0)
       {
           if((fact.mod(num)).compareTo(z)==0)
           {
               s=s.add(num);
            }
               
           num=num.add(k);
        }
        System.out.println(s);
       
   }
}
}