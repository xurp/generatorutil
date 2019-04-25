package com.example.generatorutil.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.generatorutil.dao.UserCopyMapper;
import com.example.generatorutil.model.UserCopy;
import com.example.generatorutil.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserCopyMapper userMapper;
	@Override
	public UserCopy select(int id) {
		return userMapper.selectByPrimaryKey(id);
	}
	@Override
	public void insert(UserCopy userCopy) {
		
		
	}

}
