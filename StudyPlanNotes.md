# Algorithms

## Big O notation
Big O notation is used to classify algorithms according to how their running time or space requirements grow as the input size grows.
Big O notation is writter as: **O(T(n))**

1. **T(n)** is a time complexity function that describes how the running time grows as the input size grows.
2. The symbol **O** means that, when the input is large enough, the running time grows at most proportionally to the function inside parentheses.

Big O could be thought of the wors-case scenario. It describes especially well the situation for large inputs of an algorithm.


Common growth rates:
In the HTTP protocol, all messages consist of text strings:

1. 200~Start line which may vary:
    * for requests, it indicates the type of request (method) and the URL where to send it (target);
    * for responses, it contains a status code to determine the success of the operation.

2. Headers which describe the message and convey various parameters.
3. Body in which the message data is located.

Let's look at the most commonly used query methods:

* `GET` method is only used to retrieve data from the server;
* `POST` method is used to send data to the server;
* `HEAD` requests data from the server in the same way as the GET method, but without a response body.

**REST (Representational State Transfer)** is a fairly common way of interaction between client applications and services on the Internet.

A service written with regard to REST rules is called RESTful. REST works on top of HTTP and is one of the possible ways to use HTTP.

Abiding by the following six important principles guarantees that you write a RESTful service:

* Client-server interaction model. By separating the user interface from the data warehouse, we improve and simplify application operation.

* Stateless. Each request from a client to a server must contain all necessary information and cannot rely on any state stored on the server side. According to REST, the service does not store the results of the previous operation. Simply put, it works according to the "Asked, answered, forgotten" concept.

* Cacheable. A request-response pair can be marked as cached and stored on the user side. It is possible to draw an analogy to web page caching: if a page was downloaded once, it can be accessed without addressing the server again.

* Uniform interface. REST architecture specifies that any REST service must be understandable without its developer.

* Layered system. A client cannot just tell whether it is connected directly to the end server or an intermediary along the way.

* Code on demand [Optional]. On request, the service must give executable code in the form of an applet or script to be executed on the client's side. In practice, it is very seldom used.

## JSON
JSON (or JavaScript Object Notation) is a text-based format for storing and transmitting structured data.

JSON text can be built on one of two structures:

* a collection of key:value pairs (associative array);
* an orderly set of values (array or list).

```bash
{
    "first_name": "Sophie",
    "last_name": "Goodwin",
    "age": 34
}
```

## Spring
Spring is one of the most popular application development frameworks for the Java Platform.
First of all, we use it to develop web applications, but we can also apply it to the desktop and even to the command-line applications.

Services Sptring provides:

* component container for managing the life cycle of objects inside the application;
* data access framework for working with different types of databases;
* web framework for building web applications with a web server;
* security framework for supporting user authentication and authorization processes;
* testing framework for writing tests for all parts of the application.

A new framework developed by the same developers **Spring Boot* solves many configuration problems
and makes Spring one of the most successful and convenient web development platforms among all.

The Spring Boot is a part of Spring platform that allows the developers to create stand-alone production-grade Spring-based applications that you can "just run"


Spring Boot also provides a few additional cool features, here are some of them:
* command-line interface;
* monitoring the status of your running applications (health/metrics);
* embedded application server for running your application.

**Compilers transform source code into a format that the computer understands. This code is called a native code or a low-level code.

A compiler for java is `javac` tool translates source code into the intermediate representation known as _Java bytecode_, which is stored in files `.class` extensions.
The bytecode can't be used with real computers but a special abstract computer called _Java Virtual Machine (or JVM)_ can execute it.

Each operating system has its own version of JVM. The program written and compiled on one platform can be run on another if suitable JVM is installed.
This makes program written in JVM languages **platform independent**. To run compiled program, you will use `java` tool.

