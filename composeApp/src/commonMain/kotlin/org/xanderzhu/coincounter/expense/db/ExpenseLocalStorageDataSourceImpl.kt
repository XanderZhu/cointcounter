package org.xanderzhu.coincounter.expense.db

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import org.xanderzhu.coincounter.data.ExpenseQueries
import org.xanderzhu.coincounter.expense.data.source.ExpenseLocalStorageDataSource

class ExpenseLocalStorageDataSourceImpl(
    private val expensesQueries: ExpenseQueries,
    private val queryDispatcher: CoroutineDispatcher
) : ExpenseLocalStorageDataSource {
    override suspend fun addExpense(amount: Long) {
        withContext(queryDispatcher) {
            expensesQueries.insert(amount, null)
        }
    }
}