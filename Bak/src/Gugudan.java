import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		int N=0;
		N=scanner.nextInt();
		if(N>=1&&N<=9)
		{
			for(int i=1;i<=9;i++)
			{
				System.out.println(N+" * "+i+" = "+N*i);
			}
		}

	}

}
