package com.example.domain.boundaries

import com.example.domain.entities.utility.Result

interface UseCase<Argument, ResultType> {
    suspend fun execute(argument: Argument): Result<ResultType>
}