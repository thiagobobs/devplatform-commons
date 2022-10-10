package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabChanges {

	@JsonProperty("old_path")
	private String oldPath;

	@JsonProperty("new_path")
	private String newPath;

	@JsonProperty("a_mode")
	private String aMode;

	@JsonProperty("b_mode")
	private String bMode;

	@JsonProperty("diff")
	private String diff;

	@JsonProperty("new_file")
	private Boolean newFile;

	@JsonProperty("renamed_file")
	private Boolean renamedFile;

	@JsonProperty("deleted_file")
	private Boolean deletedFile;

	public String getOldPath() {
		return oldPath;
	}

	public void setOldPath(String oldPath) {
		this.oldPath = oldPath;
	}

	public String getNewPath() {
		return newPath;
	}

	public void setNewPath(String newPath) {
		this.newPath = newPath;
	}

	public String getaMode() {
		return aMode;
	}

	public void setaMode(String aMode) {
		this.aMode = aMode;
	}

	public String getbMode() {
		return bMode;
	}

	public void setbMode(String bMode) {
		this.bMode = bMode;
	}

	public String getDiff() {
		return diff;
	}

	public void setDiff(String diff) {
		this.diff = diff;
	}

	public Boolean getNewFile() {
		return newFile;
	}

	public void setNewFile(Boolean newFile) {
		this.newFile = newFile;
	}

	public Boolean getRenamedFile() {
		return renamedFile;
	}

	public void setRenamedFile(Boolean renamedFile) {
		this.renamedFile = renamedFile;
	}

	public Boolean getDeletedFile() {
		return deletedFile;
	}

	public void setDeletedFile(Boolean deletedFile) {
		this.deletedFile = deletedFile;
	}

}
