package zefan.project.elearningsupport.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zefan.project.elearningsupport.models.User;
import zefan.project.elearningsupport.repositories.UserRepository;

@Service
public class UserService {
  @Autowired
  UserRepository repository;

  public User CreateUser(User user) {
    return repository.save(user);
  }

  public User findUserByUsername(String username) {
    return repository.findUserByUsername(username);
  }

  public User findUserByCredentials(String username, String password) {
    return repository.findUserByCredentials(username, password);
  }

}
