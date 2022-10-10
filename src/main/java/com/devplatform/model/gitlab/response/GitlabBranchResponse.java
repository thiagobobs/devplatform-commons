package com.devplatform.model.gitlab.response;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.devplatform.model.gitlab.GitlabCommit;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GitlabCommit
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabBranchResponse {
	@JsonProperty("name")
	private String branchName = null;
	
	@JsonProperty("commit")
	private GitlabCommit commit = null;

	@JsonProperty("merged")
	private Boolean merged = null;

	@JsonProperty("protected")
	private Boolean branchProtected = null;

	@JsonProperty("developers_can_push")
	private Boolean developersCanPush = null;

	@JsonProperty("developers_can_merge")
	private Boolean developersCanMerge = null;

	@JsonProperty("can_push")
	private Boolean canPush = null;

	@JsonProperty("default")
	private Boolean branchDefault = null;
	
	@JsonProperty("web_url")
	private String webUrl;

	public GitlabBranchResponse branchName(String branchName) {
		this.branchName = branchName;
		return this;
	}

	@Valid
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public GitlabBranchResponse commit(GitlabCommit commit) {
		this.commit = commit;
		return this;
	}

	@Valid
	public GitlabCommit getCommit() {
		return commit;
	}

	public void setCommit(GitlabCommit commit) {
		this.commit = commit;
	}

	public GitlabBranchResponse merged(Boolean merged) {
		this.merged = merged;
		return this;
	}

	@Valid
	public Boolean getMerged() {
		return merged;
	}

	public void setMerged(Boolean merged) {
		this.merged = merged;
	}

	public GitlabBranchResponse branchProtected(Boolean branchProtected) {
		this.branchProtected = branchProtected;
		return this;
	}

	@Valid
	public Boolean getBranchProtected() {
		return branchProtected;
	}

	public void setBranchProtected(Boolean branchProtected) {
		this.branchProtected = branchProtected;
	}

	public GitlabBranchResponse developersCanPush(Boolean developersCanPush) {
		this.developersCanPush = developersCanPush;
		return this;
	}

	@Valid
	public Boolean getDevelopersCanPush() {
		return developersCanPush;
	}

	public void setDevelopersCanPush(Boolean developersCanPush) {
		this.developersCanPush = developersCanPush;
	}

	public GitlabBranchResponse developersCanMerge(Boolean developersCanMerge) {
		this.developersCanMerge = developersCanMerge;
		return this;
	}

	@Valid
	public Boolean getDevelopersCanMerge() {
		return developersCanMerge;
	}

	public void setDevelopersCanMerge(Boolean developersCanMerge) {
		this.developersCanMerge = developersCanMerge;
	}

	public GitlabBranchResponse canPush(Boolean canPush) {
		this.canPush = canPush;
		return this;
	}

	@Valid
	public Boolean getCanPush() {
		return canPush;
	}

	public void setCanPush(Boolean canPush) {
		this.canPush = canPush;
	}

	public GitlabBranchResponse branchDefault(Boolean branchDefault) {
		this.branchDefault = branchDefault;
		return this;
	}

	@Valid
	public Boolean getBranchDefault() {
		return branchDefault;
	}

	public void setBranchDefault(Boolean branchDefault) {
		this.branchDefault = branchDefault;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

}
