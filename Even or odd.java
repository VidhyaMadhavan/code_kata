import java.io.*;
class evenodd
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int n;
System.out.println("Enter a number:");
n=Integer.parseInt(in.readLine());
if(n%2==0)
System.out.println(n+" number is Even");
else
System.out.println(n+" number is odd number");
}
catch(Exception e)
{
}
}
}
