package com.example.exercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class screen_two : Fragment(),View.OnClickListener {
      lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.prev).setOnClickListener(this)
        view.findViewById<Button>(R.id.next).setOnClickListener(this)
    }
      override fun onClick(button:View?) {
          when (button!!.id) {
              R.id.prev -> navController.navigate(R.id.action_screen_two_to_screen_one4)
              R.id.next ->navController.navigate(R.id.action_screen_two_to_screen_three)
          }
      }


}
