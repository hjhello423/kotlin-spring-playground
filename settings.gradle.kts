plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "kotlin-spring-playground"

include("playground-api")
include("playground-application")
include("playground-domain")
include("playground-infrastructure")
