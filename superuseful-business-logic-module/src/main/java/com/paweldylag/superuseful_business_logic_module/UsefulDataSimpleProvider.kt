package com.paweldylag.superuseful_business_logic_module

import com.paweldylag.superuseful_interfaces_api.UsefulData
import com.paweldylag.superuseful_interfaces_api.UsefulDataProvider
import io.reactivex.Observable

/**
 * Created by Pawel Dylag
 */
class UsefulDataSimpleProvider(private val provideTransformedDataUseCase: ProvideTransformedDataUseCase): UsefulDataProvider {

    // You can imagine having many different use cases here. 
    // This allows to decouple logic and to have pure code here
    override fun provideUsefulData(): Observable<UsefulData> = provideTransformedDataUseCase.run()

}