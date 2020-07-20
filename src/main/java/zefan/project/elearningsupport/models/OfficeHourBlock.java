package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "officeHourBlock")
public class OfficeHourBlock {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String title;
  private Time startTime;
  private int duration;

  @ManyToOne()
  @JsonIgnore
  private TeachingAssistant TA;

  @OneToMany(mappedBy = "block")
  private List<Register> registers;

  @ManyToOne()
  @JsonIgnore
  private OfficeHour officeHour;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Time getStartTime() {
    return startTime;
  }

  public void setStartTime(Time startTime) {
    this.startTime = startTime;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }


  public TeachingAssistant getTA() {
    return TA;
  }

  public void setTA(TeachingAssistant TA) {
    this.TA = TA;
  }

  public List<Register> getRegisters() {
    return registers;
  }

  public void setRegisters(List<Register> registers) {
    this.registers = registers;
  }

  public OfficeHour getOfficeHour() {
    return officeHour;
  }

  public void setOfficeHour(OfficeHour officeHour) {
    this.officeHour = officeHour;
  }
}
