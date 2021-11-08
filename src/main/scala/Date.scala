import java.text.DateFormat
import java.util.Date


object Temperature {
  //  Q1 f = (c * 9 / 5) + 32
  def f(c : Int): Unit = println(( c * 9/5)+32)

  def date(date : String): Unit ={
    val capture = raw"(.*)/(.*)/(.*)".r
    val capture (month, day, year) = date

    println(s"${day}${days(day)} ${months(month)} ${years(year)}")
  }

  def days(day: String): String = {
      day match {
        case "1" | "21" | "31" => "st"
        case "2" | "22" => "nd"
        case "3" | "03" => "rd"
        case _ => "th"
      }
  }

  def months(month: String): String = {
    month  match{
      case "1" | "01" => "January"
      case "2" | "02" => "February"
      case "3" | "03" => "March"
      case "4" | "04"=> "April"
      case "5" | "05"=> "May"
      case "6" | "06"=> "June"
      case "7" | "07"=> "July"
      case "8" | "08"=> "August"
      case "9" | "09"=> "September"
      case "10" | "10"=> "October"
      case "11" | "11"=> "November"
      case "12" | "12"=> "December"
    }
  }

  def years(year: String): String = {
    year match{
      case i => s"20$year"
    }
  }

  def main(args: Array[String]): Unit = {
    println("Hello World")
    date("10/10/92")

  }
}
