Working with cards is more fun if you can display them on the screen. If you have not already read Appendix 20 about 2D graphics, you should read it before working on this exercise. In the code directory for this chapter, *ch12*, you will find the following:



* *cardset-oxymoron* <br/> A directory containing images of playing cards.
* *CardTable.java* <br/> A sample program that demonstrates how to read and display images.




*CardTable.java* demonstrates the use of a 2D array; specifically, an array of card images. The declaration looks like this:

```code
private Image[][] images;
```

The variable `images` refers to a 2D array of `Image` objects, which are defined in the `java.awt` package. Here's the code that creates the array itself:

```code
images = new Image[14][4];
```

The array has 14 rows (one for each rank, plus an unused row for rank 0) and 4 columns (one for each suit). Here's the loop that populates the array:

```code
String cardset = "cardset-oxymoron";
String suits = "cdhs";

for (int suit = 0; suit <= 3; suit++) {
    char c = suits.charAt(suit);

    for (int rank = 1; rank <= 13; rank++) {
        String s = String.format("%s/%02d%c.gif",
                                 cardset, rank, c);
        images[rank][suit] = new ImageIcon(s).getImage();
    }
}
```

The variable `cardset` is the name of the directory that contains the image files. `suits` is a string that contains the single-letter abbreviations for the suits. These strings are used to assemble `s`, which contains the filename for each image. For example, when `rank=1` and `suit=2`, the value of `s` is `"cardset-oxymoron/01h.gif"`, which is an image of the Ace of Hearts.

The last line of the loop reads the image file, extracts an `Image` object, and assigns it to a location in the array, as specified by the indexes `rank` and `suit`. For example, the image of the Ace of Hearts is stored in row 1, column 2.

If you compile and run *CardTable.java*, you should see images of a deck of cards laid out on a green table. You can use this class as a starting place to implement your own card games.



As a starting place, try placing cards on the table in the starting configuration for the solitaire game Klondike ([https://en.wikipedia.org/wiki/Klondike_(solitaire)](https://en.wikipedia.org/wiki/Klondike_(solitaire))).

You can get the image for the back of the card by reading the file *back192.gif*.
Once you have written your function and added test cases, run your code here.
{Run!}(sh .guides/bg.sh javac code/ch12/*.java java -cp code/ch12/ CardTable )