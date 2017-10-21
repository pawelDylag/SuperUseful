package com.paweldylag.superuseful_starter

import com.paweldylag.superuseful_business_logic_module.ProvideTransformedDataUseCase
import com.paweldylag.superuseful_business_logic_module.UsefulDataSimpleProvider
import com.paweldylag.superuseful_cloud_module.UsefulDataCloudRepository
import com.paweldylag.superuseful_core_module.UsefulDataTopSecretTransformer
import com.paweldylag.superuseful_interfaces_api.UsefulDataProvider

/**
 * Created by Pawel Dylag
 */
class UsefulDataProviderFactory {

    // Here we create concrete implementations from across the modules,
    // and feed them to the UsefulDataSimpleProvider.
    // BOOM! No dependencies, only interfaces, how neat!
    // Plus I used the "suppress" annotation,
    // because this method is our API method that will be used by our users.
    // We don't want the compiler to throw warnings.
    @Suppress("unused")
    fun create(): UsefulDataProvider {
        val repository = UsefulDataCloudRepository()
        val transformer = UsefulDataTopSecretTransformer()
        val provideTransformedDataUseCase = ProvideTransformedDataUseCase(repository, transformer)
        return UsefulDataSimpleProvider(provideTransformedDataUseCase)
    }

}