package ir.rev.inOutMapper.simple

import ir.rev.inOutMapper.InOutMapper

internal class SimpleMapper : InOutMapper<SimpleInputCat, SimpleOutputCat>() {

    override fun map(it: SimpleInputCat) = SimpleOutputCat(
        name = it.name,
        age = it.age,
        bestFood = it.bestFood,
    )
}