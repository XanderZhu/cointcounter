package org.xanderzhu.coincounter.category.data.repository

import org.xanderzhu.coincounter.category.data.source.CategoryLocalStorageDataSource
import org.xanderzhu.coincounter.category.domain.model.Category
import org.xanderzhu.coincounter.category.domain.repository.CategoryRepository

class CategoryRepositoryImpl(
    private val categoryLocalStorageDataSource: CategoryLocalStorageDataSource
) : CategoryRepository {
    override suspend fun getAllCategories(): List<Category> =
        categoryLocalStorageDataSource.getAllCategories()

    override suspend fun addCategory(categoryName: String) =
        categoryLocalStorageDataSource.addCategory(categoryName)
}