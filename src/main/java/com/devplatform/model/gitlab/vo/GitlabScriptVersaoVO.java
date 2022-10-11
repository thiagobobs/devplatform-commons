package com.devplatform.model.gitlab.vo;

import org.apache.commons.lang3.StringUtils;

public class GitlabScriptVersaoVO{
	String nameWithPath;
	String name;
	String version;
	Integer order;
	String type; // DDL or DML
	String specificName;
	String newNameWithPath;
	
	public GitlabScriptVersaoVO(String nameWithPath) throws IllegalArgumentException {
		super();
		this.nameWithPath = nameWithPath;

		String[] scriptPath = nameWithPath.split("/");
		if(scriptPath.length > 0) {
			this.name = scriptPath[scriptPath.length - 1];
			String[] nameParts = name.split("_");

			if(nameParts.length >= 2) {
				this.version = nameParts[1];
				this.order = Integer.valueOf(nameParts[2]);
				nameParts = name.split("__");
				String scriptName = "";
				for(int i=1; i < nameParts.length; i++) {
					if(i!=1) {
						scriptName += "__";
					}
					scriptName += nameParts[i];
				}
				this.specificName = scriptName;
				if(scriptName.contains("DML")) {
					this.type = "DML";
					this.specificName = scriptName.replaceFirst("DML_", "");
				}else if(scriptName.contains("DDL")) {
					this.type = "DDL";
					this.specificName = scriptName.replaceFirst("DDL_", "");
				}
			}
		}

//		if (StringUtils.isEmpty(this.name) || StringUtils.isEmpty(this.version) || (StringUtils.isEmpty(this.type) && !this.name.contains("VERSAO_INICIAL"))
//				|| StringUtils.isEmpty(this.specificName) || this.order == null) {
//			
//			throw new IllegalArgumentException(String.format("Nome do arquivo %s inválido. %s", nameWithPath, 
//					(StringUtils.isEmpty(this.name) ? "name vazio" : (StringUtils.isEmpty(this.version) ? "version vazia": (StringUtils.isEmpty(this.type) ? "type vazio" : 
//						(StringUtils.isEmpty(this.specificName) ? "specificName vazio" : (this.order == null ? "order nulo": "")))))));
//		}
	}
	public String getNameWithPath() {
		return nameWithPath;
	}
	public void setNameWithPath(String nameWithPath) {
		this.nameWithPath = nameWithPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecificName() {
		return specificName;
	}
	public void setSpecificName(String specificName) {
		this.specificName = specificName;
	}
	public String getNewNameWithPath() {
		return newNameWithPath;
	}
	public void setNewNameWithPath(String newNameWithPath) {
		this.newNameWithPath = newNameWithPath;
	}
	@Override
	public String toString() {
		return "GitlabScriptVersaoVO [nameWithPath=" + nameWithPath + ", name=" + name + ", version=" + version
				+ ", order=" + order + ", type=" + type + ", specificName=" + specificName + ", newNameWithPath="
				+ newNameWithPath + "]";
	}
}