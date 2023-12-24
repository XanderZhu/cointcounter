package org.xanderzhu.coincounter

import android.app.Application
import org.xanderzhu.coincounter.core.injection.AndroidAppGraph

class CoincounterApp : Application() {
    companion object {
        private var _appGraph: AndroidAppGraph? = null
        val appGraph: AndroidAppGraph
            get() = requireNotNull(_appGraph) {
                "CoincounterApp is not initilized yet! It is prohibited to access appGraph before Application.onCreate"
            }
    }

    override fun onCreate() {
        super.onCreate()
        _appGraph = AndroidAppGraph(application = this)
    }
}