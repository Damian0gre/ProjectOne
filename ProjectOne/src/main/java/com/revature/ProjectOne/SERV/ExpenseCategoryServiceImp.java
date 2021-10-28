package com.revature.ProjectOne.SERV;

import javax.inject.Inject;

import com.revature.ProjectOne.DAO.ExpenseCategoryDAO;
import com.revature.ProjectOne.DAO.ExpenseCategoryDAOImp;
import com.revature.ProjectOne.ENT.ExpenseCategory;

import java.util.List;

public class ExpenseCategoryServiceImp implements ExpenseCategoryService {

	@Inject
//    private ExpenseCategoryDAO edao;

	private static ExpenseCategoryDAO edao = ExpenseCategoryDAOImp.getEdao();

	private static ExpenseCategoryService eserv;

	private ExpenseCategoryServiceImp() {
	}

	public static ExpenseCategoryService getEserv() {
		if (eserv == null)
			eserv = new ExpenseCategoryServiceImp();
		return eserv;
	}

	@Override
	public ExpenseCategory createExpenseCategory(ExpenseCategory expenseCategory) {
		return edao.createExpenseCategory(expenseCategory);
	}

	@Override
	public ExpenseCategory getExpenseCategoryById(int cid) {
		return edao.getExpenseCategoryById(cid);
	}

	@Override
	public ExpenseCategory getExpenseCategoryByTitle(String title) {
		List<ExpenseCategory> expenseCategories = edao.getAllExpenseCategories();

		for (ExpenseCategory e : expenseCategories) {
			if (e.getTitle().compareToIgnoreCase(title) == 0) {
				return e;
			}
		}

		return null;
	}

	@Override
	public List<ExpenseCategory> getAllExpenseCategories() {
		return edao.getAllExpenseCategories();
	}

	@Override
	public ExpenseCategory updateExpenseCategory(ExpenseCategory expenseCategory) {
		return edao.updateExpenseCategory(expenseCategory);
	}

	@Override
	public boolean deleteExpenseCategory(ExpenseCategory expenseCategory) {
		return edao.deleteExpenseCategory(expenseCategory);
	}
}
