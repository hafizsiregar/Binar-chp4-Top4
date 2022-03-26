package com.example.feedig_binar_chp4_top4.ui.reels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
//import com.example.feedig_binar_chp4_top4.databinding.FragmentNotificationsBinding
import com.example.feedig_binar_chp4_top4.databinding.FragmentReelsBinding

class ReelsFragment : Fragment() {

    private lateinit var notificationsViewModel: ReelsViewModel
    private var _binding: FragmentReelsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(ReelsViewModel::class.java)

        _binding = FragmentReelsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textReels
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}