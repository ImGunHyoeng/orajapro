import java.io.*;
public class bak2742 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=n;i>=1;i--)
		{
			bw.write(i+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
