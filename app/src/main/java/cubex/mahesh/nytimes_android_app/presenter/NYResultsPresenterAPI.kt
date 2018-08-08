package cubex.mahesh.nytimes_android_app.presenter

import cubex.mahesh.nytimes_android_app.bean.NYResultsBean
import retrofit2.Call
import retrofit2.http.GET

interface NYResultsPresenterAPI {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/30.json?api-key=efc3dcfe04034f0ba50466ab70e59fef")
    fun loadNYResults( ):Call<NYResultsBean>


}