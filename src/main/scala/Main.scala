object Main extends App {
  def FizzBuzz(numbers: List[Int]) : List[String] = {
    var result = List[String]() /* empty list of string */

    for (i <- numbers) {
      if (i % 3 == 0 && i % 5 == 0) {
        result = result.appended("FizzBuzz")
      } else if (i % 3 == 0) {
        result = result.appended("Fizz")
      } else if (i % 5 == 0) {
        result = result.appended("Buzz")
      } else {
        result = result.appended(i.toString)
      }
    }

    result
  }

  for (i <- FizzBuzz(List.range(-1, 10))) {
    println(i)
  }
}