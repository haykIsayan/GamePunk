package com.example.domain.entities.utility

interface Result<Data> {
    val data: Data?
    val throwable: Throwable?
}