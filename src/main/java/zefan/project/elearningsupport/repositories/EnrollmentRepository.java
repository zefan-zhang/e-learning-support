package zefan.project.elearningsupport.repositories;

import org.springframework.data.repository.CrudRepository;

import zefan.project.elearningsupport.models.Enrollment;

public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {
}
