object P08 {
  def compress[A](xs: List[A]): List[A] = xs match {
    case x :: xs =>
      val (_, rs) = ((x, List(x)) /: xs) { case ((prev, rs), x) => (x, if (x == prev) rs else x :: rs) }
      rs.reverse
    case _ => xs
  }
}
