package org.hackathon.io.onesync.search.repository;

import java.util.List;

import org.hackathon.io.onesync.search.domain.CloudFile;
import org.hackathon.io.onesync.search.domain.CloudService;

public interface IFileRepository {
	
	public List<CloudService> getAllCloudServices();
	
	public List<CloudFile> getAllFiles(String cloudService);
	
	public List<CloudFile> getAllFiles();
		
}
