package com.github.instagram4j.Instagram4J.responses;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class IGChallengeStateResponse extends IGResponse {
	private String step_name;
	private IGStepData step_data;
	
	@Getter
	@Setter
	public static class IGStepData {
		private String choice;
		private String email;
	}
}