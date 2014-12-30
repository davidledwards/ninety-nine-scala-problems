import P09._

object P11 {
  def encodeModified[A](xs: List[A]): List[Any] = {
    pack(xs) map { x => if (x.length == 1) x.head else (x.length, x.head) }
  }
}
