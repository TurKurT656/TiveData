package io.omido.tivedata.ui.marbles

import io.omido.tivedata.R
import io.omido.tivedata.base.BaseFragment
import io.omido.tivedata.databinding.FragmentMarblesBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MarblesFragment : BaseFragment<MarblesViewModel, FragmentMarblesBinding>() {

    override val viewModel: MarblesViewModel by viewModel()
    override val layoutRes: Int = R.layout.fragment_marbles

    override fun initBinding() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            executePendingBindings()
        }
    }
}