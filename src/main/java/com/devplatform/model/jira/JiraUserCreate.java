package com.devplatform.model.jira;

import com.devplatform.model.jira.event.JiraEvent;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JiraUserCreate extends JiraEvent {

	@JsonProperty("user")
	protected JiraUser user;

	public JiraUser getUser() {
		return user;
	}

	public void setUser(JiraUser user) {
		this.user = user;
	}

}
