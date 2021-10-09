//java assignment
import java.util.*;
import java.io.*;
class urldatabase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c,i=0,j=0,m=0;
		int l[]=new int[20];
		String a[]=new String[20];
		for(int x=0;x<a.length;x++)
			l[x]=0;
		System.out.println("******URL FUNCTIONS******");
		System.out.println("1.storeurl\t\t2.get\t\t3.count\t\t4.list\t\t5.exit");
		do
		{
			System.out.println("Enter choice:");
			c=sc.nextInt();
			switch(c)
			{
				case 1:
				       System.out.println("enter url:");
				       String s=sc.next();
				       a[i]=s;
				       i=i+1;
				       j=j+1;
				       break;
				case 2:
				       System.out.println("enter url:");
				       String q=sc.next();
				       for(int k=0;k<j;k++)
				       {
				       	if(q.equals(a[k]))
				       	{
				       		System.out.println(q+" is in the storage");
                            l[k]=l[k]+1;
				       	}
				       }
				       break;
				case 3:
				       System.out.println("Enter the url:");
				       String p=sc.next();
				       for(int y=0;y<j;y++)
				       {
				       	if((p.equals(a[y]))&&(l[y]!=0))
				       		System.out.println(l[y]);
				       }
				       break;
				case 4:
				       System.out.println("***********LIST OF URL AND USAGES********");
				       System.out.println("KEY\t\tURL\t\tUSAGE");
				       System.out.println("___________________________________");
				       int t=1;
				       for(int z=0;z<j;z++)
				       {
				       	System.out.print(t);
				       	System.out.print("\t\t"+a[z]);
				       	System.out.print("\t\t"+l[z]+"\n");
				       	t=t+1;
				       }
				       break;
				case 5:
				       System.out.println("!!!!!PROGRAM TERMINATED!!!!!!!");
				       break;
				default:
				       System.out.println("invalid choice");
			}

		}while(c!=5);
	}
}