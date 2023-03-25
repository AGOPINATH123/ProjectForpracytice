package PacakageForPractice.com;

public class StaticInnerClass {

	

		private static int i; //    FOR STATIC INNER CLASSES WE HAVE TO MAKE THE VARIABLE TYPE AS STATIC;

		public void function() {
			System.out.println(i);
		}
		
		static class Inner {
			float f;
			public void function() {
			StaticInnerClass si = new StaticInnerClass();
				
				System.out.println(f+si.i);
			}}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StaticInnerClass s = new StaticInnerClass();
			s.i = 10;
			//s.setI(20);
			
			StaticInnerClass.Inner in = new StaticInnerClass.Inner();
			in.f =1.5f;
			
			s.function();
			in.function();
		
	   
	}


		public int getI() {
			return i;
		}


		public void setI(int i) {
			this.i = i;
		}

		}
