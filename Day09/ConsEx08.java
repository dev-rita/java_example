class Data08{
	int value;
	//기본생성자를 더이상 묵시적으로 제공
}
class Data09{
	int value;
	//생성자가 오버로딩되면 자바는 기본생성자를 더이상 묵시적으로 제공하지 않는다.
	Data09(int value){
		this.value=value;
	}
}
public class ConsEx08 {

	public static void main(String[] args) {
		Data08 d01=new Data08();//기본생성자를 더이상 묵시적으로 제공
		//Data09 d02=new Data09(); 기본생성자를 더이상 제공하지 않아서 컴파일 에러 발생.
		Data09 d02=new Data09(6);
		
		System.out.println(d01.value+""+d02.value);
	}

}
