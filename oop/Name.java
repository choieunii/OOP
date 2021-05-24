package oop;

//Basics 3
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
}

  public String getFirstName() {return firstName; }
  public String getMiddleName() { return middleName; }
  public String getLastName() {return lastName; }

  public void setFirstName(String fn) {
	  firstName = fn;
  }
  public void setMiddleName(String mn) {
	   middleName = mn;
  }
  public void setLastName(String ln) {
	  lastName = ln;
  }

  public String getInits(){ return firstName.split("")[0] + middleName.split("")[0] + lastName.split("")[0] ;}
  public String getFirstAndLastName() {
		return firstName + " " + lastName;
  }

  public String getLastCommaFirst() {
		return lastName + ", "+ firstName;
  }


}

