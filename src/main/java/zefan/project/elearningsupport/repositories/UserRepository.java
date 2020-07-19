package zefan.project.elearningsupport.repositories;

import org.springframework.data.repository.CrudRepository;

import zefan.project.elearningsupport.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
