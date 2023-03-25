package CollectionsPractice;

public class PassengerList {
	String Name;
	String Gender;
	int Age;
	String TravellingFrom;
	String Destination;
	long AadharNo;
	long PH;
	String BirthPreference;
	public PassengerList(String name, String gender, int age, String travellingFrom, String destination, long aadharNo,
			long pH, String birthPreference) {
		super();
		this.Name = name;
		this.Gender = gender;
		this.Age = age;
		this.TravellingFrom = travellingFrom;
		this.Destination = destination;
		this.AadharNo = aadharNo;
		this.PH = pH;
		this.BirthPreference = birthPreference;
		
		
		
	}
	@Override
	public String toString() {
		return "PassengerList [Name=" + Name + ", Gender=" + Gender + ", Age=" + Age + ", TravellingFrom="
				+ TravellingFrom + ", Destination=" + Destination + ", AadharNo=" + AadharNo + ", PH=" + PH
				+ ", BirthPreference=" + BirthPreference + "]";
	}
	
	
	
	
	
	
	}

	


