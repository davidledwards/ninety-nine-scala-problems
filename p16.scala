object P16 {
  def drop[A](n: Int, xs: List[A]): List[A] = {
    val (rs, _) = ((List[A](), n) /: xs) { case ((rs, tick), x) => if (tick == 1) (rs, n) else (x :: rs, tick - 1) }
    rs.reverse
  }
}