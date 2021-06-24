import
plugins {
    java
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

}

repositories {
    mavenCentral()
}

group = "org.example"
version = "0.1-SNAPSHOT"

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}


//--------------------------------------------------------------------------
// Tasks

// Run the  by : `./gradlew hello`
// registering a task using and giving the task the name "hello"
tasks.register("hello") {
    doLast {
        println("Hello Gradle")
    }
}

// task2: countdown
// Run by `./gradlew countdown`
tasks.register("countdown") {
    println("This is configuration phase")
    doFirst {
        println("3")
    }
    doFirst {
        println("4")
    }
    doLast {
        println("2")
    }
    doLast {
        println("1")
    }
}

// task3: Building dependent and independent tasks
tasks.register("independent") {
    doFirst {
        println("This is teh independent task")
    }
}
tasks.register("dependent") {
    dependsOn("independent")
    doFirst{
        println("This is the dependent task")
    }
}
// Run by: `./gradlew build`
//
// main function
fun main(args: Array<String>) {
    println("Hello, Kotlin!")
}


//------------------ Calling Java from Kotlin ----------------------
//fun demoEventExporter(){
//    val eventExporter =
//}
//------------------------------------------------------------------

//--------------------------------------------------------------------------