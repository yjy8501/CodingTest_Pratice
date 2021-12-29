//내가 푼 답안(틀림 이유 모름)
package algorigsm;

import java.util.HashMap;
import java.util.Scanner;

class color{
	long value1, value2;
	public color(long value1, long value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
}
public class BOJ_1076 {
	public static void main(String[] args) {
		HashMap<String, color> colorName = new HashMap<String, color>();
		colorName.put("black",new color(0,1));
		colorName.put("brown",new color(1,10));
		colorName.put("red",new color(2,100));
		colorName.put("orange",new color(3,1000));
		colorName.put("yellow",new color(4,10000));
		colorName.put("green",new color(5,100000));
		colorName.put("blue",new color(6,1000000));
		colorName.put("violet",new color(7,10000000));
		colorName.put("grey",new color(8,100000000));
		colorName.put("white",new color(9,1000000000));
		
		Scanner sc = new Scanner(System.in);
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			color one = colorName.get(a);
			color two = colorName.get(b);
			color three = colorName.get(c);
			System.out.println(one.value1+""+(two.value1*three.value2));
		}
}
