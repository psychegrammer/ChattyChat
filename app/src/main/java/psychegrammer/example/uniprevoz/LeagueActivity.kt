package psychegrammer.example.uniprevoz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"
    }
    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"
    }
    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View) {

        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}
