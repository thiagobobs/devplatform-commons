package com.devplatform.model.slack.event;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SlackChannelMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class SlackEventGeneric {
	/**
	 * Gets or Sets type
	 */
	@JsonProperty("type")
	private SlackEventTypeEnum type = null;

	public SlackEventGeneric type(SlackEventTypeEnum type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	@NotNull
	public SlackEventTypeEnum getType() {
		return type;
	}

	public void setType(SlackEventTypeEnum type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SlackEventGeneric slackChannelMessage = (SlackEventGeneric) o;
		return Objects.equals(this.type, slackChannelMessage.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SlackEventGeneric {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
