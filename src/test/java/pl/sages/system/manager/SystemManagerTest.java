package pl.sages.system.manager;

import org.junit.Test;
import pl.sages.system.SystemManager;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SystemManagerTest
{
	private SystemManager systemManager = new SystemManager();

	@Test
	public void testPositive()
	{
		String result = systemManager.check("abc");
		assertThat(result, is("OK!"));
	}

	@Test
	public void testNegative()
	{
		String result = systemManager.check("cba");
		assertThat(result, is("FAILED!"));
	}
}
