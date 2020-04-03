package com.yuriluisgarciapereira.jogodados

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imagemDado : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagemDado = findViewById(R.id.imageViewDados)
    }

    fun jogarDadoEventoClick(view : View){
        val novoValor = Random.nextInt(1,7)
        var dado: Int = R.drawable.dice_6;
        when (novoValor) {
            1 -> {
                dado = R.drawable.dice_1
            }
        }
        when (novoValor) {
            2 -> {
                dado = R.drawable.dice_2
            }
        }
        when (novoValor) {
            3 -> {
                dado = R.drawable.dice_3
            }
        }
        when (novoValor) {
            4 -> {
                dado = R.drawable.dice_4
            }
        }
        when (novoValor) {
            5 -> {
                dado = R.drawable.dice_5
            }
        }

        when (novoValor) {
            6 -> {
                dado = R.drawable.dice_6
            }
        }

        imagemDado.setImageResource(dado)
    }
}
