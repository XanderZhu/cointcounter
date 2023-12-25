package org.xanderzhu.coincounter.category.injection

import kotlinx.coroutines.Dispatchers
import org.xanderzhu.coincounter.category.data.repository.CategoryRepositoryImpl
import org.xanderzhu.coincounter.category.db.CategoryLocalStorageDataSourceImpl
import org.xanderzhu.coincounter.category.domain.repository.CategoryRepository
import org.xanderzhu.coincounter.db.injection.DatabaseComponent

class CategoryDataComponentImpl(
    private val databaseComponent: DatabaseComponent
) : CategoryDataComponent {
    override val categoryRepository: CategoryRepository
        get() = CategoryRepositoryImpl(
            categoryLocalStorageDataSource = CategoryLocalStorageDataSourceImpl(
                categoryQueries = databaseComponent.database.categoryQueries,
                queryDispatcher = Dispatchers.IO
            )
        )
}