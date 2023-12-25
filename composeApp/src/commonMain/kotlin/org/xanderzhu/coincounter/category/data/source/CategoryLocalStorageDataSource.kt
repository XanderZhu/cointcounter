package org.xanderzhu.coincounter.category.data.source

import org.xanderzhu.coincounter.category.domain.model.Category

interface CategoryLocalStorageDataSource {
    suspend fun getAllCategories(): List<Category>

    suspend fun addCategory(categoryName: String)
}