object P07 {
  def flatten(xs: List[Any]): List[Any] = {
    def flatten(xs: List[Any], ys: List[Any]): List[Any] = {
      (ys /: xs) {
        case (ys, x: List[_]) => flatten(x, ys)
        case (ys, x) => x :: ys
      }
    }
    flatten(xs, List()).reverse
  }
}
