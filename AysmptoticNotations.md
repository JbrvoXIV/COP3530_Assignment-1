# Asymptotic Notation
1) 

```java
sum = 0;
for(i = 0; i < n; i++) {
    sum++;
}

ANSWER: O(1 + (n + 1)) = O(n)
```

2)

```java
sum = 0;
for(i = 0; i < n; i++) {
    for(j = 0; j < n; j++) {
        sum++;
    }
}

ANSWER: O(1 + (n * n)) = O(n^2)
```

3)

```java
sum = 0;
for(i = 0; i < n; i++) {
    for(j = 0; j < n * n; j++) {
        sum++;
    }
}

ANSWER: O(1 + (n * n^2)) = O(n^3)
```

4)

```java
sum = 0;
for(i = 0; i < n; i++) {
    for(j = 0; j < i; j++) {
        sum++;
    }
}

ANSWER: O(1 + (n * n-1)) = O(n^2)
```

5)

```java
sum = 0;
for(i = 0; i < n; i++) {
    for(j = 0; j < i; j++) {
        for(k = 0; k < j; k++) {
            sum++;
        }
    }
}

ANSWER: O(1 + (n * n-1 * n-2)) = O(n^2)
```
6)

```java
sum = 0;
for(i = 1; i < n; i++) {
    for(j = 1; j < i * i; j++) {
        if(j % i == 0) {
            for(k = 0; k < j; k++) {
                sum++;
            }
        }
    }
}

ANSWER: O(1 + (n-1 * n^2 * 1 * n / 2)) = O(n^4)
```





