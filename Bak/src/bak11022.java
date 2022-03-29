import java.io.*;
import java.util.StringTokenizer;
public class bak11022 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		// TODO Auto-generated method stub
		for(int i=0;i<t;i++)
		{
			st=new StringTokenizer(br.readLine());
			bw.write("Case #"+(i+1)+":"+" ");
			int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
			bw.write(a+" + "+b+" = "+(a+b)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
