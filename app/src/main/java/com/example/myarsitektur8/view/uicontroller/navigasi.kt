package com.example.myarsitektur8.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myarsitektur8.viewmodel.SiswaViewModel

enum class PengelolaHalaman {
    Formulir,
    Detail
}

@Composable
fun SiswaApp(
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val uiState by viewModel.statusUI.collectAsState()
    val context = LocalContext.current


}
