package psychegrammer.example.uniprevoz.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Toast.makeText
import kotlinx.android.synthetic.main.activity_league.*
import psychegrammer.example.uniprevoz.Model.Player
import psychegrammer.example.uniprevoz.R
import psychegrammer.example.uniprevoz.Utillities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }
    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }
    fun onCoedClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "coed"
    }

    fun leagueNextClicked(view: View) {

        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}
