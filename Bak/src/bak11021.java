import java.io.*;
import java.util.StringTokenizer;
public class bak11021 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<t;i++)
		{
			st=new StringTokenizer(br.readLine()," ");
			//int a=Integer.parseInt(br.readLine()),b=Integer.parseInt(br.readLine());
			bw.write("Case #"+(i+1)+": ");
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		bw.flush();
		//bw.close();
	}

}
