package LamdaExpression;
interface  Xam{
	public  static int stt(int msg) {
		return msg;
		
	}
	public void  Send(String name);
}

public class LamdaAndAnonymous {
	public static void main(String[] args) {
		
	System.out.println("hello my int is "+	Xam.stt(120));
	
	Xam j=(name)->{
		System.out.println("hello my lambda name is "+name);
	};
	j.Send("gopi 1");
		
	Xam h=new Xam() {

		@Override
		public void Send(String name) {
			System.out.println("hello world my out put "+name);
			
		}
		
	};
		h.Send("gopi");
		
		
		
		
	}
}
/*
 * interface inter{ public void send (); public default String send1 (String
 * msg){ return msg;
 * 
 * } public static void rent(int amt) { System.out.println("my amount is"+amt);
 * 
 * } }
 * 
 * public class LamdaAndAnonymous {
 * 
 * public static void main(String[] args) { inter in=new inter () {
 * 
 * @Override public void send() { System.out.println("i ahve sended the mail");
 * }
 * 
 * }; inter.rent(200); in.send();
 * 
 * inter h=()->{ System.out.println("Hello Lambda");
 * System.out.println("Hello Lambda");
 * 
 * }; h.send();
 * 
 * }}
 */
