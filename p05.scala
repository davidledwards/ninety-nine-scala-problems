object P05 {
  def reverse[A](xs: List[A]): List[A] = (List[A]() /: xs) { (rs, x) => x :: rs }
}
