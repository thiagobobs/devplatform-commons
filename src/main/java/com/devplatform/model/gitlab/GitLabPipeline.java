package com.devplatform.model.gitlab;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitLabPipeline {

	@JsonProperty("id")
	private BigDecimal id;

	@JsonProperty("iid")
	private BigDecimal iid;

	@JsonProperty("project_id")
	private BigDecimal projectId;

	@JsonProperty("status")
	private GitlabPipelineStatusEnum status;

	@JsonProperty("ref")
	private String ref;

	@JsonProperty("sha")
	private String sha;

	@JsonProperty("before_sha")
	private String beforeSha;

	@JsonProperty("tag")
	private Boolean tag;

	@JsonProperty("yaml_errors")
	private String yamlErrors;

	@JsonProperty("user")
	private GitlabUser user;

	@JsonProperty("created_at")
	private String createdAt;

	@JsonProperty("updated_at")
	private String updatedAt;

	@JsonProperty("started_at")
	private String startedAt;

	@JsonProperty("finished_at")
	private String finishedAt;

	@JsonProperty("committed_at")
	private String committedAt;

	@JsonProperty("web_url")
	private String webUrl;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getIid() {
		return iid;
	}

	public void setIid(BigDecimal iid) {
		this.iid = iid;
	}

	public BigDecimal getProjectId() {
		return projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public GitlabPipelineStatusEnum getStatus() {
		return status;
	}

	public void setStatus(GitlabPipelineStatusEnum status) {
		this.status = status;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getSha() {
		return sha;
	}

	public void setSha(String sha) {
		this.sha = sha;
	}

	public String getBeforeSha() {
		return beforeSha;
	}

	public void setBeforeSha(String beforeSha) {
		this.beforeSha = beforeSha;
	}

	public Boolean getTag() {
		return tag;
	}

	public void setTag(Boolean tag) {
		this.tag = tag;
	}

	public String getYamlErrors() {
		return yamlErrors;
	}

	public void setYamlErrors(String yamlErrors) {
		this.yamlErrors = yamlErrors;
	}

	public GitlabUser getUser() {
		return user;
	}

	public void setUser(GitlabUser user) {
		this.user = user;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public String getFinishedAt() {
		return finishedAt;
	}

	public void setFinishedAt(String finishedAt) {
		this.finishedAt = finishedAt;
	}

	public String getCommittedAt() {
		return committedAt;
	}

	public void setCommittedAt(String committedAt) {
		this.committedAt = committedAt;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
