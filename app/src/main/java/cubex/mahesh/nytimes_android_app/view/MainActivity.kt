package cubex.mahesh.nytimes_android_app.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import cubex.mahesh.nytimes_android_app.R
import cubex.mahesh.nytimes_android_app.bean.NYResultsBean
import cubex.mahesh.nytimes_android_app.model.NYResultsModel
import cubex.mahesh.nytimes_android_app.presenter.NYResultsPresenterAPI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : NYResultsViewAPI,AppCompatActivity() {

    override fun displayNyResults(bean: NYResultsBean) {

        var lManager = LinearLayoutManager(this,
                            LinearLayoutManager.VERTICAL,false)
        rview.setLayoutManager(lManager)
        rview.adapter = ResultAdapter(bean,
                            this@MainActivity)

   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var api:NYResultsPresenterAPI =
                NYResultsModel(this@MainActivity)
        api.loadNYResults()
    }

}
