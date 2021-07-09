
public class OprTest01 {

	public static void main(String[] args) {
		
		System.out.printf("10==10.0f \t %b \n",10==10.0f);//10.0f=10.0f로 자동산술 되어 비교된다. true
		System.out.printf("'0'==0 \t %b \n",'0'==0);//'0'은 십진수 정수 48로 48==0 > false
		System.out.printf("'A'==65 \t %b \n",'A'==65);//'A'은 십진수 정수 65로 65==65 > true
		System.out.printf("'A'>'B' \t %b \n",'A'>'B');//'A'은 십진수 정수 65, 'B'은 66으로 65>66 > false
		System.out.printf("'A'+1!='B' \t %b \n",'A'+1!='B');//65+1!=66 같으므로 >false
		
		//Comparing identical expressions 경고는 동일한 값이라고 알려준다.
		}

}
