import java.io.File;
public class FileEx16 {
	public static void main(String[] args) {
		File dir=new File("./src");//웹사이트 개발에서 자료실 만들 때 많이 사용되는 파일 클래스. 
		// ./는 현재 경로.
		
		String[] dirs=dir.list();//폴더에 있는 파일 목록을 배열로 반환
	
		System.out.println("=======================");
		for(int i=0;i<dirs.length;i++) {
			System.out.print(dirs[i]+" ");
		}
		System.out.println("\n=======================");
		
		for(String fileList:dirs) {
			System.out.print(fileList+" ");
		}
		System.out.println("\n=======================");
	}
}
