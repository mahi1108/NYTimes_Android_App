package cubex.mahesh.nytimes_android_app.bean

import com.google.gson.annotations.SerializedName

data class MediaItem(@SerializedName("copyright")
                     val copyright: String = "",
                     @SerializedName("media-metadata")
                     val mediaMetadata: List<MediaMetadataItem>?,
                     @SerializedName("subtype")
                     val subtype: String = "",
                     @SerializedName("caption")
                     val caption: String = "",
                     @SerializedName("type")
                     val type: String = "",
                     @SerializedName("approved_for_syndication")
                     val approvedForSyndication: Int = 0)