package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraVersion;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventVersion extends JiraEvent{
	@JsonProperty("version")
	private JiraVersion version = null;

	@JsonProperty("mergedTo")
	private JiraVersion mergedTo = null;

	public JiraEventVersion version(JiraVersion version) {
		this.version = version;
		return this;
	}

	/**
	 * Get issueEventTypeName
	 * 
	 * @return issueEventTypeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public JiraVersion getVersion() {
		return version;
	}

	public void setVersion(JiraVersion version) {
		this.version = version;
	}
	
	public JiraEventVersion mergedTo(JiraVersion mergedTo) {
		this.mergedTo = mergedTo;
		return this;
	}

	@ApiModelProperty(value = "")
	@Valid
	public JiraVersion getMergedTo() {
		return mergedTo;
	}

	public void setMergedTo(JiraVersion mergedTo) {
		this.mergedTo = mergedTo;
	}
	
	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraEventVersion jiraEvent = (JiraEventVersion) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.version, jiraEvent.version)
				&& Objects.equals(this.mergedTo, jiraEvent.mergedTo)
				&& Objects.equals(this.userName, jiraEvent.userName)
				&& Objects.equals(this.userKey, jiraEvent.userKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, version, mergedTo, userName, userKey);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEventVersion {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    mergedTo: ").append(toIndentedString(mergedTo)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
