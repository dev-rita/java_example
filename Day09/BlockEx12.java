
public class BlockEx12 {
	static int[] arr=new int[10];//정적 배열
	
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;//random()은 0.0이상 1.0미만 사이 실수 숫자 난수 발생.
		}
	}
	public static void main(String[] args) {
		for(int k:arr) {
			System.out.print(k+" ");
		}
	}

}
