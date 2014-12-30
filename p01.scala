object P01 {
  def last[A](xs: List[A]): A = xs reduceLeft { (_, x) => x }
}
