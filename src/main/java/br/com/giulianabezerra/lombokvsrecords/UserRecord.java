package br.com.giulianabezerra.lombokvsrecords;

public record UserRecord(
    String username,
    String password,
    String email) {

  public UserRecord {
    if (username == null || username.isBlank()) {
      throw new IllegalArgumentException("Username cannot be null or blank");
    }

    if (password == null || password.isBlank()) {
      throw new IllegalArgumentException("Password cannot be null or blank");
    }

    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("Email cannot be null or blank");
    }
  }
}
