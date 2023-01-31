package ir.rev.inOutMapper.simple

internal class SimpleLogic {

    private val mapper = SimpleMapper()

    private fun simpleTest(){
        val inputCat = SimpleInputCat(
            name = "Кузя",
            age = 3,
            bestFood = null
        )

        val outputCat = mapper(inputCat)

    }

}