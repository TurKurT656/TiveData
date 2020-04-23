package io.omido.tivedata.di

import io.omido.tivedata.ui.home.HomeViewModel
import io.omido.tivedata.ui.main.MainViewModel
import io.omido.tivedata.ui.marbles.MarblesViewModel
import io.omido.tivedata.ui.marbles.creating.MarblesCreatingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
    viewModel { MarblesViewModel() }
    viewModel { MarblesCreatingViewModel() }

}