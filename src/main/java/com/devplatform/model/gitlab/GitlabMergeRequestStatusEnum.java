package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GitlabMergeRequestStatusEnum {
	CAN_BE_MERGED("can_be_merged"),
	UNCHECKED("unchecked"),
	CAN_NOT_BE_MERGED("cannot_be_merged"),
	CHECKING("checking"),
	CANNOT_BE_MERGED_RECHECK("cannot_be_merged_recheck");

	private String value;

	GitlabMergeRequestStatusEnum(String value) {
		this.value = value;
	}

	@Override
	@JsonValue
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static GitlabMergeRequestStatusEnum fromValue(String text) {
		for (GitlabMergeRequestStatusEnum b : GitlabMergeRequestStatusEnum.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}
}