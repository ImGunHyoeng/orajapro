import java.io.*;
import java.util.StringTokenizer;
public class bak2439 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
			for(int j=t;i+1<j;j--)
			{
				bw.write(" ");
			}
			for(int j=-1;j<i;j++)
			{
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
