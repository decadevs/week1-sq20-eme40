
public class Applicant implements PersonalName{
  private int age;
  private int score;


  public Applicant(int age, int score) {
    this.age = age;
    this.score = score;
  }

  public int getAge() {
    return age;
  }

  public int getScore() {
    return score;
  }

  @Override
  public void getName(String name) {
    System.out.println("My name is " + name + " I'm " + age + " years ago");
  }

  void getAdmitted(){
    if (score < 50 && age < 18){
      System.out.println("Sorry,you are not  admitted");
    }
    else {
      System.out.println("You have been admitted");
    }
  }
}
