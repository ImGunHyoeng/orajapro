import java.io.*;
import java.util.StringTokenizer;
public class bak2438 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int tree=Integer.parseInt(br.readLine());
		for(int i=0;i<tree;i++)
		{
			for(int j=0;j<=i;j++)
			bw.write("*");
			bw.write("\n");
		}
		bw.flush();
	}

}
