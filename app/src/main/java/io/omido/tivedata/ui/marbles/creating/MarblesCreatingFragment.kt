package io.omido.tivedata.ui.marbles.creating

import io.omido.tivedata.R
import io.omido.tivedata.base.BaseFragment
import io.omido.tivedata.databinding.FragmentMarblesCreatingBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MarblesCreatingFragment :
    BaseFragment<MarblesCreatingViewModel, FragmentMarblesCreatingBinding>() {

    override val viewModel: MarblesCreatingViewModel by viewModel()
    override val layoutRes: Int = R.layout.fragment_marbles_creating

    override fun initBinding() {
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            executePendingBindings()
        }
    }
}
