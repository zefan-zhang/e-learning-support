package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teachingAssistants")
public class TeachingAssistant {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne()
  @JsonIgnore
  private User user;

  @OneToMany(mappedBy = "TA")
  private List<OfficeHourBlock> blocks;

  @OneToMany(mappedBy = "TA")
  private List<OfficeHour> officeHours;


  @ManyToOne()
  @JsonIgnore
  private Section section;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<OfficeHourBlock> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<OfficeHourBlock> blocks) {
    this.blocks = blocks;
  }

  public Section getSection() {
    return section;
  }

  public void setSection(Section section) {
    this.section = section;
  }

  public List<OfficeHour> getOfficeHours() {
    return officeHours;
  }

  public void setOfficeHours(List<OfficeHour> officeHours) {
    this.officeHours = officeHours;
  }
}
