# Runtime Comparison
To compare, LibreOffice Calc was used. A range of 1 - 15 with 15 being the max nth value was used and plugged into each function. The list from lowest runtime to highest runtime after 15 was plugged is as shown.

### Lowest to Highest
1. 2 / N
2. N * log(N)
3. log(N)
4. sqrt(N)
5. N
6. N * log(N)
7. N * log^2(n)
8. N * log(N^2)
9. 37
10. N^1.5
11. N^2
12. N^2 * log(N)
13. N^3
14. 2^N

It is important to note, however, that while this test was done on a limited nth, if n -> infinity, the constant value of 37 would change from 9th on the list to 2nd, as every other function besides 2 / N would approach infinity on the y-axis while 2 / N approaches 0 and 37 remains constant.

Some functions contain a similar growth rate. For example:
* N * log(N) and N * log^2(N)
* N^2 and N^2 * log(N)
* log(N) and N * log(log(N))

Attached in the same folder as this file is the spreadsheet containing the data on all runtimes. There is a .csv for Excel on Windows and a .ods for LibreOffice on Linux.
