# BinarySearchTree
########
A Binary Search Tree is a collection. Determine the correct location in your language’s collection
class hierarchy. Find all methods that you need to implement in-order to add your
class in the language’s collection class hierarchy.

Make the parent class of your tree class the parent determined in problem 3. Rename your
existing methods to conform to the collection classes standards. You may need to stub
some methods to satisfy the parent class's constraints. Note we will only be interested in
implementing a few of these methods. You do not have to implement all the methods in the
parent class. We will need at least the add method, toArray and the toString method. As in
assignment 1 don't use arrays or other collection classes to implement your tree.

Use the strategy pattern to allow you determine how the tree will be ordered when a tree
object is created.

Implement an iterator for your Tree class. Don't covert your tree to an array or other collection
to implement your iterator. You can implement either an internal or external Iterator.

Use the null object pattern to represent head and leaf nodes in the tree. Can you remove
any null checks?

Implement two separate and independent decorators for Java’s Iterator. The first decorator
only return Strings that start with a vowel. The constructor for the decorator needs one argument
of type Iterator<String>. The second decorator also only works on Strings. The
second iterator capitalizes all the strings it returns in its next() method.

Write unit tests for the code you write for this assignmen
