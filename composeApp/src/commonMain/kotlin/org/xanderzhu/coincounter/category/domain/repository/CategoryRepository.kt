package org.xanderzhu.coincounter.category.domain.repository

import org.xanderzhu.coincounter.category.domain.model.Category

interface CategoryRepository {
    suspend fun getAllCategories(): List<Category>

    suspend fun addCategory(categoryName: String)
}