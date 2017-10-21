package com.paweldylag.superuseful_cloud_module

import com.paweldylag.superuseful_interfaces_api.UsefulData

/**
 * Created by Pawel Dylag
 */
internal class CloudUsefulData(private val name: String,
                               private val id: String) : UsefulData {

    override fun getName() = name

    override fun getId() = id
}