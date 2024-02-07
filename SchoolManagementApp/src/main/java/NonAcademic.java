public class NonAcademic extends Staff implements PersonalName,personalInfo {
  public NonAcademic(int salary, int time) {
    super(salary, time);
  }
  public void yourDetail(int phoneNumber, String position){
    System.out.println("I'm the " + position + " reach me with this number " + phoneNumber);
  }
  public void getName(String name){
    System.out.println("My name is "+ name);
  }
  void receivedSalary(){
    if (getSalary() == 0){
      System.out.println( "I've not been paid");
    }
    else{
      System.out.println("I've been paid "+ getSalary());
    }
  }

}

