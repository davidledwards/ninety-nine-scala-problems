object P03 {
  def kth[A](k: Int, xs: List[A]): A = (k, xs) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => kth(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
