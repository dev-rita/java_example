
public class RunnableExample {
	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=10;i>=1; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);//스레드가 1초간 잠시 쉰다.
				}catch(InterruptedException ie) {}
			}
		};
		Thread thread=new Thread(r);
		thread.start();//스레드 시작
	}
}
