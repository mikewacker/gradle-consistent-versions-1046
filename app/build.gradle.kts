plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava")
}

application {
    mainClass.set("example.App")
}
