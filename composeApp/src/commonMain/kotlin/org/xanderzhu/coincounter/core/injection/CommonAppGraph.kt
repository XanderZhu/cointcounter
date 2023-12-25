package org.xanderzhu.coincounter.core.injection

import org.xanderzhu.coincounter.category.injection.CategoryDataComponent
import org.xanderzhu.coincounter.category.injection.CategoryDataComponentImpl
import org.xanderzhu.coincounter.db.DatabaseDriverFactory
import org.xanderzhu.coincounter.db.injection.DatabaseComponent
import org.xanderzhu.coincounter.db.injection.DatabaseComponentImpl
import org.xanderzhu.coincounter.expense.injection.ExpenseDataComponent
import org.xanderzhu.coincounter.expense.injection.ExpenseDataComponentImpl

class CommonAppGraphDelegate(
    private val databaseDriverFactory: DatabaseDriverFactory
): AppGraph {

    override val databaseComponent: DatabaseComponent by lazy {
        DatabaseComponentImpl(databaseDriverFactory)
    }

    override fun buildExpenseDataComponent(): ExpenseDataComponent =
        ExpenseDataComponentImpl(
            databaseComponent = databaseComponent
        )

    override fun buildCategoryDataComponent(): CategoryDataComponent =
        CategoryDataComponentImpl(
            databaseComponent = databaseComponent
        )
}