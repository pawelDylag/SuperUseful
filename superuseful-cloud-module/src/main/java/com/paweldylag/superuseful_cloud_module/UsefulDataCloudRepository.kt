package com.paweldylag.superuseful_cloud_module

import com.paweldylag.superuseful_interfaces_api.UsefulData
import com.paweldylag.superuseful_interfaces_api.UsefulDataRepository
import io.reactivex.Single

/**
 * Created by Pawel Dylag
 */
class UsefulDataCloudRepository: UsefulDataRepository {

    // Mocked network call. But you can put more complex logic here.
    override fun getUsefulData(): Single<UsefulData> = Single.just(CloudUsefulData("super useful data", "123abc"))

}