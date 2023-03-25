package LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Products{
	int id;
	String name;
	float price;

   public Products(int id,String name,	float price){
	 super();
	   this.id=id;
	   this.name=name;
	   this.price=price;
   }}
public class Ccomparator {
	public static void main(String[] args) {
		
		List<Products>Refer=new ArrayList<Products>();
		List<Products>Refer1=new ArrayList<Products>();
		//ADDING PRODUCTS
		Refer.add(new Products(1, "ABCF",2500f));
		Refer.add(new Products(2, "CDJJD",250f));
		Refer.add(new Products(3, "KL",25f));		
		Refer1.add(new Products(4,"GHF",2500f));
		Refer1.add(new Products(5,"BDDDDDDDD",250f));
		Refer1.add(new Products(6,"D",25f));
		System.out.println("sorting done on name baise");	
		
		Refer.addAll(Refer1);		
		Comparator<Products>df=new Comparator<Products>() {

			@Override
			//this below method is used to print the data in alphabetical order
			public int compare(Products p1, Products p2) {
				 
				return (p1.name.compareTo(p2.name));
			}};
			
					/*@Override //THIS BELOW METHOD IS USED TO SORT BASED ON STRING LENGTH
			public int compare(Products p1, Products p2) {
				if(p1.name.length()<p2.name.length()) {
				return 1;
			}
				else {
					return -1; 
				}}};*/
			
		
     /*   Collections.sort(Refer,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		/*Collections.sort(Refer1,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});.
		*/
			
			
			//Creating for new comparator class
				Collections.sort(Refer, df);
				
				
				
		for(Products p:Refer) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}

		/*for(Products p1:Refer1) {
			System.out.println(p1.id+" "+p1.name+" "+p1.price);
		}*/
		
	
	}
}
