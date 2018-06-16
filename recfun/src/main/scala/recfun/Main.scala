package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c >= r) {
      1
    } else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def balance2(s: List[Char], open: Int): Boolean = {
      if (s.length == 0 ) return open == 0
      else {
        if (s.head == '(') balance2(s.tail, open + 1)
        else if (s.head == ')') open>0 && balance2(s.tail, open - 1)
        else balance2(s.tail, open )
      }
    }

    balance2(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
