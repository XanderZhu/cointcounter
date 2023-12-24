package org.xanderzhu.coincounter.expense.injection

import kotlinx.coroutines.Dispatchers
import org.xanderzhu.coincounter.db.injection.DatabaseComponent
import org.xanderzhu.coincounter.expense.data.repository.ExpenseRepositoryImpl
import org.xanderzhu.coincounter.expense.db.ExpenseLocalStorageDataSourceImpl
import org.xanderzhu.coincounter.expense.domain.repository.ExpenseRepository

class ExpenseDataComponentImpl(
    private val databaseComponent: DatabaseComponent
) : ExpenseDataComponent {
    override val expenseRepository: ExpenseRepository
        get() = ExpenseRepositoryImpl(
            expenseLocalStorageDataSource = ExpenseLocalStorageDataSourceImpl(
                expensesQueries = databaseComponent.database.expenseQueries,
                queryDispatcher = Dispatchers.IO
            )
        )

}