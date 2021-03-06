package us.pasv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GroupOfAssertions
{
	@Test
	void groupFromJUnit5()
	{
		int value = 4;
		assertAll(
				"example of assert all",
				() -> assertEquals(value, 2 * 3, "4 is 2 times 2"),
				() -> assertEquals("java", "JAVA".toLowerCase()),
				() -> assertNotEquals(0, value, "value cannot be 0"),
				() -> assertTrue(value != 4, "value is 4")
				);
	}
}
