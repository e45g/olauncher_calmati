package app.olauncher_calmati.helper

import app.olauncher_calmati.data.AppModel

interface AppFilterHelper {
    fun onAppFiltered(items:List<AppModel>)
}