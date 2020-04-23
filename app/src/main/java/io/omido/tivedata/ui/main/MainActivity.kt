package io.omido.tivedata.ui.main

import io.omido.tivedata.base.BaseActivity
import io.omido.tivedata.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import io.omido.tivedata.R

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val viewModel: MainViewModel by viewModel()
    override val layoutRes: Int = R.layout.activity_main
    override val navigationId: Int = R.id.nav_host

    override fun initBinding() {
        binding.apply {
            lifecycleOwner = this@MainActivity
            vm = viewModel
            executePendingBindings()
        }
    }
}