The code for this chapter is in the *ch16* directory of *ThinkJavaCode2*. See page in section Using the Code Examples for instructions on how to download the repository. Before you start the exercises, we recommend that you compile and run the examples.

**Exercise 16.1:**
The last section of this chapter introduced `Automaton` as an abstract class and rewrote `Conway` as a subclass of `Automaton`. Now it's your turn: rewrite `Langton` as a subclass of `Automaton`, removing the code that's no longer needed.


**Exercise 16.2:**
Mathematically speaking, Game of Life and Langton's Ant are *cellular automata*. “Cellular” means it has cells, and “automaton” means it runs itself. See [https://en.wikipedia.org/wiki/Cellular_automaton](https://en.wikipedia.org/wiki/Cellular_automaton) for more discussion.

Implement another cellular automaton of your choice. You may have to modify `Cell` and/or `GridCanvas`, in addition to extending `Automaton`. For example, Brian's Brain ([https://en.wikipedia.org/wiki/Brian's_Brain](https://en.wikipedia.org/wiki/Brian's_Brain)) requires three states: “on”, “dying”, and “off”.