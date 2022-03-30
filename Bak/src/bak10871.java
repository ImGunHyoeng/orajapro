import java.io.*;
import java.util.StringTokenizer;
public class bak10871 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");;//n과x의 값을 넣는 스트링 
		int n=Integer.parseInt(st.nextToken()),x=Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		StringBuilder sb=new StringBuilder();//문자열 두개를 더해주는 역활을 한다 예를 들어서 a와 b문자가 있다면 두개를 더해서 새로운 문자열을 만들어야 하는데 이를 더해줘서 한개의 문자열로 표현하는 메서드임
		st=new StringTokenizer(br.readLine()," ");//문자열의 개수에 들어가는 숫자들의 모임
		for(int i=0;i<n;i++)//토큰을 n개까지넣기위해서 n까지 반복문 사용함
		{
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]>x)
			sb.append(arr[i]).append(' ');//append 더해주는 함수이다 문자열의 성분을 
		}
		System.out.println(sb);
	}

}
