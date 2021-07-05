* Gradle builds a script file for handling two things. One is projects and other is task.
* Every Gradle build represents one or more projects.
* __Every Gradle build represents one or more projects.__
* A project represents a library JAR or web application, or it might represent a ZIP that is assembled from the JARs produced by other projects. In simple words, a project is made up of different tasks.

### Property Accessors
* We can automatically access appropriate getter and setter methods of a particular property by specifying its reference.
* The following snippet defines the syntax of getter and setter methods of a property __buildDir__.

### Closure as the last Parameter
* Gradle DSL uses closures in many places, where the last parameter of a method is a closure.
* We can place the closure after the method call.
* The following snippet defines that the syntax Closures use repositories() method parameters.
* __Closure:__
    * A closure in Groovy is an open, anonymous, block of code that can take arguments, return a value and be assigned to a variable.
    * `Closure` in the Groovy language can also contain free variables which are defined outside of its surrounding scope.
    * __Syntax:__ `{ [closureParameters -> ] statements }`
    * __Example:__
        * `{item++}`
        * `{ -> item++ }`
        * `{println it}`
        * `{it -> println it}`