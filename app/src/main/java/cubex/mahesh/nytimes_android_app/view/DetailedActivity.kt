package cubex.mahesh.nytimes_android_app.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cubex.mahesh.nytimes_android_app.R
import kotlinx.android.synthetic.main.activity_detailed.*

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var i = intent
        tv1.text = i.getStringExtra("title")+ "\n" +
                i.getStringExtra("by")+ "\n"
        i.getStringExtra("date")+ "\n"


    }
}
