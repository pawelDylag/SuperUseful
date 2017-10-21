package com.paweldylag.superuseful_business_logic_module

import com.paweldylag.superuseful_interfaces_api.UsefulData
import com.paweldylag.superuseful_interfaces_api.UsefulDataRepository
import com.paweldylag.superuseful_interfaces_api.UsefulDataTransformer
import io.reactivex.Observable

/**
 * This is a pure logic class. It takes all necessary objects and invokes business logic interaction.
 * Created by Pawel Dylag
 */
class ProvideTransformedDataUseCase(private val repository: UsefulDataRepository,
                                    private val transformer: UsefulDataTransformer) {

    fun run(): Observable<UsefulData> =
            repository.getUsefulData().toObservable()
            .transformWithTransformer()

    private fun Observable<UsefulData>.transformWithTransformer() =
            map { transformer.transform(it) }

}