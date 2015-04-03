package org.hackathon.io.onesync.search.domain;

import java.io.Serializable;

/*
 *  CloudService related information
 * 
 */

public class CloudService implements Serializable {
	/*
	 * Id: identifier, appSecret: App authentication
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cloudId;

	private String cloudServiceName;

	private String cloudServiceUrl;

	private String appSecret;

	public CloudService() {
		super();
	}

	public int getCloudId() {
		return cloudId;
	}

	public void setCloudId(int cloudId) {
		this.cloudId = cloudId;
	}

	public String getCloudServiceName() {
		return cloudServiceName;
	}

	public void setCloudServiceName(String cloudServiceName) {
		this.cloudServiceName = cloudServiceName;
	}

	public String getCloudServiceUrl() {
		return cloudServiceUrl;
	}

	public void setCloudServiceUrl(String cloudServiceUrl) {
		this.cloudServiceUrl = cloudServiceUrl;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
