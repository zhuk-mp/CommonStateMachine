package com.motorro.statemachine.commonregistration.model.data

/**
 * Login flow UI state
 */
sealed class RegisterUiState {

    /**
     * Loading data...
     */
    object Loading : RegisterUiState()

    /**
     * Password entry for login flow
     * @property email Login email
     * @property password Password field value
     * @property repeatPassword Repeat password field value
     * @property actionEnabled Action (next) button state
     */
    data class PasswordEntry(
        val email: String,
        val password: String,
        val repeatPassword: String,
        val actionEnabled: Boolean
    ) : RegisterUiState()
}