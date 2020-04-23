package io.omido.tivedata.ui.home

import io.omido.tivedata.base.BaseViewModel

class HomeViewModel : BaseViewModel() {

    fun onMarblesClicked() {
        navigateTo(HomeFragmentDirections.actionHomeToMarbles())
    }

}