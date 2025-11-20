package com.example.myarsitektur8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myarsitektur8.R
import com.example.myarsitektur8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair(stringResource(id = R.string.nama), statusUISiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUISiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUISiswa.alamat)
    )

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail Siswa", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                ),
                navigationIcon = {
                    IconButton(onClick = onBackButtonClicked) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(id = R.dimen.padding_medium)
                )
            ) {
                items.forEach { item ->
                    Column(modifier = Modifier.padding(vertical = 8.dp)) {
                        Text(text = item.first.uppercase(), fontSize = 16.sp)
                        Text(text = item.second, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                        Divider(thickness = 1.dp, modifier = Modifier.padding(top = 8.dp))
                    }
                }
            }


        }
    }
}
