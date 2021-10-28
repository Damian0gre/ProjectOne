package com.revature.ProjectOne.DAO;

import java.util.List;

import com.revature.ProjectOne.ENT.Reimbursement;

public interface ReimbursementDAO {

//	CRUD
	Reimbursement createReimbursement(Reimbursement reimbursement);

//	Read
	Reimbursement getReimbursementById(int rid);

	List<Reimbursement> getAllReimbursement();

//	Update
	Reimbursement updateReimbursement(Reimbursement reimbursement);

//	Delete
	boolean deleteReimbursement(Reimbursement reimbursement);

}
