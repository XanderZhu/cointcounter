package org.xanderzhu.coincounter.core.injection

import org.xanderzhu.coincounter.category.injection.CategoryDataComponent
import org.xanderzhu.coincounter.db.injection.DatabaseComponent
import org.xanderzhu.coincounter.expense.injection.ExpenseDataComponent

interface AppGraph {
    val databaseComponent: DatabaseComponent

    fun buildExpenseDataComponent(): ExpenseDataComponent

    fun buildCategoryDataComponent(): CategoryDataComponent
}