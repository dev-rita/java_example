import java.io.File;
import java.io.IOException;

public class File26 {
	public static void main(String[] args) throws IOException{
		
		String path="./src";
		File dir=new File(path);
		String[] fileNames=dir.list();//현재 폴더의 전체 파일 목록을 배열로 반환
		
		for(String s:fileNames) {
			File f=new File(path+"/"+s);
			System.out.println("======================>");
			System.out.println("이름:"+f.getName());//파일이름반환
			System.out.println("경로:"+f.getPath());//파일경로반환
			System.out.println("부모경로:"+f.getParent());
			System.out.println("절대경로:"+f.getAbsolutePath());//절대경로는 원뿌리까지 다 반환
			System.out.println("디렉토리 여부:"+f.isDirectory());
			System.out.println("파일여부:"+f.isFile());
			System.out.println("=======================>");
		}
	}

}
