package com.revature.ProjectOne.SERV;

import javax.inject.Inject;

import com.revature.ProjectOne.DAO.ManagerDAO;
import com.revature.ProjectOne.DAO.ManagerDAOImp;
import com.revature.ProjectOne.ENT.Manager;

import java.util.List;

public class ManagerServiceImp implements ManagerService {

	@Inject
//    private ManagerDAO mdao;

	private ManagerDAO mdao = ManagerDAOImp.getMdao();

	private static ManagerService mserv;

	private ManagerServiceImp() {
		super();
	}

	public static ManagerService getMserv() {
		if (mserv == null)
			mserv = new ManagerServiceImp();

		return mserv;
	}

	@Override
	public Manager createManager(Manager manager) {
		return mdao.createManager(manager);
	}

	@Override
	public Manager getManagerById(int mgid) {
		return mdao.getManagerById(mgid);
	}

//    @Override
	public Manager getManagerByName(String name) {

		List<Manager> managers = mdao.getAllManagers();
		for (Manager m : managers) {

			if (m.getName().compareToIgnoreCase(name) == 0) {
				return m;
			}
		}
		return null;
	}

	@Override
	public Manager getManagerByEmail(String email) {
		List<Manager> managers = mdao.getAllManagers();
		for (Manager m : managers) {

			if (m.getEmail().compareToIgnoreCase(email) == 0) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Manager> getAllManagers() {
		return mdao.getAllManagers();
	}

	@Override
	public Manager updateManager(Manager manager) {
		return mdao.updateManager(manager);
	}

	@Override
	public boolean deleteManager(Manager manager) {
		return mdao.deleteManager(manager);
	}
}
