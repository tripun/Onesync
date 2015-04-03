package org.hackathon.io.onesync.search.domain;

import java.io.Serializable;
import java.util.Date;

/*
 *  File class, store all file related information
 */

public class File implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * fileId: Global FileId, filename: filename max 255 chars relativePath:
	 * relative to user root folder on cloud cloudId :assigned Id of the service
	 * involved cloudUrl: direct link of the file to the hosting service
	 */

	private long fileId;

	private String filename;

	private String relativePath;

	private int cloudId;

	private String cloudUrl;

	private long filesize;

	private Date createdOn;
	private Date modifiedOn;
	private boolean isFolder;
	private boolean isDeleted;
	private boolean isShared;

	public File() {

	}

	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public void setRelativePath(String relativePath) {
		this.relativePath = relativePath;
	}

	public int getCloudId() {
		return cloudId;
	}

	public void setCloudId(int cloudId) {
		this.cloudId = cloudId;
	}

	public String getCloudUrl() {
		return cloudUrl;
	}

	public void setCloudUrl(String cloudUrl) {
		this.cloudUrl = cloudUrl;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isFolder() {
		return isFolder;
	}

	public void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean isShared() {
		return isShared;
	}

	public void setShared(boolean isShared) {
		this.isShared = isShared;
	}

}
