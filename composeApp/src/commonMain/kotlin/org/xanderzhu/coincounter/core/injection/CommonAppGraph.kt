package org.xanderzhu.coincounter.core.injection

import org.xanderzhu.coincounter.db.DatabaseDriverFactory
import org.xanderzhu.coincounter.db.injection.DatabaseComponent
import org.xanderzhu.coincounter.db.injection.DatabaseComponentImpl

class CommonAppGraphDelegate(
    private val databaseDriverFactory: DatabaseDriverFactory
): AppGraph {

    override val databaseComponent: DatabaseComponent
        get() = DatabaseComponentImpl(databaseDriverFactory)
}