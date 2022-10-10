package com.devplatform.model.gitlab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GitlabEventChanges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-18T01:03:28.811Z[GMT]")
public class GitlabEventChangedItem<E> {
	@JsonProperty("previous")
	private E previous;

	@JsonProperty("current")
	private E current;

	@ApiModelProperty(value = "")
	public E getPrevious() {
		return previous;
	}

	public void setPrevious(E previous) {
		this.previous = previous;
	}

	public GitlabEventChangedItem<E> previous(E previous) {
		this.previous = previous;
		return this;
	}

	@ApiModelProperty(value = "")
	public E getCurrent() {
		return current;
	}

	public void setCurrent(E current) {
		this.current = current;
	}

	public GitlabEventChangedItem<E> current(E current) {
		this.current = current;
		return this;
	}
	
	@SuppressWarnings("unchecked")
	public E getAddedItems(){
		E addedValue = null;
		if(getCurrent() instanceof List) {
			List<Object> currentList = (List<Object>) getCurrent();
			List<Object> previousList = (List<Object>) getPrevious();

			List<Object> addedItems = new ArrayList<>();

			if(currentList != null) {
				if(previousList == null) {
					addedItems = currentList;
				}else {
					for (Object c : currentList) {
						if(!previousList.contains(c)) {
							addedItems.add(c);
						}
					}
				}
			}
			addedValue = (E) addedItems;
		}else if(getCurrent() != null) {
			addedValue = getCurrent();
		}
		
		return addedValue;
	}

	@SuppressWarnings("unchecked")
	public E getRemovedItems(){
		E removedValue = null;
		if(getCurrent() instanceof List) {
			List<Object> currentList = (List<Object>) getCurrent();
			List<Object> previousList = (List<Object>) getPrevious();

			List<Object> removedItems = new ArrayList<>();

			if(previousList != null) {
				if(currentList == null) {
					removedItems = previousList;
				}else {
					for (Object p : previousList) {
						if(!currentList.contains(p)) {
							removedItems.add(p);
						}
					}
				}
			}
			removedValue = (E) removedItems;
		}else if(getPrevious() != null) {
			removedValue = getPrevious();
		}
		return removedValue;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GitlabEventChangedItem<?> other = (GitlabEventChangedItem<?>) obj;
		if (current == null) {
			if (other.current != null)
				return false;
		} else if (!current.equals(other.current))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GitlabEventChanges {\n");

		sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
		sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
