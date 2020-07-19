package zefan.project.elearningsupport.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Student extends User {

  @OneToMany(mappedBy = "student")
  private List<Register> registers;

  @OneToMany(mappedBy = "student")
  private List<Enrollment> enrollments;

  public List<Register> getRegisters() {
    return registers;
  }

  public void setRegisters(List<Register> registers) {
    this.registers = registers;
  }

  public List<Enrollment> getEnrollments() {
    return enrollments;
  }

  public void setEnrollments(List<Enrollment> enrollments) {
    this.enrollments = enrollments;
  }
}
