package com.example.pastelemlondres

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.pastelemlondres.databinding.FragmentOtherAmountBinding
import com.example.pastelemlondres.model.OrderViewModel


class OtherAmountFragment : Fragment() {

    private var binding: FragmentOtherAmountBinding? = null

    private val sharedViewModel: OrderViewModel by activityViewModels()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentOtherAmountBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.otherAmountFragment = this
    }

    fun goToNextScreen() {
        findNavController().navigate(R.id.action_otherAmountFragment_to_pickupFragment)
    }

    /**
     * Cancel the order and start over.
     */
    fun cancelOrder() {
        // Reset order in view model
        sharedViewModel.resetOrder()

        // Navigate back to the [StartFragment] to start over
        findNavController().navigate(R.id.action_otherAmountFragment_to_startFragment)
    }

    fun addNumberOfFrango(){
        var num = binding?.btnFrango?.number
    }


}