import java.io.*;
import java.util.StringTokenizer;
public class bak1110 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n=Integer.parseInt(br.readLine());
		int b=0,count=0;
		int ten=n/10,one=n%10;
		if(n>=0&&n<=9)
		{
			ten=0;
		}
		for(;;)
		{	
			
			
			
			b=(one*10)+(ten+one)%10;
			 int a=b;
			 count++;
			 if(a==n)
			break;
			;
			 ten=b/10;
			 one=b%10;
		}
		System.out.print(count);
		

	}

}
