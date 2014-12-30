object P12 {
  def decode[A](xs: List[(Int, A)]): List[A] = {
    (for ((n, x) <- xs) yield List.fill(n)(x)).flatten
  }
}
