package pl.sages.system;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class SystemManager
{
	/**
	 * Checks input string and returns an answer
	 *
	 * @param input input string
	 * @return 'OK!' if input string starts with "a", 'FAILED!' otherwise.
	 */
	public String check(String input)
	{
		if(StringUtils.isNotBlank(input) && input.startsWith("a"))
		{
			return "OK!";
		}
		else
		{
			return "FAILED!";
		}
	}
}
