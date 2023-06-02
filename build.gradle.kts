plugins {
    id("java")
    id("maven-publish")
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "net.arcane.skills"
version = "1.1.0"

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")
    apply(plugin = "com.github.johnrengelman.shadow")

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    configurations.all {
        resolutionStrategy.cacheChangingModulesFor(0, TimeUnit.SECONDS)
    }

    repositories {
        mavenCentral()

        maven("https://repo.codemc.org/repository/maven-public/")
        maven("https://repo.codemc.io/repository/maven-public/")
        maven("https://oss.sonatype.org/content/groups/public/")
        maven("https://repo.aikar.co/content/groups/aikar/")
        maven("https://maven.elmakers.com/repository/")
        maven("https://jitpack.io")
        maven("https://repo.codemc.io/repository/maven-public/")
    }

    dependencies {
        compileOnly("org.spigotmc:spigot:1.8.8-R0.1-SNAPSHOT")
        compileOnly(fileTree("src/main/libs"))

        /**
         * databases dependencies
         */
        implementation("org.mongodb:mongodb-driver-sync:4.8.0")

        /**
         * API and frameworks used in development
         */
        implementation("com.github.saiintbrisson.command-framework:bukkit:1.2.0")
        compileOnly("com.github.DevNatan.inventory-framework:inventory-framework:2.5.4-rc.1") // download inventoryframework jar

        compileOnly("org.jetbrains:annotations:23.0.0")
        compileOnly("org.projectlombok:lombok:1.18.24")
        annotationProcessor("org.projectlombok:lombok:1.18.24")
    }
}