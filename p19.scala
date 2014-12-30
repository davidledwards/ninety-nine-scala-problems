object P19 {
  def rotate[A](n: Int, xs: List[A]): List[A] = {
    // Note that resulting lists are reversed when split, primarily because reverting to their original
    // order depends on the direction of the shift operation as evidenced below.
    def split(n: Int, xs: List[A]) = {
      val (left, right, _) = ((List[A](), List[A](), 0) /: xs) {
        case ((ls, rs, count), x) => if (count < n) (x :: ls, rs, count + 1) else (ls, x :: rs, count + 1)
      }
      (left, right)
    }
    if (n >= 0) {
      val (l, r) = split(n, xs)
      r.reverse ::: l.reverse
    } else {
      val (l, r) = split(-n, xs.reverse)
      l ::: r
    }
  }
}
