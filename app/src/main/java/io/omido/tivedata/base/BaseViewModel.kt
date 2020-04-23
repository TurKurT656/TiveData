package io.omido.tivedata.base

import android.net.Uri
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.google.android.material.snackbar.Snackbar
import com.hadilq.liveevent.LiveEvent
import io.omido.tivedata.util.NavigationCommand
import io.omido.tivedata.util.ActionCommand

abstract class BaseViewModel : ViewModel() {

    /** Used in situations when we need to navigate to another fragment/activity
     */
    private val _navigationCommand = LiveEvent<NavigationCommand>()
    val navigationCommand: LiveData<NavigationCommand> = _navigationCommand

    /**
     *      getting directions from the navigation's built actions
     */
    fun navigateTo(directions: NavDirections) {
        _navigationCommand.postValue(NavigationCommand.To(directions))
    }

    /**
     * using [NavController][androidx.navigation.NavController]'s navigateUp()
     */
    fun navigateBack() {
        _navigationCommand.postValue(NavigationCommand.Back)
    }

    /**
     * using [NavController][androidx.navigation.NavController]'s popBackStack()
     */
    fun navigateBackTo(destinationId: Int, inclusive: Boolean) {
        _navigationCommand.postValue(NavigationCommand.BackTo(destinationId, inclusive))
    }

    private val _actionCommand = LiveEvent<ActionCommand>()
    val actionCommand: LiveData<ActionCommand> = _actionCommand

    fun openIntent(action: String? = null, type: String? = null, uri: Uri? = null) {
        _actionCommand.postValue(ActionCommand.OpenUrl(action, type, uri))
    }

    fun showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
        _actionCommand.postValue(ActionCommand.ShowToast(message, duration))
    }

    fun showToast(@StringRes message: Int, duration: Int = Toast.LENGTH_SHORT) {
        _actionCommand.postValue(ActionCommand.ShowToastRes(message, duration))
    }

    fun showSnackBar(message: String, duration: Int = Snackbar.LENGTH_SHORT) {
        _actionCommand.postValue(ActionCommand.ShowSnackBar(message, duration))
    }

    fun showSnackBar(@StringRes message: Int, duration: Int = Snackbar.LENGTH_SHORT) {
        _actionCommand.postValue(ActionCommand.ShowSnackBarRes(message, duration))
    }

}