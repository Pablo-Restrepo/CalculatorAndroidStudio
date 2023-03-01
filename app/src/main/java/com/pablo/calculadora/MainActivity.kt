package com.pablo.calculadora

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.constraintlayout.widget.ConstraintLayout
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var buttonequ: Button
    lateinit var button0: Button
    lateinit var buttonpun: Button
    lateinit var buttonrest: Button
    lateinit var buttonx: Button
    lateinit var buttondiv: Button
    lateinit var buttonporc: Button
    lateinit var buttondelec: Button
    lateinit var buttondelecall: Button
    lateinit var buttonsum: Button
    lateinit var buttoninfo: Button
    lateinit var problem: TextView
    lateinit var result: TextView

    @RequiresApi(Build.VERSION_CODES.Q)
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button2)
        button3 = findViewById<Button>(R.id.button3)
        button4 = findViewById<Button>(R.id.button4)
        button5 = findViewById<Button>(R.id.button5)
        button6 = findViewById<Button>(R.id.button6)
        button7 = findViewById<Button>(R.id.button7)
        button8 = findViewById<Button>(R.id.button8)
        button9 = findViewById<Button>(R.id.button9)
        buttonx = findViewById<Button>(R.id.buttonx)
        buttonporc = findViewById<Button>(R.id.buttonporc)
        buttonrest = findViewById<Button>(R.id.buttonrest)
        buttondiv = findViewById<Button>(R.id.buttondiv)
        buttondelec = findViewById<Button>(R.id.buttondelec)
        buttondelecall = findViewById<Button>(R.id.buttondelecall)
        buttonsum = findViewById<Button>(R.id.buttonsum)
        buttonequ = findViewById<Button>(R.id.buttonequ)
        button0 = findViewById<Button>(R.id.button0)
        buttonpun = findViewById<Button>(R.id.buttonpun)
        buttoninfo = findViewById<Button>(R.id.buttoninfo)
        problem = findViewById<TextView>(R.id.problem)
        result = findViewById<TextView>(R.id.result)

        buttoninfo.setOnClickListener {
            val intent = Intent(this, info::class.java)
            startActivity(intent)
        }

        button1.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button1.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "1")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button1.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        buttonequ.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonequ.setBackgroundResource(R.drawable.equapress)
                    if (problem.text.isNotEmpty()){
                        val resultado = (calcularResultado(problem.text.toString()))
                        result.setText(resultado.toString())
                    }

                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonequ.setBackgroundResource(R.drawable.equa)
                    true
                }
                else -> false
            }
        }

        button0.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button0.setBackgroundResource(R.drawable.pressetrec)
                    problem.setText(problem.text.toString() + "0")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button0.setBackgroundResource(R.drawable.normalrec)
                    true
                }
                else -> false
            }
        }

        buttonpun.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonpun.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + ".")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonpun.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button2.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button2.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "2")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button2.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button3.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button3.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "3")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button3.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button4.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button4.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "4")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button4.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button5.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button5.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "5")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button5.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button6.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button6.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "6")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button6.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button7.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button7.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "7")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button7.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button8.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button8.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "8")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button8.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        button9.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    button9.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "9")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    button9.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        buttonrest.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonrest.setBackgroundResource(R.drawable.respress)
                    problem.setText(problem.text.toString() + "-")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonrest.setBackgroundResource(R.drawable.res)
                    true
                }
                else -> false
            }
        }

        buttonx.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonx.setBackgroundResource(R.drawable.xpress)
                    problem.setText(problem.text.toString() + "*")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonx.setBackgroundResource(R.drawable.x)
                    true
                }
                else -> false
            }
        }

        buttondiv.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttondiv.setBackgroundResource(R.drawable.porcepress)
                    problem.setText(problem.text.toString() + "/")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttondiv.setBackgroundResource(R.drawable.porce)
                    true
                }
                else -> false
            }
        }

        buttondelec.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttondelec.setBackgroundResource(R.drawable.borrarpress)
                    val cadena = problem.text
                    val nuevaCadena = cadena.dropLast(1)
                    problem.setText(nuevaCadena)
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttondelec.setBackgroundResource(R.drawable.borrar)
                    true
                }
                else -> false
            }
        }

        buttondelecall.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttondelecall.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText("")
                    result.setText("")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttondelecall.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

        buttonsum.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonsum.setBackgroundResource(R.drawable.sumpress)
                    problem.setText(problem.text.toString() + "+")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonsum.setBackgroundResource(R.drawable.sum)
                    true
                }
                else -> false
            }
        }

        buttonporc.setOnTouchListener { view, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // Cambiar la imagen del botón al presionarlo
                    buttonporc.setBackgroundResource(R.drawable.pressetcir)
                    problem.setText(problem.text.toString() + "%")
                    true
                }

                MotionEvent.ACTION_UP -> {
                    // Cambiar la imagen del botón al soltarlo
                    buttonporc.setBackgroundResource(R.drawable.ellipse_1__1_)
                    true
                }
                else -> false
            }
        }

    }

    private fun calcularResultado(operacion: String): Any {
        try {
            val expresion = ExpressionBuilder(operacion).build()
            val resultado = expresion.evaluate()
            return if (resultado % 1.0 == 0.0) resultado.toLong() else resultado
        } catch (e: Exception) {
            return "ERROR"
        }
    }

}