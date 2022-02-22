package com.ubaya.adv160419162week2hw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        txtCurrentScore.text = "Current Score: 0"
        super.onViewCreated(view, savedInstanceState)
        var first = (1 until 100).random()
        var score = 0
        var second = (1 until 100).random()
        var result = first + second
        txtSoal.text = "$first + $second"
        btnAnswer.setOnClickListener {
            var input = Integer.parseInt(editAnswer.text.toString())

            if(result == input){
                score++
                txtCurrentScore.text = "Current Score: $score"
                first = (1 until 100).random()
                second = (1 until 100).random()
                result = first + second
                txtSoal.text = "$first + $second"
                editAnswer.setText("")

            }
            else
            {
                val action = MainFragmentDirections.actionMainFragmentToResultFragment(score)
                Navigation.findNavController(it).navigate(action)
            }


        }
    }





}