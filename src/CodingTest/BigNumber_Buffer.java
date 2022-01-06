package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigNumber_Buffer {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] array = new int[n];
			int sum = 0;
			int index = 0;
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			 
			while (str.hasMoreTokens()) {
				array[index++] = Integer.parseInt(str.nextToken());
			}
			Arrays.sort(array);
			int back1 = array[n-1];
			int back2 = array[n-2];
			
			while(true) {
				if(m == 0) break;
				for(int i = 0;i<k;i++) {
					sum += back1;
					m-=1;
					if(m==0) break;
				}
				sum+=back2;
				m-=1;
			}
			System.out.println(sum);
	}

}
