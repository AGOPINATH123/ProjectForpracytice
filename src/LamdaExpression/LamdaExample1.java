package LamdaExpression;

interface Drawable{
	public void Draw();
	
}
interface Saying{

public String Say();

}
public class LamdaExample1 {

	public static void main(String[] args) {
		int width=12;
		Drawable d1=()->{
			System.out.println("Dwaing width "+width);
		};
        d1.Draw();
        
        
        Saying d2=()->{
        	return "nothing to say";
        };
        System.out.println(d2.Say());
        
}

}
