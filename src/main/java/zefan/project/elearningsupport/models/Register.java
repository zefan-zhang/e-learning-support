package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registers")
public class Register {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String feedBack;

  @ManyToOne()
  @JsonIgnore
  private OfficeHourBlock block;

  @ManyToOne()
  @JsonIgnore
  private Student student;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFeedBack() {
    return feedBack;
  }

  public void setFeedBack(String feedBack) {
    this.feedBack = feedBack;
  }

  public OfficeHourBlock getBlock() {
    return block;
  }

  public void setBlock(OfficeHourBlock block) {
    this.block = block;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }


}
