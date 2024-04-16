# Week 1 : JAVA

```text
Java is Simple, Robust, Portable, Platform-independent, Secured, High Performance, Multithreaded, Architecture Neutral, Object-Oriented, Interpreted, and Dynamic  
```

### History of Java
- Create by `Green Team`.
- Java was originally designed for interactive television, but it was too advanced technology for the digital cable television industry at the time.
- James Gosling, who is known as the father of Java
- Company is Sun Microsystems

### Features of Java
| Features      | Description |
| ----------- | ----------- |
| Simple   | easy to learn   |
| Robust   | It uses strong memory management.There is a lack of pointers that avoids security problems. Java provides automatic garbage collection. There are exception handling and the type checking mechanism in Java.|
| Portable   | run on any platform  |
| Secured   | Secured  |
| High Performance  | bytecode is "close" to native code  |
| Multithreaded | handle threads  |
| Architecture Neutral | it is the same  on all Architecture like 4 bytes of memory for both 32 and 64-bit architectures.|
| Interpreted | Java source code is compiled into bytecode, an intermediate form. |
| Object-Oriented | support Object-Oriented   |
| Dynamic | handle threads  |

### Difference between JDK, JRE, and JVM
| Difference      | JDK | JRE | JVM |
| -      | - | - | - |
| notion  | `Java Development Kit` | `Java Runtime Environment` | `Java Virtual Machine` |
| definition |  a software development environment which is used to develop Java applications and applets. It contains JRE + development tools. |  a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It contains a set of libraries + other files that JVM uses at runtime. |  is an abstract machine. It is a specification that provides a runtime environment in which Java bytecode can be executed. It can also run those programs which are written in other languages and compiled to Java bytecode.|
| Is physically exist    | yes | yes | no |

- The `JDK` contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.

![Alt text](https://static.javatpoint.com/images/jdk2.png "JDK")

### How Java Code run

- It's splitered to two phase `run time ` and `compile time `
-  At `Compile time`, the Java file is compiled by Java Compiler (It does not interact with OS) and converts the Java code into bytecode.
- At `Run time` :
    - after Compilation process The JVM loads the compiled bytecode of a Java program into memory when the program is executed. The classloader is responsible for loading classes into the JVM.
    - The JVM performs bytecode verification to ensure that the bytecode is safe to execute and adheres to the rules of the Java language. This includes checking for type safety, stack overflow, and other potential security vulnerabilities.
    - Once the bytecode has been loaded and verified, the JVM's execution engine begins executing the program. This involves interpreting the bytecode instructions or, in some cases, dynamically compiling bytecode into native machine code through Just-In-Time (JIT) compilation for improved performance.

![Alt text](https://static.javatpoint.com/images/java-runtime-processing.png "runtime")

#### JVM 
- `JVM` is A specification where working of Java Virtual Machine is specified (how the JVM should work). But implementation provider is independent to choose the algorithm. Its implementation has been provided by Oracle and other companies.
- An implementation Its implementation is known as JRE (Java Runtime Environment).
- Runtime Instance Whenever you write java command on the command prompt to run the java class, an `instance of JVM is created`.

### JVM What it does
- Loads code
- Verifies code
- Executes code
- Provides runtime environment

### JVM provides definitions for the:
- Memory area
- Class file format
- Register set
- Garbage-collected heap
- Fatal error reporting etc.
- 
### JVM Architecture
![Alt text](https://static.javatpoint.com/images/jvm-architecture.png "jvm architecture")
- Classloader: a subsystem of JVM which is used to load class files. There are three built-in classloaders in Java.
    - `Bootstrap Classloader`: 
        - This is the first classloader which is the super class of Extension classloader.
        - It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes, java.util package classes, java.io package classes, java.sql package classes etc.
    - `Extension Classloader`: 
        -  This is the child classloader of Bootstrap and parent classloader of System classloader.
        -  It loades the jar files located inside $JAVA_HOME/jre/lib/ext directory.
    - `System/Application Classloader`: 
        - This is the child classloader of Extension classloader. It loads the classfiles from classpath.
        - By default, classpath is set to current directory.
        - It is also known as Application classloader.
- Class(Method) Area:  stores per-class structures such as the runtime constant pool, field and `method data`, the code for methods.
-  Heap : It is the runtime data area in which objects are allocated.
-  Stack
    -  It deal with methods
    -  Java Stack stores frames. 
    -  It holds local variables and partial results, and plays a part in method invocation and return.
    -  Each thread has a private JVM stack, created at the same time as thread.
    -  A new frame is created each time a method is invoked.
    -  A frame is destroyed when its method invocation completes.

- Program Counter Register: PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.

- Native Method Stack: It contains all the native methods used in the application.

- Execution Engine : It contains
    - A virtual processor
    - Interpreter: Read bytecode stream then execute the instructions.
    - Just-In-Time(JIT) compiler: It is used to improve the performance. JIT compiles parts of the byte code that have similar functionality at the same time, and hence reduces the amount of time needed for compilation.
    
- Java Native Interface: Java Native Interface (JNI) is a framework which provides an interface to communicate with another application written in another language like C, C++, Assembly etc. Java uses JNI framework to send output to the Console or interact with OS libraries.



