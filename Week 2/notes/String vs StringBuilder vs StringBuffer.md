# String vs StringBuilder vs StringBuffer
- Use String when the value is not expected to change frequently and thread safety is desired.
- Use StringBuilder for mutable string manipulation in single-threaded scenarios for better performance.
- Use StringBuffer for mutable string manipulation in multi-threaded scenarios where thread safety is required, even though it might be slower due to synchronization.