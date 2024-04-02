abstract class AbstractCinema:Cinema {
        abstract val movieTitle: String
        abstract val sessionTime: String
        abstract var ticketPrice: Double
        abstract val hallNumber: Int
        abstract var audienceCount: Int
        override fun calculateRevenue(): Double
        {
                return ticketPrice * audienceCount
        }
        override fun showMovieDetails()
        {
                println("Фильм: $movieTitle")
                println("Сеанс: $sessionTime")
                println("Цена билета: $ticketPrice")
                println("Номер зала: $hallNumber")
                println("Количество зрителей: $audienceCount")
        }
        abstract fun Trailer()

}