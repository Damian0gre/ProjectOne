package com.revature.ProjectOne.DAO;

import java.util.List;

import com.revature.ProjectOne.ENT.Manager;

public interface ManagerDAO {

//	CRUD
	Manager createManager(Manager manager);

//	READ
	Manager getManagerById(int mgid);

	List<Manager> getAllManagers();

//	Update
	Manager updateManager(Manager manager);

//	DELETE
	boolean deleteManager(Manager manager);
}
