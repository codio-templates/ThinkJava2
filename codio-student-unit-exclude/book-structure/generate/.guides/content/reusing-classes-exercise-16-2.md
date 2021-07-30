
**Exercise 16.2:**
Mathematically speaking, Game of Life and Langton's Ant are *cellular automata*. “Cellular” means it has cells, and “automaton” means it runs itself. See [https://en.wikipedia.org/wiki/Cellular_automaton](https://en.wikipedia.org/wiki/Cellular_automaton) for more discussion.

Implement another cellular automaton of your choice. You may have to modify `Cell` and/or `GridCanvas`, in addition to extending `Automaton`. For example, Brian's Brain ([https://en.wikipedia.org/wiki/Brian's_Brain](https://en.wikipedia.org/wiki/Brian's_Brain)) requires three states: “on”, “dying”, and “off”.

{Compile Add'l Classes}(javac code/ch16/Automaton.java code/ch16/Cell.java code/ch16/GridCanvas.java)

{Try it!}(bash .guides/swing.sh cd code/ch16 javac YourAutomaton.java java YourAutomaton )

[View display](open_preview https://{{domain3000}} panel=1)