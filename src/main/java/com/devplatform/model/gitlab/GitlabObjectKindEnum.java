package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabObjectKindEnum {
	MERGE_REQUEST("merge_request"),
	COMMENT("note"),
	TAG_PUSH("tag_push"),
	PUSH("push"),
	JOB_CHANGES("build"),
	PIPELINE_CHANGES("pipeline");

	private String value;

	GitlabObjectKindEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabObjectKindEnum fromValue(String text) {
		for (GitlabObjectKindEnum b : GitlabObjectKindEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}