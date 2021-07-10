//22~76까지의 짝수의 개수와 그 합을 구해보자
public class Ex7_01 {

	public static void main(String[] args) {

		int sum=0, count=0;
		for(int i=22;i<=76;i+=2) {
			sum+=i;
			count++;
		}
		System.out.print("짝수개수="+count+", 합="+sum);
	}

}
