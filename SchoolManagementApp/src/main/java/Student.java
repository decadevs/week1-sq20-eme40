public class Student implements PersonalName{
  private int regNum;
  private int schoolFee;
  private int attendance;
  @Override
  public void getName(String name) {
    System.out.println("My name is " + name + " with Reg-no " + regNum);
  }

  public Student(int regNum, int schoolFee, int attendance) {
    this.regNum = regNum;
    this.schoolFee = schoolFee;
    this.attendance = attendance;
  }

  public int getRegNum() {
    return regNum;
  }

  public int getSchoolFee() {
    return schoolFee;
  }

  public int getAttendance() {
    return attendance;
  }

  void schoolFeePaid(){
    if (schoolFee == 0){
      System.out.println("Don't come to school on monday");
    }
    else{
      System.out.println("Your school fee  was received");
    }
  }
  public void checkAttendance() {
    System.out.println("Student's attendance is " + attendance + "%");
  }
}
