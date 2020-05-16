package spring.boot.module;

import org.springframework.stereotype.Component;

@Component
public class StarterServiceImpl implements StarterService {
	@Override
	public String starter() {
		return "stater";
	}
}
