package br.com.giulianabezerra.lombokvsrecords;

import java.util.HashMap;
import java.util.Map;

public class UserService {
  Map<String, User> users = new HashMap<>();
  Map<String, UserRecord> usersRecord = new HashMap<>();

  public void create(User user) {
    users.put(user.getUsername(),
        new User(user.getUsername(), user.getPassword(), user.getEmail()));
  }

  public void create(UserRecord user) {
    usersRecord.put(user.username(),
        new UserRecord(user.username(), user.password(), user.email()));
  }

  public User getUser(String username) {
    return users.get(username);
  }

  public UserRecord getUserRecord(String username) {
    return usersRecord.get(username);
  }

}
