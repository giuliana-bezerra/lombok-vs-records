package br.com.giulianabezerra.lombokvsrecords;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LombokVsRecordsApplicationTests {
	private UserService userService = new UserService();

	@Test
	void testeCreateUser() {
		var user = User
				.builder()
				.username("giulianabezerra")
				.password("123456")
				.email(
						"giulianabezerra@email.com")
				.build();
		userService.create(user);

		assertEquals(user, userService.getUser(user.getUsername()));
	}

	@Test
	void testeCreateUserWithRecord() {
		var user = new UserRecord(
				"giulianabezerra", "123456", "giulianabezerra@email.com");
		userService.create(user);

		assertEquals(user, userService.getUserRecord(user.username()));
	}

	@Test
	void testeCreateInvalidUser() {
		assertThrows(IllegalArgumentException.class,
				() -> new UserRecord(null, null, null));
	}
}
