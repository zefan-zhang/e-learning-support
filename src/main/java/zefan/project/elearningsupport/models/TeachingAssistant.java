package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TeachingAssistant extends User {

  @OneToMany(mappedBy = "TA")
  private List<OfficeHourBlock> blocks;

  @OneToMany(mappedBy = "TA")
  private List<OfficeHour> officeHours;


  @ManyToOne()
  @JsonIgnore
  private Section section;

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
