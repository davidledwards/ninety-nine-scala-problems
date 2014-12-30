# Overview
Solutions to the [99 Scala Problems](http://aperiodic.net/phil/scala/s-99/). Please refer to the aforementioned link for an
explanation of each problem.

# Notes
Many of these problems can be solved more succinctly using methods that accompany the collections library, but the challenge
is to restrict the use of those methods and rely only on functional primitives, such as `map`, `filter`, `fold`, `reduce`,
and so on.

It turns out that the _fold_ operation, particularly `foldLeft` (or `/:`) is a Swiss Army knife of functional programming,
and consequently, is used extensively to solve many of these problems.
