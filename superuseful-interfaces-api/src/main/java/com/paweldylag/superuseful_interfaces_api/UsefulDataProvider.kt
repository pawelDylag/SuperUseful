package com.paweldylag.superuseful_interfaces_api

import io.reactivex.Observable

/**
 * Created by Pawel Dylag
 */
interface UsefulDataProvider {

    fun provideUsefulData() : Observable<UsefulData>

}