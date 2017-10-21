package com.paweldylag.superuseful_interfaces_api

import io.reactivex.Single

/**
 * Created by Pawel Dylag
 */
interface UsefulDataRepository {

    fun getUsefulData() : Single<UsefulData>

}