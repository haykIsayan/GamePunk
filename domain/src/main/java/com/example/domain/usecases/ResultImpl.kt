package com.example.domain.usecases

import com.example.domain.entities.utility.Result

class ResultImpl<Data>(
    override val data: Data?,
    override val throwable: Throwable?
) : Result<Data>