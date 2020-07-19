package zefan.project.elearningsupport.repositories;

import org.springframework.data.repository.CrudRepository;

import zefan.project.elearningsupport.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
