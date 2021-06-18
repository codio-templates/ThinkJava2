You are probably aware that computers can store only 1s and 0s. That's because processors and memory are made up of billions of tiny on-off switches.

The value 1 means a switch is on; the value 0 means a switch is off. All types of data, whether integer, floating-point, text, audio, video, or something else, are represented by 1s and 0s.


Fortunately, we can represent any integer as a **binary** number. Table 8.6 shows the first eight numbers in binary and decimal.


<center>
|Binary|Decimal|
|-|-|
|0|0|
|1|1|
|10|2|
|11|3|
|100|4|
|101|5|
|110|6|
|111|7|

</center>
**Table: The first eight binary numbers.**





In decimal there are 10 digits, and the written representation of numbers is based on powers of 10. For example, the number 456 has 4 in the 100's place, 5 in the 10's place, and 6 in the 1's place. So the value is 400 + 50 + 6:

<center>
|4|5|6|
|-|-|-|
|$10^2$|$10^1$|$10^0$|

</center>

In binary there are two digits, and the written representation of numbers is based on powers of two. For example, the number 10111 has 1 in the 16's place, 0 in the 8's place, 1 in the 4's place, 1 in the 2's place, and 1 in the 1's place. So the value is 16 + 0 + 4 + 2 + 1, which is 23 in decimal.

<center>
|1|0|1|1|1|
|-|-|-|-|-|
|$2^4$|$2^3$|$2^2$|$2^1$|$2^0$|

</center>

To get the digits of a decimal number, we can use repeated division. For example, if we divide 456 by 10, we get 45 with remainder 6. The remainder is the rightmost digit of 456.

If we divide the result again, we get 4 with remainder 5. The remainder is the second rightmost digit of 456. And if we divide again, we get 0 with remainder 4. The remainder is the third rightmost digit of 456, and the result, 0, tells us that we're done.

We can do the same thing in binary if we divide by 2. When you divide by 2, the remainder is the right-most digit, either 0 or 1. If you divide the result again, you get the second rightmost digit. If you keep going, and write down the remainders, you'll have your number in binary:

```code
23 / 2 is 11 remainder 1
11 / 2 is  5 remainder 1
 5 / 2 is  2 remainder 1
 2 / 2 is  1 remainder 0
 1 / 2 is  0 remainder 1
```

Reading these remainders from bottom to top, 23 in binary is 10111.