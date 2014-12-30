object P13 {
  def encodeDirect[A](xs: List[A]): List[(Int, A)] = xs match {
    case x :: xs =>
      val (ys, rs) = ((List(x), List[List[A]]()) /: xs) {
        case ((ys, rs), x) => if (x == ys.head) (x :: ys, rs) else (List(x), ys :: rs)
      }
      (ys :: rs).reverse map { r => (r.length, r.head) }
    case _ => List()
  }
}
