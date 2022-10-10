package com.devplatform.model.jira.event;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.jira.JiraEventChangelog;
import com.devplatform.model.jira.JiraIssue;
import com.devplatform.model.jira.JiraIssueComment;
import com.devplatform.model.jira.JiraUser;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * JiraEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class JiraEventIssue extends JiraEvent{
	/**
	 * Gets or Sets issueEventTypeName
	 */
	public enum IssueEventTypeNameEnum {
		ISSUE_CREATED("issue_created"),
		ISSUE_UPDATED("issue_updated"),
		ISSUE_ASSIGNED("issue_assigned"),
		ISSUE_WORK_STARTED("issue_work_started"),
		ISSUE_RESOLVED("issue_resolved"),
		ISSUE_CLOSED("issue_closed"),
		ISSUE_GENERIC("issue_generic"),
		ISSUE_COMMENTED("issue_commented"),
		ISSUE_MOVED("issue_moved"),
		ISSUE_COMMENT_EDITED("issue_comment_edited"),
		ISSUE_COMMENT_DELETED("issue_comment_deleted");

		private String value;

		IssueEventTypeNameEnum(String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static IssueEventTypeNameEnum fromValue(String text) {
			for (IssueEventTypeNameEnum b : IssueEventTypeNameEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("issue_event_type_name")
	private IssueEventTypeNameEnum issueEventTypeName = null;

	@JsonProperty("user")
	private JiraUser user = null;

	@JsonProperty("issue")
	private JiraIssue issue = null;

	@JsonProperty("changelog")
	private JiraEventChangelog changelog = null;

	@JsonProperty("comment")
	private JiraIssueComment comment = null;

	public JiraEventIssue issueEventTypeName(IssueEventTypeNameEnum issueEventTypeName) {
		this.issueEventTypeName = issueEventTypeName;
		return this;
	}

	/**
	 * Get issueEventTypeName
	 * 
	 * @return issueEventTypeName
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	public IssueEventTypeNameEnum getIssueEventTypeName() {
		return issueEventTypeName;
	}

	public void setIssueEventTypeName(IssueEventTypeNameEnum issueEventTypeName) {
		this.issueEventTypeName = issueEventTypeName;
	}

	public JiraEventIssue user(JiraUser user) {
		this.user = user;
		return this;
	}

	/**
	 * Get user
	 * 
	 * @return user
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public JiraUser getUser() {
		return user;
	}

	public void setUser(JiraUser user) {
		this.user = user;
	}

	public JiraEventIssue issue(JiraIssue issue) {
		this.issue = issue;
		return this;
	}

	/**
	 * Get issue
	 * 
	 * @return issue
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull

	@Valid
	public JiraIssue getIssue() {
		return issue;
	}

	public void setIssue(JiraIssue issue) {
		this.issue = issue;
	}

	public JiraEventIssue changelog(JiraEventChangelog changelog) {
		this.changelog = changelog;
		return this;
	}

	/**
	 * Get changelog
	 * 
	 * @return changelog
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public JiraEventChangelog getChangelog() {
		return changelog;
	}

	public void setChangelog(JiraEventChangelog changelog) {
		this.changelog = changelog;
	}
	
	public JiraEventIssue comment(JiraIssueComment comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Get changelog
	 * 
	 * @return changelog
	 **/
	@ApiModelProperty(value = "")
	@Valid
	public JiraIssueComment getComment() {
		return comment;
	}
	
	public void setComment(JiraIssueComment comment) {
		this.comment = comment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		JiraEventIssue jiraEvent = (JiraEventIssue) o;
		return Objects.equals(this.timestamp, jiraEvent.timestamp)
				&& Objects.equals(this.webhookEvent, jiraEvent.webhookEvent)
				&& Objects.equals(this.issueEventTypeName, jiraEvent.issueEventTypeName)
				&& Objects.equals(this.user, jiraEvent.user) && Objects.equals(this.issue, jiraEvent.issue)
				&& Objects.equals(this.comment, jiraEvent.comment)
				&& Objects.equals(this.changelog, jiraEvent.changelog);
	}


	@Override
	public int hashCode() {
		return Objects.hash(timestamp, webhookEvent, issueEventTypeName, user, issue, changelog, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class JiraEventIssue {\n");

		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    webhookEvent: ").append(toIndentedString(webhookEvent)).append("\n");
		sb.append("    issueEventTypeName: ").append(toIndentedString(issueEventTypeName)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
		sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
		sb.append("    changelog: ").append(toIndentedString(changelog)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
