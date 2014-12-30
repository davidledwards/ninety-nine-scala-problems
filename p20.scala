object P20 {
  def removeAt[A](k: Int, xs: List[A]): (List[A], A) = {
    val (rs, r, _) = ((List[A](), Option.empty[A], 0) /: xs) {
      case ((rs, r, n), x) => if (n == k) (rs, Some(x), n + 1) else (x :: rs, r, n + 1)
    }
    (rs.reverse, r getOrElse { throw new NoSuchElementException })
  }
}
