package thread_work;
/**
 * Callable�ӿڵķ�ʽ�������߳�
 * �ֳ�10�ݽ��м���
 */
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();//�õ��û�����
		double time1=System.currentTimeMillis();
//		����Callable�ӿ�ʵ����Ķ���
		MyThread numThread1=new MyThread(x,1,100000000);
		MyThread numThread2=new MyThread(x,100000000,200000000);
		MyThread numThread3=new MyThread(x,200000000,300000000);
		MyThread numThread4=new MyThread(x,300000000,400000000);
		MyThread numThread5=new MyThread(x,400000000,500000000);
		MyThread numThread6=new MyThread(x,500000000,600000000);
		MyThread numThread7=new MyThread(x,600000000,700000000);
		MyThread numThread8=new MyThread(x,700000000,800000000);
		MyThread numThread9=new MyThread(x,800000000,900000000);
		MyThread numThread10=new MyThread(x,900000000,1000000000);
//		����Callable�ӿ�ʵ����Ķ�����Ϊ���ݵ�FutureTask�������У�����FutureTask�Ķ���
		FutureTask futureTask1=new FutureTask (numThread1);	
		FutureTask futureTask2=new FutureTask (numThread2);
		FutureTask futureTask3=new FutureTask (numThread3);
		FutureTask futureTask4=new FutureTask (numThread4);
		FutureTask futureTask5=new FutureTask (numThread5);
		FutureTask futureTask6=new FutureTask (numThread6);
		FutureTask futureTask7=new FutureTask (numThread7);
		FutureTask futureTask8=new FutureTask (numThread8);
		FutureTask futureTask9=new FutureTask (numThread9);
		FutureTask futureTask10=new FutureTask (numThread10);
//		  ��FutureTask�Ķ�����Ϊ�������ݵ�Thread��Ĺ������У�����Thread���󣬲�����start()
		new Thread(futureTask1).start();
		new Thread(futureTask2).start();
		new Thread(futureTask3).start();
		new Thread(futureTask4).start();
		new Thread(futureTask5).start();
		new Thread(futureTask6).start();
		new Thread(futureTask7).start();
		new Thread(futureTask8).start();
		new Thread(futureTask9).start();
		new Thread(futureTask10).start();
		
		try {
//			��ȡCallable��call�����ķ���ֵ
			Long sum1=(Long) futureTask1.get();
			Long sum2=(Long) futureTask2.get();
			Long sum3=(Long) futureTask3.get();
			Long sum4=(Long) futureTask4.get();
			Long sum5=(Long) futureTask5.get();
			Long sum6=(Long) futureTask6.get();
			Long sum7=(Long) futureTask7.get();
			Long sum8=(Long) futureTask8.get();
			Long sum9=(Long) futureTask9.get();
			Long sum10=(Long) futureTask10.get();
			long sum=sum1+sum2+sum3+sum4+sum5+sum6+sum7+sum8+sum9+sum10;
			System.out.println("�ܺ�"+sum);
		}catch (Exception e) {
			System.out.println("����ԭ��"+e.getMessage());
		}
		double time2=System.currentTimeMillis();
		System.out.println("����ʱ�䣺"+(time2-time1)+"ms");
	}
}
//����һ��ʵ��Callable��ʵ����
class MyThread implements Callable<Long> {
	public long sum=0;//��¼�ܺ�
	private int x;//Ҫ��ѯ��ֵ
	private int start;//�����￪ʼ��ѯ
	private int end;//�����������ѯ
	//����(Ҫ��ѯ��ֵ����ѯ��㣬��ѯ������)
	public MyThread (int x,int start,int end) {
		this.x=x;
		this.start=start;
		this.end=end;
	}

//  ʵ��call������Ҫ�߳�Ҫִ�е�������call��
	@Override
	public Long call() throws Exception {
		
		for (long i = start; i < end; i++) {
			if (contain(i, x)) {
				sum += i;//����ҵ�������sum
			}
		}
		return sum;
	}
	private static boolean contain(long num, int x) {
		return String.valueOf(num).contains(String.valueOf(x));
	}
}
