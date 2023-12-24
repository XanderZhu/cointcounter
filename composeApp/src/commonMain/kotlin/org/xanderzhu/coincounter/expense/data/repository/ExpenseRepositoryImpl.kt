package org.xanderzhu.coincounter.expense.data.repository

import org.xanderzhu.coincounter.expense.data.source.ExpenseLocalStorageDataSource
import org.xanderzhu.coincounter.expense.domain.repository.ExpenseRepository

class ExpenseRepositoryImpl(
    private val expenseLocalStorageDataSource: ExpenseLocalStorageDataSource
) : ExpenseRepository {
    override suspend fun addExpense(amount: Long) {
        expenseLocalStorageDataSource.addExpense(amount)
    }
}