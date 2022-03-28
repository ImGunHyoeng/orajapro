import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int c=scanner.nextInt();
		int []arr=new int[c];
		int a=0,b=0;
		for(int i=0;i<c;i++)
		{
		a=scanner.nextInt();
		b=scanner.nextInt();
			arr[i]=a+b;
		}
		for(int i=0;i<c;i++)
			System.out.println(arr[i]);
			
	}

}
