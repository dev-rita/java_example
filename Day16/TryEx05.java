
public class TryEx05 {
	public static void main(String[] args) {
		int[] num= {10,20,30};
		
		try {
			System.out.println("Test-1");
			num[4]=50;//배열 범위를 벗어난 ArrayIndexOutOfBoundsException 예외 오류가 발생함. 
			//아래문장 실행 안하고 해당catch블록으로 이동.
			System.out.println("Test-2");
		}catch(Exception e) {
			System.out.println("예외 발생->"+e);
		}
	}

}
