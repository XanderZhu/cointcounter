package org.xanderzhu.coincounter.db.injection

import org.xanderzhu.coincounter.data.Database
import org.xanderzhu.coincounter.db.DatabaseBuilder
import org.xanderzhu.coincounter.db.DatabaseDriverFactory

class DatabaseComponentImpl(
    private val databaseDriverFactory: DatabaseDriverFactory
) : DatabaseComponent {
    override val database: Database by lazy {
        DatabaseBuilder.createDatabase(databaseDriverFactory)
    }
}