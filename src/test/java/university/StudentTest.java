package university;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

  private Student student = new Student();

  @Test
  public void studentSaysHello() {
    assertThat(student.sayHello(), containsString("Hello"));
  }
}
