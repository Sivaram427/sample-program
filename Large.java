import java.util.*;
public class Large {
public static void main(String [] args) {
int n,t;
System.out.println("Enter the size of array");
Scanner s=new Scanner(System.in);

n=s.nextInt();
int a[]=new int [n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<=n-1;i++) {
for(int j=i+1;j<=n-1;j++) {
if(a[i]>a[j+1])
{
t=a[i];
a[i]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println(a[n-2]);
}
}