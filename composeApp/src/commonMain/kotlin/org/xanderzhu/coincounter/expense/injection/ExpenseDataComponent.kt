package org.xanderzhu.coincounter.expense.injection

import org.xanderzhu.coincounter.expense.domain.repository.ExpenseRepository

interface ExpenseDataComponent {
    val expenseRepository: ExpenseRepository
}