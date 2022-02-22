package com.ubaya.adv160419162week2hw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            var showScore = ResultFragmentArgs.fromBundle(requireArguments()).answer
            txtScore.text = "Your Score is $showScore"
        }
        btnBack.setOnClickListener {

            val action = ResultFragmentDirections.actionResultFragmentToMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}