package university;

import org.joda.time.LocalTime;

public class Demo {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Student student = new Student();
    System.out.println(student.sayHello());
  }
}
