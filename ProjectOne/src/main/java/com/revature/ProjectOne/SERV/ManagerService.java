package com.revature.ProjectOne.SERV;

import java.util.List;

import com.revature.ProjectOne.ENT.Manager;

public interface ManagerService {

//    CRUD
	Manager createManager(Manager manager);

//    Read
	Manager getManagerById(int mgid);

	Manager getManagerByName(String name);

	Manager getManagerByEmail(String email);

	List<Manager> getAllManagers();

//    Update
	Manager updateManager(Manager manager);

//    Delete
	boolean deleteManager(Manager manager);
}
