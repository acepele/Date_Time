import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*


fun main(args: Array<String>) {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    val formattedToday = today.format(formatter)
    val date1 = LocalDate.parse("2022-11-08")
    val date2 = LocalDate.parse( "2022-12-07")
    val date3 = LocalDate.parse( "2023-01-06")

    println("Today's date is:  $formattedToday")
    println("The next full moon date will be on :  $date1")


    var daysbetweenfullmoons = today.until(date2, ChronoUnit.DAYS)
    println("There are $daysbetweenfullmoons days between two full moons!")

    println("Wear silver or stay inside at night until:  $date3")





}



