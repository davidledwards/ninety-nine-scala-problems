object P18 {
  def slice[A](i: Int, k: Int, xs: List[A]): List[A] = {
    val (rs, _) = ((List[A](), 0) /: xs) {
      case ((rs, n), x) => (if (n >= i && n < k) x :: rs else rs, n + 1)
    }
    rs.reverse
  }
}
