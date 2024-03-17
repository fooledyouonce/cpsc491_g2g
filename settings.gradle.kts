import java.io.File
import java.io.FileInputStream
import java.util.*

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://api.mapbox.com/downloads/v2/releases/maven")
            credentials.username = "mapbox"
            val localProperties = Properties().apply {
                load(FileInputStream(File(rootDir, "local.properties")))
            }
            credentials.password = localProperties.getProperty("MAPBOX_DOWNLOADS_TOKEN")
            authentication.create<BasicAuthentication>("basic")
        }
    }
}

rootProject.name = "Got2Go"
include(":app")
