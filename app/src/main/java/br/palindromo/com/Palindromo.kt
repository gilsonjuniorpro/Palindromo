package br.palindromo.com

class Palindromo constructor(conteudo : String){

    val conteudo: String = conteudo
        get(){
            return field.toLowerCase()
        }

    fun isPalindromo() : Boolean{
        return conteudo == conteudo.reversed()
    }
}