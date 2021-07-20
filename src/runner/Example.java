package runner;

import java.util.Calendar;

public class Example {
	public static void main(String[] args) {
		System.out.println("**********BEGIN************");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true){
					Calendar dateAct= Calendar .getInstance();
					int hour=dateAct.get(Calendar.HOUR);
					int minutes=dateAct.get(Calendar.MINUTE);
					int seconds =dateAct.get(Calendar.SECOND);
					System.out.println(hour+":"+minutes+":"+seconds);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		System.out.println("****************END************");
	}

}
