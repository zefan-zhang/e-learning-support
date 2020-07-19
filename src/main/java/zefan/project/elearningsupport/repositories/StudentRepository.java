package zefan.project.elearningsupport.repositories;

import org.springframework.data.repository.CrudRepository;

import zefan.project.elearningsupport.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
