package cubex.mahesh.nytimes_android_app.model

import android.util.Log
import android.widget.Toast
import cubex.mahesh.nytimes_android_app.view.MainActivity
import cubex.mahesh.nytimes_android_app.bean.NYResultsBean
import cubex.mahesh.nytimes_android_app.presenter.NYResultsPresenterAPI
import cubex.mahesh.nytimes_android_app.view.NYResultsViewAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NYResultsModel(var result: NYResultsViewAPI):NYResultsPresenterAPI {
    override fun loadNYResults(): Call<NYResultsBean> {

        var r = Retrofit.Builder().
                addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.nytimes.com/").
                        build()
        var api = r.create(NYResultsPresenterAPI::class.java)
        var call = api.loadNYResults()

        call.enqueue(object : Callback<NYResultsBean> {
            override fun onFailure(call: Call<NYResultsBean>?, t: Throwable?) {

                Toast.makeText(result as MainActivity,
                        "Error raised...",
                        Toast.LENGTH_LONG).show()

                Log.i("msg","------------------------")
                        t!!.printStackTrace()
                Log.i("msg","------------------------")

            }

            override fun onResponse(call: Call<NYResultsBean>?, response: Response<NYResultsBean>?) {
                var bean = response!!.body()

                result.displayNyResults(bean!!)
            }
        })

        return call
    }

}