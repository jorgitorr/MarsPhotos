package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"


//agrega compilador de Retrofit para compilar y crear un objeto Retrofit
//Retrofit requiere el URI base para el servicio web y una fábrica de conversión para crear una API de servicios web.
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())//añadimos el conversor
    .baseUrl(BASE_URL)//se le pasa la url base de la API
    .build()//crea el objeto Retrofit


interface MarsApiService {
        //agrega a la URL base \photos
        @GET("photos")
        suspend fun getPhotos(): String
}


//objeto MarsApi para inicializar el servicio de Retrofit
//cada vez que se llame a MarsApi.retrofitService se llamará al mismo singleton que implementa
//MarsApiService
object MarsApi {
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}