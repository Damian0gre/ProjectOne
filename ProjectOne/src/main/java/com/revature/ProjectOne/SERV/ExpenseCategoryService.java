package com.revature.ProjectOne.SERV;

import java.util.List;
import com.revature.ProjectOne.ENT.ExpenseCategory;

public interface ExpenseCategoryService {

	ExpenseCategory createExpenseCategory(ExpenseCategory expenseCategory);

	ExpenseCategory getExpenseCategoryById(int cid);

	ExpenseCategory getExpenseCategoryByTitle(String title);

	List<ExpenseCategory> getAllExpenseCategories();

	ExpenseCategory updateExpenseCategory(ExpenseCategory expenseCategory);

	boolean deleteExpenseCategory(ExpenseCategory expenseCategory);

}