![](https://ucarecdn.com/6d0cfa9e-67ab-4d27-a145-3f2a53603d52/)


Some things to remember:
* **Java Virtual Machine (JVM)** is a virtual simulation of a physical computer. It executes Hava bytecode class files.
* **Java Runtime Environment (JRE)** is is an execution environment for running compiled JVM programs. JRE includes JVM and JCL (Java Class Library).
* **Jaava Development Kit (JDK)** is a package to develop programs for Java platform. It includes JRE and tools for developers.

![](https://ucarecdn.com/33aad287-2450-4386-8639-42c7a7eac874/)


-------
To mark an element (class/method/field/etc) with an annotation we need to write the symbol @ followed by the annotation name. For example:
```bash
@Deprecated
```

The symbol `@` signals to the compiler that this is an annotation.

The `@NotNull` annotation indicates that:
* A method should not return `null`
* A variable cannot be `null`


The `@Range` annotation indicates that:
* A method returns an integer number that belonds to the specified range
* A variable always belongs to the specified range.

## Build Tool

A build tool is a program that automates the process of creating executable applications from source code.
The build process includes compiling sources and linking and packaging the code into a usable or executable from.

Modern build tools can:
1. Downloading and adding dependencies.
2. Compiling source code into bytecode.
3. Packaging compiled code.
4. Running test.
5. Deploying to a production environment.


There are three main build tools for Java-based projects: **Apache Ant, Apache Maven, Gradle**.
Ant is the oldest and Maven is the most commonly used build tool. Gradle is mainly used for Android development.


## Java Archive (JAR)
Java Archive is a platform-independent file format to pack multiple files together and distribute them as a single unit.
It comes in handy if your application contains lots of files.

A JRE can start an pplication packed into a JAR, but to create a JAR you need to use a JDK.

A JAR is simply an aggregation of bytecode files (`.class`), config files (`.json`, `.xml`), images and even sound clips into a single compressed file.
All files except resources are called bytecode files. `MANIFEST.MF` is also should be located in JAR. This should describe the JAR file itself.
```
example.jar
├── META-INF
│   └── MANIFEST.MF
├── second
│   ├── Main.class
│   └── MyIcon.png
└── third
    └── another
        └── OneMore.class
```

The manifest file has a set of headers. The name and the value are separated by a colon (:).


# Gradle

Key concepts in Gradle are projects and tasks:

* A Project might represent ether something to be build (JAR file or ZIP archive) or a thing to do (deploying the application).
* A task is a single piece of work that a build performs. This can include compiling classes, running tests, generating docs, etc.
![](https://ucarecdn.com/6e2f851a-1840-4cbd-b6a3-08ae0020e60e/)

-----------
A **controller** is a part of the application that handles these API methods.
`@RestController` annotation is usually on top of the class. It declares that a class will provide the exact endpoints (URLs you request for) to the REST methods.
Two most popular methods POST and GET correspond to annotations `@PostMapping` and `@GetMapping`.

With this REST method, we can send some information to the request body.
We need to tell the controller what type of information this will be and how we can access it in a handling method.
```bash
@PostMapping
public String addLine(@RequestBody String line)
```

`@PostMapping` should have a `@RequestBody` variable.


`@RestController` is a wrapper, so it consists of two annotations combining their functions:
* `@Controller`: the class will contain the handler methods;
* `ResponseBody`: the response object of each of the handler's methods will be represented in a JSON format.

The second basic function of any server is providing users with saved information, usually as a responmse to their GET requests.
Some notable points about GET:
1. We cannot pass a body with `GET` request.
2. You can return any type from the method, and Spring will try to represent it in a JSON format (or inform you if it can't)
3. When we want to get a description of the task, there myst be a way to specify what task exactly we are interested in.
The most common way to do that is adding `@PathVariable` to a request path.

```bash
@GetMapping("/lines/{id}")
public String getLine(@PathVariable String id)
```

![](https://ucarecdn.com/892143c2-01ae-4518-a7d1-105087ccfd17/)

