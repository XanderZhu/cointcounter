package org.xanderzhu.coincounter.core.injection

import android.app.Application
import org.xanderzhu.coincounter.db.AndroidDatabaseDriverFactory

class AndroidAppGraph(
    private val application: Application
) : AppGraph by CommonAppGraphDelegate(
    databaseDriverFactory = AndroidDatabaseDriverFactory(context = application)
)