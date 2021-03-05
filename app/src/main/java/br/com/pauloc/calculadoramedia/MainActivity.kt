package br.com.pauloc.calculadoramedia

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = btnCalc
        val resultado = txtResult

        btnCalcular.setOnClickListener(View.OnClickListener {
            val nota1 = Integer.parseInt(edtNota1.text.toString())
            val nota2 = Integer.parseInt(edtNota2.text.toString())
            val media:Int = (nota1 + nota2)/2
            val faltas = Integer.parseInt(edtFaltas.text.toString())

            if(media >= 6 && faltas <=10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.GREEN)
            }else{
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final:" + media + "\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }
        })
        
    }
}