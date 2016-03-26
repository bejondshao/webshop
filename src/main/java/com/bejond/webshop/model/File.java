package com.bejond.webshop.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlIDREF;
import java.util.Date;

/**
 * Created by bejond on 3/16/16.
 */

@Component
@Entity (name = "File_")
public class File {
	private long fileId;
	private long userId;
	private Group group;
	private Folder folder;
	private long smallImageId;
	private long largeImageId;
	private String treePath;
	private String name;
	private String extension;
	private String mimeType;
	private String title;
	private String description;
	private String version;
	private long size;
	private int readCount;
	private Date createDate;
	private Date modifiedDate;
	private int status;
	private long statusByUserId;
	private Date statusDate;

	@Id
	@GeneratedValue
	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "groupId")
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "folderId")
	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public long getSmallImageId() {
		return smallImageId;
	}

	public void setSmallImageId(long smallImageId) {
		this.smallImageId = smallImageId;
	}

	public long getLargeImageId() {
		return largeImageId;
	}

	public void setLargeImageId(long largeImageId) {
		this.largeImageId = largeImageId;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getStatusByUserId() {
		return statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		this.statusByUserId = statusByUserId;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
}
