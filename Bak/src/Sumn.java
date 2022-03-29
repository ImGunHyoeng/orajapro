import java.util.Scanner;
public class Sumn {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt(),sum=0;
		if(n>=1&&n<=10000)
		{
			for(int i=0;i<n;i++)
				sum+=i+1;
				System.out.print(sum);
		}
		// TODO Auto-generated method stub

	}

}
