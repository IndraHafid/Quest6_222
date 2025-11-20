package com.example.myarsitektur8.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myarsitektur8.model.DataJK
import com.example.myarsitektur8.view.FormSiswa
import com.example.myarsitektur8.viewmodel.SiswaViewModel

enum class PengelolaHalaman {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val uiState by viewModel.statusUI.collectAsState()
    val context = LocalContext.current

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Formulir.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PengelolaHalaman.Formulir.name) {
                FormSiswa(
                    pilihanJK = DataJK.jenisJK.map { id ->
                        context.resources.getString(id)
                    },
                    onSubmitButtonClicked = { dataSiswa ->
                        viewModel.setSiswa(dataSiswa)
                        navController.navigate(PengelolaHalaman.Detail.name)
                    }
                )
            }


        }
    }
}
