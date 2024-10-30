package com.example.pertemuan5.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun LatihanUserInput(modifier: Modifier = Modifier) {

    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var notelp by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    var dataNama by remember { mutableStateOf("") }
    var dataEmail by remember { mutableStateOf("") }
    var dataNotelp by remember { mutableStateOf("") }
    var dataAlamat by remember { mutableStateOf("") }

    val  jenisK by remember { mutableStateOf("") }
    var dataJenisK by remember { mutableStateOf("") }
    val dataK = listOf("L", "P")

    Column (modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp)
        Spacer(modifier = Modifier.padding(20.dp))
        TextField(
            value = nama,
            onValueChange = {nama = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "nama")
            },
            placeholder = {
                Text(text = "Masukan Nama Anda")
            }
        )
        Row {
            dataJenisK.forEach{ selectedJK ->
                Row {
                    RadioButton(selected = jenisK = selectedJK,
                        onClick = {
                            jenisK = selectedJK
                        })
                }
            }
        }
        TextField(
            value = email,
            onValueChange = { email= it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "email")
            },
            placeholder = {
                Text(text = "Masukan Email Anda")
            }
        )
        TextField(
            value = notelp,
            onValueChange = {notelp = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "notelp")
            },
            placeholder = {
                Text(text = "Masukan notelp Anda")
            },

        )

        TextField(
            value = alamat,
            onValueChange = {alamat = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text( text = "alamat")
            },
            placeholder = {
                Text(text = "Masukan Alamat Anda")
            }
        )
        Button(onClick = {
            dataNama = nama
            dataJenisK = jenisK
            dataEmail = email
            dataNotelp = notelp
            dataAlamat = alamat
                         }, modifier = Modifier.padding(vertical = 10.dp)) {
            Text(text = "Simpan")
        }
        Card(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Column {
                TampilData(
                    judul = "Nama",
                    isinya = "ibal"

                )
            }
            TampilData(
                judul = "Email",
                isinya = "@ibal.com"

            )
        }



    }


}
@Composable
fun TampilData(
    judul:String,
    isinya:String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya,
            modifier = Modifier.weight(2f))

    }
}
