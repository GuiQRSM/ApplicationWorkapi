package API

import Model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProduvtApi(): Call<List<Product>>
}