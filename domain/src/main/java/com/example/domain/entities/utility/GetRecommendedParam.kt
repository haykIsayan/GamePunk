package com.example.domain.entities.utility

import kotlinx.coroutines.CoroutineScope

interface GetRecommendedParam {
    val userId: Long
    val scope: CoroutineScope
}