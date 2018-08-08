package cubex.mahesh.nytimes_android_app.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.indiview.view.*

class ResultHolder : RecyclerView.ViewHolder {

    var cview:CircleImageView? = null
    var title:TextView? = null
    var by:TextView? = null
    var date:TextView? = null

    constructor(v:View) : super(v) {
        cview = v.cview
        title = v.title
        by = v.by
        date = v.date
    }

}