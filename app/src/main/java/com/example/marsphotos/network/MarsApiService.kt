package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"


//agrega compilador de Retrofit para compilar y crear un objeto Retrofit
//Retrofit requiere el URI base para el servicio web y una fábrica de conversión para crear una API de servicios web.
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())//añadimos el conversor
    .baseUrl(BASE_URL)//se le pasa la url base de la API
    .build()//crea el objeto Retrofit

interface MarsApiService {
}