package org.xanderzhu.coincounter.core.injection

import org.xanderzhu.coincounter.db.DatabaseDriverFactory
import org.xanderzhu.coincounter.db.injection.DatabaseComponent
import org.xanderzhu.coincounter.db.injection.DatabaseComponentImpl
import org.xanderzhu.coincounter.expense.injection.ExpenseDataComponent
import org.xanderzhu.coincounter.expense.injection.ExpenseDataComponentImpl

class CommonAppGraphDelegate(
    private val databaseDriverFactory: DatabaseDriverFactory
): AppGraph {
    override val databaseComponent: DatabaseComponent
        get() = DatabaseComponentImpl(databaseDriverFactory)

    override fun buildExpenseDataComponent(): ExpenseDataComponent =
        ExpenseDataComponentImpl(
            databaseComponent = databaseComponent
        )
}