
public class Ex6_17 {
	static int[] shuffle(int[] arr){
		if(arr==null||arr.length==0) return arr;
		for(int i=0;i<arr.length;i++) {
			int random=(int)(Math.random()*arr.length);
			int tmp=arr[i];
			arr[i]=arr[random];//arr[i]에 arr[random]값 대입
			arr[random]=tmp;//arr[random]에 arr[i]값 대입
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};//int [10]
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result=shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
