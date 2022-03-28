import java.util.Scanner;
public class Num_box {
	public static void main(String[] args) {
		
	
	Scanner scanner=new Scanner(System.in);
	int a=0,b=0,c=0;
	a=scanner.nextInt();
	b=scanner.nextInt();
	c=scanner.nextInt();
	int count=0;
	int same=0;
	if(a>=1&&a<=6&&b>=1&&b<=6&&c>=1&&c<=6)
	{
		if(a==b)
		{
			if(b==c)
				{
				count+=2;
				same=b;
				}
			else {
				count++;
				same=a;
				 }
		}
		if(b==c&&count==0)
		{
			if(c==a) {
				count+=2;
				same=b;
			}
			else 
				{
				same=c;
				count++;
				}
		}
		if(c==a&&count==0)
		{
			if(c==b) {
				count+=2;
				same=c;
			}
			else {
				count++;
			same=c;
			}
		}
		if(count==0)
		{
			if(a>b&&a>c)
			{
					same=a;	
			}
			if(b>c&&b>a)
				same=b;
			if(c>a&&c>b)
				same=c;
			
		}
		if(count==2)
			System.out.print(10000+same*1000);
		else if(count==1)
			System.out.print(1000+100*same);
		else 
			System.out.print(100*same);
	}
	}

}
