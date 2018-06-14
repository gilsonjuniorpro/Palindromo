package br.palindromo.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btVerify.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val palindromo = Palindromo(edText.text.toString())

        var response: String

        response = if(palindromo.isPalindromo())
                "${palindromo.conteudo} is a palindrome word!"
            else
                "${palindromo.conteudo} is not a palindrome word!"

        tvResult.text = response
    }
}
