public class Principal implements PersonalName,personalInfo {
  public void getName(String name){
    System.out.println("Principal's name is " + name);
  }
  public void yourDetail(int phoneNumber, String position){
    System.out.println("I'm the " +  position + " reach me with this number " + phoneNumber);
  }
  public void admitApplicant(Applicant applicant){
    if (applicant.getAge() < 18){
      System.out.println("Applicant admitted by the principal");
    }
    else
      System.out.println("Applicant rejected by the principal");
  }
  public void expel(Student student){
    if (student.getAttendance() < 5){
      System.out.println("You have been expel by the principal");
    }
    else{
      System.out.println("congratulations");
    }
  }
  public void getPunish(Teacher teacher){
    if (teacher.getTime() < 7){
      System.out.println("200 has been deducted from your salary");
    }
  }
}
