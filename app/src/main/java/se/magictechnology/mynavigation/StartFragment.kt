package se.magictechnology.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onStart() {
        super.onStart()

        goOtherBtn.setOnClickListener {

            val theNavAction = StartFragmentDirections.actionStartFragmentToOtherFragment(firstname = "Bill")



            this.findNavController().navigate(theNavAction)
        }
    }
}