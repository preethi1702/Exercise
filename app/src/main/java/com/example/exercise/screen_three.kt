package com.example.exercise

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.exercise.screen_three
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_screen_three.*


class screen_three:Fragment(),View.OnClickListener {
    lateinit var navController: NavController
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_three,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.mybtn4).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
      val snackbar = Snackbar.make(screen_three,"Welcome To Exercise",Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    }
