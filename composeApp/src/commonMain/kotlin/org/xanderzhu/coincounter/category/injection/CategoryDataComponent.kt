package org.xanderzhu.coincounter.category.injection

import org.xanderzhu.coincounter.category.domain.repository.CategoryRepository

interface CategoryDataComponent {
    val categoryRepository: CategoryRepository
}