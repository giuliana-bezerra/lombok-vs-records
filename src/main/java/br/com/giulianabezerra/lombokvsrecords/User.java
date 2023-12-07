package br.com.giulianabezerra.lombokvsrecords;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
  private String username;
  private String password;
  private String email;
}
