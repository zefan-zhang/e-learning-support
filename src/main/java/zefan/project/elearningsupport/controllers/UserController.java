package zefan.project.elearningsupport.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

import zefan.project.elearningsupport.models.User;
import zefan.project.elearningsupport.services.UserService;

@RestController
@CrossOrigin(
        origins = "http://localhost:3000",
        allowCredentials = "true")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping("/api/register")
  public User register(
          @RequestBody User user,
          HttpSession session) {
    User existingUser = userService.findUserByUsername(user.getUsername());
    if (existingUser == null) {
      User currentUser = userService.CreateUser(user);
      session.setAttribute("currentUser", currentUser);
      return currentUser;
    }
    return null;
  }

  @PostMapping("/api/profile")
  public User profile(HttpSession session) {
    return (User) session.getAttribute("currentUser");
  }

  @PostMapping("/api/logout")
  public void logout(HttpSession session) {
    session.invalidate();
  }

  @PostMapping("/api/login")
  public User login(@RequestBody User user,
                    HttpSession session) {
    User currentUser = userService.findUserByCredentials(user.getUsername(), user.getPassword());
    if (currentUser != null) {
      session.setAttribute("currentUser", currentUser);
      return currentUser;
    }
    session.setAttribute("currentUser", null);
    return null;

  }
}
