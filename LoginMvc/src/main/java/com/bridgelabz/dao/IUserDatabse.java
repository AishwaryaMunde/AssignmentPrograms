package com.bridgelabz.dao;

import com.bridgelabz.model.Userdata;

public interface IUserDatabse
{
	public boolean userVerify(String userName , String Password);
	public void save(Userdata userData);
}
