object P09 {
  def pack[A](xs: List[A]): List[List[A]] = xs match {
    case x :: xs =>
      val (ys, rs) = ((List(x), List[List[A]]()) /: xs) {
        case ((ys, rs), x) => if (x == ys.head) (x :: ys, rs) else (List(x), ys :: rs)
      }
      (ys :: rs).reverse
    case _ => List(xs)
  }
}
