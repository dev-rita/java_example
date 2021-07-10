
public class Array14 {

	public static void main(String[] args) {
		int [] arr=new int[5];
		//배열 arr에 1부터 5까지 저장
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;//1~5
		}
		
		System.out.println("변경 전 arr.length :"+arr.length);
		
		//배열원소값 출력
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		//배열크기를 2배로 늘림 (잘 안쓰고 컬렉션을 씀)
		int [] tmp=new int[arr.length*2];
		
		for(int i=0;i<arr.length;i++) {
			tmp[i]=arr[i];//배열 tmp에 arr배열 원소값을 1~5까지 저장시킴.
		}
		
		arr=tmp;//tmp 배열주소가 arr에 대입되어 결국 arr배열이 tmp를 가리킴. (=같은 주소를 가짐)
		System.out.println("변경 후 arr.length"+arr.length);
		
		//확장 for문
		for(int b:arr) {
			System.out.print(+b+ " ");
		}
		System.out.println("\n=========================>");
		
		System.out.println("tmp.length"+tmp.length);
		for(int i=0; i<tmp.length;i++) {
			System.out.print(tmp[i]+" ");
		}
	}

}
