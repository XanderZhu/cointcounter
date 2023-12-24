package org.xanderzhu.coincounter.db

import org.xanderzhu.coincounter.data.Database

object DatabaseBuilder {
    fun createDatabase(driverFactory: DatabaseDriverFactory): Database {
        val driver = driverFactory.createDriver()
        val database = Database(driver)
        return database
    }
}