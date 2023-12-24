package org.xanderzhu.coincounter.db.injection

import org.xanderzhu.coincounter.data.Database

interface DatabaseComponent {
    val database: Database
}