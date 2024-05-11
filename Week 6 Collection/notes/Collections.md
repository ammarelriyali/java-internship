# Collections
![Iterable iamge](https://static.javatpoint.com/images/java-collection-hierarchy.png)
### Aarry list vs linkedlist
|subject|array|linked|
|---|---|---|
|random access| o(1)|not support|
|search|o(n)|o(n)|
|add|o(n)|o(1)|
|add in specific index|o(n)|o(n)|
|remove|o(n)|o(n)|
##### common
they don't support synchronization `not thread safa`
add item in order 
### Vector 
It is similar to ArrayList but it is `thread safe` 

### HashSet vs LinkedHashSet
##### common
uses hash functionality in them
use don't allow deuplicted value
##### difference
`linked hash set ` sort item in order and it use linked list in it for that it take space more than the hashset

### TreeSet
store value sorted
![Map iamge](https://static.javatpoint.com/images/core/java-map-hierarchy.png)
map like set 
map depaned on set in implementation 
