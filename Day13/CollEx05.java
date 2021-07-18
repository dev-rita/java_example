import java.util.Enumeration;
import java.util.Vector;

public class CollEx05 {

	public static void main(String[] args) {
		Vector vec=new Vector();//Jdk 1.0에서 추가. 컬렉션
		double[] arr= {38.6,9.2,45.3,6.1,4.7,1.6};
		for(int i=0;i<arr.length;i++) {
			vec.add(arr[i]);//오토박싱+업캐스팅 기본형이 참조형(클래스)으로 오토박싱+Object 타입으로 업캐스팅 됨
		}//배열원소값을 컬렉션에 추가. Object obj=new Double();
		/*Type safety: The method add(Object) belongs to the raw type Vector. 
		 * References to generic type Vector<E> should be parameterized
		 */
		System.out.println("\n>>배열원소값 출력<<");
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i)+"");//get()메소드로 원소값을 가져옴.
		}
		System.out.println();
		
		double findData=6.1;
		int index=vec.indexOf(findData);
		//오토박싱+업캐스팅. 백터에서 주어진 값을 찾아서 값의 주소번호를 변환. 0부터 시작, 못찾으면 -1.
		//findData 가 6.1인 double이므로 Double로 오토박싱해서 클래스화 후, Object 클래스로 업캐스팅 한다.
		//Object o2 = 30; // int -> Integer 로 오토박싱된 후, Integer -> Object 로 업캐스팅 됨
		
		if(index != -1) {
			System.out.println("\n검색 성공 :"+index);//0부터 시작됨.
		}else {
			System.out.println("\n검색 실패 :"+index);
		}
		
		double delData=45.3;
		if(vec.contains(delData)) {//벡터에 포함되어 있다면 참.
			vec.remove(delData);//벡터에서 삭제
			System.out.println("\n삭제 성공!");
		}
		
		//Enumeration과 for반복문으로 출력해보기.
		Enumeration enu=vec.elements();
		while(enu.hasMoreElements()) {//원소값이 있다면 참.
			System.out.println(enu.nextElement());//원소값을 얻어온다.
		}
		
		System.out.println("\n");
		
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i));
		}//for반복문이 잘 쓰인다.
	}

}
