### Gradle commands
* Run the hello task by: `./gradlew hello`
* Run the main function by: `./gradlew build`
* To run main function with additional information: `./gradlew -i build`
* Each time we call `doFirst` we add that command to the very front of the queue.
* If we call `doLast`, we add command to the end of the queue.
* Run `countdown` task by: `./gradlew countdown`
* Run dependent task by: `./gradlew dependent`
