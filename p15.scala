object P15 {
  def duplicateN[A](n: Int, xs: List[A]): List[A] = {
    (xs map { x => List.fill(n)(x) }).flatten
  }
}