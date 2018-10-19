package com.memebattle.newlegalclinic.core.domain

interface BaseCallback<T> {
    fun onSuccess(data: T)
    fun onError(t: Throwable)
}