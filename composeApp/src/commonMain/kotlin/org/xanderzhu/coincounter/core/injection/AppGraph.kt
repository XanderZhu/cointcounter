package org.xanderzhu.coincounter.core.injection

import org.xanderzhu.coincounter.db.injection.DatabaseComponent

interface AppGraph {
    val databaseComponent: DatabaseComponent
}