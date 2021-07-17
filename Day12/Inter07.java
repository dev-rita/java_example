interface Parseable{
	public abstract void parse(String fileName);//public abstrac 생략 가능.
}
//첫 번째 자손클래스
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName+"-XML 파싱 완성.");
	}
}
//두 번째 자손클래스
class HtmlParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName+"-HTML 코드 완성.");
	}
}
class ParserManager{
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
		//String 문자열 참조타입을 ==로 비교하면 주소값을 비교하므로 주의. 내용물 문자만 비교하기 위해서 equals()를 사용.
			return new XMLParser();//업캐스팅
		}else {
			//Parseable p=new HtmlParser();//업캐스팅
			//return p;
			return new HtmlParser();//업캐스팅
		}
	}
}

public class Inter07 {

	public static void main(String[] args) {
		Parseable parser=ParserManager.getParser("XML");
		//parser=new XMLParser();>>업캐스팅
		parser.parse("abc.xml");
		parser=ParserManager.getParser("HTML");
		//parser=new HtmlParser();>>업캐스팅
		parser.parse("cde.html");
	}
}
