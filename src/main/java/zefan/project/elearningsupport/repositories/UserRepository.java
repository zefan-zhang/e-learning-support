package zefan.project.elearningsupport.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import zefan.project.elearningsupport.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

  @Query("select user from User user where user.username=:username and user.password=:password")
  User findUserByCredentials(@Param("username") String username,
                             @Param("password") String password);

  @Query("select user from User user where user.username=:username")
  User findUserByUsername(@Param("username") String username);
}
