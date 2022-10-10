package com.devplatform.model.gitlab.response;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.devplatform.model.gitlab.GitlabChanges;
import com.devplatform.model.gitlab.GitlabUser;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabMRChanges {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("iid")
	private Integer iid;

	@JsonProperty("project_id")
	private BigDecimal projectId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("state")
	private String state;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("updatedAt")
	private Date updated_at;

	@JsonProperty("target_branch")
	private String targetBranch;

	@JsonProperty("source_branch")
	private String sourceBranch;

	@JsonProperty("upvotes")
	private Integer upvotes;

	@JsonProperty("downvotes")
	private Integer downvotes;

	@JsonProperty("author")
	private GitlabUser author;

	@JsonProperty("assignee")
	private GitlabUser assignee;

	@JsonProperty("assignees")
	private List<GitlabUser> assignees;

	@JsonProperty("reviewers")
	private List<GitlabUser> reviewers;

	@JsonProperty("source_project_id")
	private BigDecimal sourceProjectId;

	@JsonProperty("target_project_id")
	private BigDecimal targetProjectId;

	@JsonProperty("labels")
	private List<String> labels;

	@JsonProperty("description")
	private String description;

	@JsonProperty("draft")
	private Boolean draft;

	@JsonProperty("work_in_progress")
	private Boolean workInProgress;

	@JsonProperty("changes")
	private List<GitlabChanges> changes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getTargetBranch() {
		return targetBranch;
	}

	public void setTargetBranch(String targetBranch) {
		this.targetBranch = targetBranch;
	}

	public String getSourceBranch() {
		return sourceBranch;
	}

	public void setSourceBranch(String sourceBranch) {
		this.sourceBranch = sourceBranch;
	}

	public Integer getUpvotes() {
		return upvotes;
	}

	public void setUpvotes(Integer upvotes) {
		this.upvotes = upvotes;
	}

	public Integer getDownvotes() {
		return downvotes;
	}

	public void setDownvotes(Integer downvotes) {
		this.downvotes = downvotes;
	}

	public GitlabUser getAuthor() {
		return author;
	}

	public void setAuthor(GitlabUser author) {
		this.author = author;
	}

	public GitlabUser getAssignee() {
		return assignee;
	}

	public void setAssignee(GitlabUser assignee) {
		this.assignee = assignee;
	}

	public List<GitlabUser> getAssignees() {
		return assignees;
	}

	public void setAssignees(List<GitlabUser> assignees) {
		this.assignees = assignees;
	}

	public List<GitlabUser> getReviewers() {
		return reviewers;
	}

	public void setReviewers(List<GitlabUser> reviewers) {
		this.reviewers = reviewers;
	}

	public BigDecimal getSourceProjectId() {
		return sourceProjectId;
	}

	public void setSourceProjectId(BigDecimal sourceProjectId) {
		this.sourceProjectId = sourceProjectId;
	}

	public BigDecimal getTargetProjectId() {
		return targetProjectId;
	}

	public void setTargetProjectId(BigDecimal targetProjectId) {
		this.targetProjectId = targetProjectId;
	}

	public List<String> getLabels() {
		return labels;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDraft() {
		return draft;
	}

	public void setDraft(Boolean draft) {
		this.draft = draft;
	}

	public Boolean getWorkInProgress() {
		return workInProgress;
	}

	public void setWorkInProgress(Boolean workInProgress) {
		this.workInProgress = workInProgress;
	}

	public List<GitlabChanges> getChanges() {
		if (changes == null) {
			changes = Collections.emptyList();
		}
		return changes;
	}

	public void setChanges(List<GitlabChanges> changes) {
		this.changes = changes;
	}

}
