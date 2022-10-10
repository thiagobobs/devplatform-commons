package com.devplatform.model.gitlab;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * https://docs.gitlab.com/ee/user/project/quick_actions.html
 */
public enum GitlabMergeRequestActionsEnum {
	OPEN("open", "aberto"),
	CLOSE("close", "fechado"),
	REOPEN("reopen", "reaberto"),
	UPDATE("update", "atualizado"),
	MERGE("merge", "integrado"),
	UNAPPROVED("unapproved", "reprovado"),
    APPROVED("approved", "aprovado");

    private String value;
    public String translated;

    GitlabMergeRequestActionsEnum(String value, String translated) {
      this.value = value;
      this.translated = translated;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GitlabMergeRequestActionsEnum fromValue(String text) {
      for (GitlabMergeRequestActionsEnum b : GitlabMergeRequestActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
