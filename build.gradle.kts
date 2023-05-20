plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    //Enterprise Java Beans
    implementation("javax.ejb:javax.ejb-api:3.2.2")
    // Contexts and Dependency Injection
    implementation("javax.enterprise:cdi-api:2.0.SP1")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}