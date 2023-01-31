package ir.rev.inOutMapper

import io.reactivex.rxjava3.functions.Function

/**
 * Конвертация объектов [T] в [R].
 * Настоятельно рекомендуется пользоваться для реализации репозиториев данных.
 * Если имеется кастомный источник данных, нужно мапперы данных из его модели в модель
 * модуля документов унаследовать от этого класса и использовать внутри репозиториев для преобразования
 * результата.
 *
 * @author aa.pervov
 */
internal abstract class InOutMapper<T, R> : (T) -> R, Function<T, R> {

    final override fun invoke(it: T): R =
        try {
            map(it)
        } catch (npe: NullPointerException) {
            throw java.lang.IllegalStateException("Не удалость конвертировать $it")
        }

    final override fun apply(t: T): R = invoke(t)

    protected abstract fun map(it: T): R
}