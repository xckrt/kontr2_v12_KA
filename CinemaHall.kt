import kotlin.random.Random
import kotlinx.coroutines.delay
class CinemaHall(override val movieTitle: String,
                 override val sessionTime: String,
                 override var ticketPrice: Double,
                 override val hallNumber: Int,
                 override var audienceCount: Int):AbstractCinema()
{
    override fun showMovieDetails()
    {
        println("Фильм: $movieTitle")
        println("Сеанс: $sessionTime")
        println("Цена билета: $ticketPrice")
        println("Номер зала: $hallNumber")
        println("Количество зрителей: $audienceCount")
    }
    override fun calculateRevenue(): Double
    {
        return ticketPrice * audienceCount
    }
    override fun Trailer()
    {
        println("Запуск трейлера...")
        val videoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&pp=ygUYbmV2ZXIgZ29ubmEgZ2l2ZSB5b3UgdXAg"
        val command = "cmd /c start $videoUrl"
        Thread.sleep(3000)
        Runtime.getRuntime().exec(command)
        println("Трейлер начал воспроизведение!")
    }
    suspend fun monitoring(n: Int)
    {
        repeat(n)
        {
            println("День ${it + 1}")
            println("_____________________")
            when (Random.nextInt(1, 5))
            {
                1 ->
                {
                    delay(750)
                    println("Мужчина видеофиксирует фильм, необходимо вызвать полицию")
                }
                2 ->
                {
                    delay(750)
                    println("Ребенок завел истерику,требуется администратор для решения проблемы")
                }
                3 ->
                {
                    delay(750)
                    println("Пока все спокойно")
                }
                4 ->
                {
                    delay(750)
                    println("В кинозале драка,необходимо вызвать охрану")
                }
            }
        }
    }
}