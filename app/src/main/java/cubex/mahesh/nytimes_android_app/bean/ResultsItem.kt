package cubex.mahesh.nytimes_android_app.bean

import com.google.gson.annotations.SerializedName

data class ResultsItem(
                       @SerializedName("column")
                       val column: String = "",
                       @SerializedName("section")
                       val section: String = "",
                       @SerializedName("abstract")
                       val abstract: String = "",
                       @SerializedName("source")
                       val source: String = "",
                       @SerializedName("asset_id")
                       val assetId: Long = 0,
                       @SerializedName("media")
                       val media: List<MediaItem>?,
                       @SerializedName("type")
                       val type: String = "",
                       @SerializedName("title")
                       val title: String = "",
                       @SerializedName("url")
                       val url: String = "",
                       @SerializedName("adx_keywords")
                       val adxKeywords: String = "",
                       @SerializedName("id")
                       val id: Long = 0,
                       @SerializedName("byline")
                       val byline: String = "",
                       @SerializedName("published_date")
                       val publishedDate: String = "",
                       @SerializedName("views")
                       val views: Int = 0)