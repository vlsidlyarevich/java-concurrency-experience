# Java concurrency experience
Some playing with java multithreading


### 1. Creating and joining threads

**1.a.** Write a short program that prints "Hello world" from a thread.

**1.b.** Now modify the program to print "Hello world" five times, once from each
     of five different threads.

**1.c.** Now modify the printed string to include the thread number; ensure that
     all threads have a unique thread number.

### 2. Simple synchronisation

**2.a.** Write a short program in which two threads both increment a shared
     integer repeatedly, without proper synchronisation, 1,000,000 times,
     printing the result at the end of the program.

**2.b.** Now modify the program to use synchronized to ensure that increments
     on the shared variable are atomic.

### 3. Guarded blocks

**3.a.** Write a short program in which one thread increments an integer
     1,000,000 times, and a second thread prints the integer -- without
     waiting for it to finish.

**3.b.** Now modify the program to use a condition variable to signal completion
     of the addition task by the first thread before the second thread prints
     the value.

### 4. More complex constructions

**4.a.** We have seen several examples of producer-consumer implemented using a
     number of different synchronisation primitives in pseudo-code.
     Implement a ProducerConsumer class using synchronized, wait(), and
     notify() in Java.

**4.b.** Semaphores are a widely used synchronisation primitive -- but not one of
     the fundamental primitives provided by Java.  Implement a counting
     semaphore using synchronized(), wait(), and notify() in Java.

**4.c.** Deadlocks are an inherent problem in concurrent systems using locks or
     other blocking primitives.  Implement a deadlock involving two threads
     and two locks in Java.  What debugging tools does the Java environment
     offer that might help us debug this deadlock?

### 5. Other questions

5.a. Data races occur when there is insufficient synchronisation around
     composite operations.  Write a short program that illustrates a data race
     
### TBD
