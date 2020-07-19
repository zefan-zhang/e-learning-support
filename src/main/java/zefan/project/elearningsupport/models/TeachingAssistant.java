package zefan.project.elearningsupport.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TeachingAssistant extends User {

  @OneToMany(mappedBy = "TA")
  private List<OfficeHour> blocks;


  @ManyToOne()
  @JsonIgnore
  private Section section;

  public List<OfficeHour> getBlocks() {
    return blocks;
  }

  public void setBlocks(List<OfficeHour> blocks) {
    this.blocks = blocks;
  }

  public Section getSection() {
    return section;
  }

  public void setSection(Section section) {
    this.section = section;
  }
}
