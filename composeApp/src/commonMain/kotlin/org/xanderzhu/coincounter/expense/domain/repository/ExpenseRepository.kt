package org.xanderzhu.coincounter.expense.domain.repository

interface ExpenseRepository {
    suspend fun addExpense(amount: Long)
}