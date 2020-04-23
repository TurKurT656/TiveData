package io.omido.tivedata.ui.home

import io.omido.tivedata.R
import io.omido.tivedata.base.BaseFragment
import io.omido.tivedata.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {

    override val viewModel: HomeViewModel by viewModel()
    override val layoutRes: Int = R.layout.fragment_home

    override fun initBinding() {
        binding?.apply {
            lifecycleOwner = this@HomeFragment
            vm = viewModel
            executePendingBindings()
        }
    }
}