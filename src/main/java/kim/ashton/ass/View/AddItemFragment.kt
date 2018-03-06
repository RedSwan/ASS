package kim.ashton.ass.View

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kim.ashton.ass.R
import kotlinx.android.synthetic.main.fragment_add_item.*

/**
 * kim.ashton.ass.View
 * Created by AshtonKim on 2018-03-05.
 */
class AddItemFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        muteToggleButton.setOnClickListener {

        }
        vibratorToggleButton.setOnClickListener {

        }
    }
}