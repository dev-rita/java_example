class Document{
	static int count=0;
	String name;
	
	Document(){
		this("제목없음"+ ++count);//같은 클래스내의 다른 생성자 호출
	}
	Document(String name){
		this.name=name;
		System.out.println("문서 "+this.name+"가 생성.");
	}//생성자 오버로딩
}
public class ConsEx14 {

	public static void main(String[] args) {
		new Document();
		new Document("자바.txt");//오버로딩 된 생성자 호출.
		new Document();
	}

}
