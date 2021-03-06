package com.mego.service;

import java.util.List;

import com.mego.dto.UserDto;

public interface TestService {
	
	public String readingList();
	
	public String fallbackReadingList();
	
	public void saveUser() throws Exception;
	
	public List<UserDto> findUsers(String username) throws Exception;
}
