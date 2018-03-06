package kim.ashton.ass

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/*
* UI
* https://github.com/navasmdc/MaterialDesignLibrary
* https://github.com/hoang8f/android-flat-button
* https://github.com/Yalantis/FlipViewPager.Draco
* https://github.com/Yalantis/Side-Menu.Android
* https://github.com/Yalantis/GuillotineMenu-Android
* https://github.com/Nightonke/BoomMenu
* https://github.com/pedant/sweet-alert-dialog
* */

//  TODO: GIT 에 적용해보자!!!
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNewItemButton.setOnClickListener {

        }
        showListButton.setOnClickListener {

        }
    }
}
