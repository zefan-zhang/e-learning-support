package zefan.project.elearningsupport.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Enumerated(EnumType.STRING)
  private RoleType role;
  private String firstName;
  private String lastName;
  private String username;
  private String password;
  private String email;
  private Date dob;
  @OneToMany(mappedBy = "user")
  private List<Admin> admins;

  @OneToMany(mappedBy = "user")
  private List<Student> students;

  @OneToMany(mappedBy = "user")
  private List<Professor> professors;

  @OneToMany(mappedBy = "user")
  private List<TeachingAssistant> teachingAssistants;

  @Enumerated(EnumType.STRING)
  private Status status;
  @OneToMany(mappedBy = "user")
  private List<Address> addresses;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Admin> getAdmins() {
    return admins;
  }

  public void setAdmins(List<Admin> admins) {
    this.admins = admins;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public List<Professor> getProfessors() {
    return professors;
  }

  public void setProfessors(List<Professor> professors) {
    this.professors = professors;
  }

  public List<TeachingAssistant> getTeachingAssistants() {
    return teachingAssistants;
  }

  public void setTeachingAssistants(List<TeachingAssistant> teachingAssistants) {
    this.teachingAssistants = teachingAssistants;
  }

  public RoleType getRole() {
    return role;
  }

  public void setRole(RoleType role) {
    this.role = role;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
