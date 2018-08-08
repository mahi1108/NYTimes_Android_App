package cubex.mahesh.nytimes_android_app.bean

import com.google.gson.annotations.SerializedName

/*data class NYResultsBean(@SerializedName("num_results")
                         val numResults: Int = 0)*/
data class NYResultsBean(@SerializedName("copyright")
                         val copyright: String = "",
                         @SerializedName("results")
                         val results: List<ResultsItem>?,
                         @SerializedName("num_results")
                         val numResults: Int = 0,
                         @SerializedName("status")
                         val status: String = "")
