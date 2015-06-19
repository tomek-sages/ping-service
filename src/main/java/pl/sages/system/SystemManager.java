package pl.sages.system;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class SystemManager
{
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
