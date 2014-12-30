object P14 {
  def duplicate[A](xs: List[A]): List[A] = {
    (xs map { x => List(x, x) }).flatten
  }
}
