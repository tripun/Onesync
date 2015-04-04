package org.hackathon.io.onesync.search.repository;

import java.util.Map;

import org.hackathon.io.onesync.search.domain.User;

/*
 *  User related query functions
 */
public interface IUserRepository {

	public User getUser(String usernamae);

	public User authenticatetUser(String usernamae, String password);

	public void addUser(User user);

	public void addService(String username, String cloudService, String token);

	public Map<Integer, String> getTokens(String username);

}
