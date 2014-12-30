object P06 {
  def isPalindrome[A](xs: List[A]): Boolean = {
    def matches(n: Int, xs: List[A], ys: List[A]): Boolean = (n, xs, ys) match {
      case (0, _, _) => true
      case (n, x :: xs, y :: ys) if (x == y) => matches(n - 1, xs, ys)
      case _ => false
    }
    // Reverse the original list.
    val (n, ys) = ((0, List[A]()) /: xs) { case ((n, ys), x) => (n + 1, x :: ys) }
    // Only need to test for equality on first half of both lists.
    matches((n + 1) / 2, xs, ys)
  }
}
