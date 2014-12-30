object P17 {
  def split[A](n: Int, xs: List[A]): (List[A], List[A]) = {
    val (first, second, _) = ((List[A](), List[A](), n) /: xs) {
      case ((fs, ss, count), x) =>
        if (count > 0) (x :: fs, ss, count - 1) else (fs, x :: ss, count - 1)
    }
    (first.reverse, second.reverse)
  }
}
