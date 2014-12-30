object P04 {
  def length[A](xs: List[A]): Int = (0 /: xs) { (n, _) => n + 1 }
}
