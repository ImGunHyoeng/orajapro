import java.io.*;
import java.util.StringTokenizer;
public class bak10871 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");;//n��x�� ���� �ִ� ��Ʈ�� 
		int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		StringBuilder sb=new StringBuilder();//���ڿ� �ΰ��� �����ִ� ��Ȱ�� �Ѵ� ���� �� a�� b���ڰ� �ִٸ� �ΰ��� ���ؼ� ���ο� ���ڿ��� ������ �ϴµ� �̸� �����༭ �Ѱ��� ���ڿ��� ǥ���ϴ� �޼�����
		st=new StringTokenizer(br.readLine()," ");//���ڿ��� ������ ���� ���ڵ��� ����
		for(int i=0;i<n;i++)//��ū�� n�������ֱ����ؼ� n���� �ݺ��� �����
		{
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>x)
			sb.append(arr[i]).append(' ');//append �����ִ� �Լ��̴� ���ڿ��� ������ 
		}
		System.out.println(sb);
	}

}
