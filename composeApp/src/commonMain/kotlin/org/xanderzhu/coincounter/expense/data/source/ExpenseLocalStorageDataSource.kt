package org.xanderzhu.coincounter.expense.data.source

interface ExpenseLocalStorageDataSource {
    suspend fun addExpense(amount: Long)
}