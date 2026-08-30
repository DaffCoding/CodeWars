# This repository contains solutions to Codewars exercises that I have completed. If you are currently working through Codewars yourself, some files may contain spoilers.

**Difficulty:** 8 kyu  
**Language:** JavaScript  
**Concepts:** Conditionals, modulo operator

## My Approach

I needed to determine whether a number was divisible by two.

The modulo operator returns the remainder after division, so:

`number % 2`

returns `0` when the number is even.

## Solution

See [`solution.js`](./solution.js).

## What I Learned

This reinforced how the modulo operator can be used for divisibility
checks rather than only arithmetic.

## Refactor / Alternative

My original approach used an `if` statement.

I later rewrote it using a ternary because the result only required
choosing between two values.

Both approaches are valid; the ternary is shorter, while the explicit
conditional may be easier to read when the logic becomes more complex.