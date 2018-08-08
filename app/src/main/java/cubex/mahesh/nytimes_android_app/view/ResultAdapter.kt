package cubex.mahesh.nytimes_android_app.view

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cubex.mahesh.nytimes_android_app.R
import cubex.mahesh.nytimes_android_app.bean.NYResultsBean

class ResultAdapter(var bean:NYResultsBean,
                    var mActivity:MainActivity):RecyclerView.Adapter<ResultHolder>( )
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ResultHolder {
            var inflater = LayoutInflater.from(mActivity)

            var v:View = inflater.inflate(R.layout.indiview,
                            p0,false)
        return  ResultHolder(v)
    }

    override fun getItemCount(): Int {

        return  bean.results!!.size
    }

    override fun onBindViewHolder(p0: ResultHolder, p1: Int) {

        p0.title!!.text = bean.results!![p1].title
        p0.by!!.text = bean.results!![p1].byline
        p0.date!!.text = bean.results!![p1].publishedDate

        p0.itemView.setOnClickListener {

            var i = Intent(mActivity,DetailedActivity::class.java )
            i.putExtra("title",bean.results!![p1].title)
            i.putExtra("by",bean.results!![p1].byline)
            i.putExtra("date",bean.results!![p1].publishedDate)
            mActivity.startActivity(i)

        }
    }
}
