package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "officeHourBlock")
public class OfficeHour {
  @Id
  @GeneratedValue
  private int id;
  private String title;
  private Date date;
  private Time startTime;
  private int duration;
  private int timePerPerson;

  @ManyToOne()
  @JsonIgnore
  private TeachingAssistant TA;

  @OneToMany(mappedBy = "block")
  private List<Register> registers;

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

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
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

  public int getTimePerPerson() {
    return timePerPerson;
  }

  public void setTimePerPerson(int timePerPerson) {
    this.timePerPerson = timePerPerson;
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
}
