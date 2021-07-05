### Introduction
* Gradle build script describes about one or more projects.
* Each project is made up of different tasks and a task is a piece of work which a build performs.
* The task might be compiling some classes, storing class files into separate target folder, creating JAR, generating Javadoc, or publishing some achieves to the repositories.

### Defining Tasks
* Task is a keyword which is used to define a task into build script.
* __create():__ We can use create() method to define a task.

### Locating Tasks
* If we want to locate tasks that we have defined in the build file, then we have to use the respective standard project properties.
* That means each task is available as a property of the project, in which, __the task name is used as the property name.__
* We can also access the task's path by using the tasks. For this, we can call the __getByPath() method__ with a task name, or a relative path, or an absolute path.

### Adding dependencies to tasks
* We can make a task dependent on another task and that means, when one task is done then only other task will begin.
* Each task is differentiated with the task name.
* The collection of task names is referred by its tasks collection.
* __To refer to a task in another project, we should use path of the project as s prefix to the respective task name.__
* The following example adds a dependency from taskX to taskY.
* __There is another way to achieve task dependency which is, to define dependency using a Task object.__

### Adding a description
* We can add a description to our task.
* This description is displayed when we execute the __Gradle tasks__ and this is possible using, the __description keyword.__

### Skipping Tasks
* Skipping tasks ca be done by passing a predicate closure.
* This is possible only if method of a task or a closure throwing a __StopExecutionException__ before the actual work of a task is executed.

### Task Structure
* Gradle has different phases, when it comes to working with the tasks.
* __Configuration Phase:__
    * First of all, there is a __configuration phase__, where the code, which is specified directly in a task's closure, is executed.
    * The configuration block is executed for every available task and not only, for those tasks, which are later actually executed.
    * The configuration block is executed for available task and not only, for those tasks, which are later actually executed.
* __Execution Phase:__
    * After the configuration phase, the __execution phase__ runs the code inside the __doFirst__ or __doLast_ closures of those tasks, which are actually executed.