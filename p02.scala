object P02 {
  def penultimate[A](xs: List[A]): A = {
    val (r, _) = xs match {
      case x1 :: x2 :: xs => ((x1, x2) /: xs) { case ((prev, next), x) => (next, x) }
      case _ => throw new NoSuchElementException
    }
    r
  }
}
