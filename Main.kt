import kotlinx.coroutines.*
suspend fun main() = runBlocking<Unit> {
        val cinemaHall = CinemaHall("Матрица", "19:00", 10.5, 2, 50)
        cinemaHall.showMovieDetails()
        val revenue = cinemaHall.calculateRevenue()
        println("Выручка: $revenue")
        cinemaHall.Trailer()
        println("Введите кол-во дней, сколько будет фильм в продаже")
        val ans = readLine()!!.toInt()
        launch{
            cinemaHall.monitoring(ans)
        }
    }
