package com.paweldylag.superuseful_core_module

import com.paweldylag.superuseful_interfaces_api.UsefulData
import com.paweldylag.superuseful_interfaces_api.UsefulDataTransformer

/**
 * Created by Pawel Dylag
 */
class UsefulDataTopSecretTransformer: UsefulDataTransformer {

    override fun transform(usefulData: UsefulData) =
            TransformedUsefulData(usefulData.getName().toUpperCase(), usefulData.getId())
}