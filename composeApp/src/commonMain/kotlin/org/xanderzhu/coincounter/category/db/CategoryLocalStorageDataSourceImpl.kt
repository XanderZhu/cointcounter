package org.xanderzhu.coincounter.category.db

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import org.xanderzhu.coincounter.category.data.source.CategoryLocalStorageDataSource
import org.xanderzhu.coincounter.category.domain.model.Category
import org.xanderzhu.coincounter.data.Category as CategoryDbModel
import org.xanderzhu.coincounter.data.CategoryQueries

class CategoryLocalStorageDataSourceImpl(
    private val categoryQueries: CategoryQueries,
    private val queryDispatcher: CoroutineDispatcher
) : CategoryLocalStorageDataSource {
    override suspend fun getAllCategories(): List<Category> =
        withContext(queryDispatcher) {
            categoryQueries
                .getAll()
                .executeAsList()
                .map(::mapDbModelToCategory)
        }

    override suspend fun addCategory(categoryName: String) {
        withContext(queryDispatcher) {
            categoryQueries.insert(categoryName)
        }
    }

    private fun mapDbModelToCategory(dbModel: CategoryDbModel): Category =
        Category(
            id = dbModel.category_id,
            name = dbModel.name
        )
}