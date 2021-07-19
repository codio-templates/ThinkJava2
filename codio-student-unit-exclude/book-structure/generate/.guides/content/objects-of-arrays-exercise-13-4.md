You can learn more about the sorting algorithms presented in this chapter at [https://www.toptal.com/developers/sorting-algorithms](https://www.toptal.com/developers/sorting-algorithms). This site provides explanations of the algorithms, along with animations that show how they work. It also includes an analysis of their efficiency.

For example, “insertion sort” is an algorithm that inserts elements into place, one at a time. Read about it on the website and play the animations. Then write a method named `insertionSort` that implements this algorithm.

One goal of this exercise is to practice top-down design. Your solution should use a helper method, named `insert`, that implements the inner loop of the algorithm. `insertionSort` should invoke this method $n-1$ times.

 {Run!}(sh .guides/bg.sh javac code/ch13/InsertionSort.java java -cp code/ch13/ InsertionSort )
