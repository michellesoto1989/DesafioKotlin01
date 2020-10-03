package br.com.digitalhouse.desafiokotlin1

abstract class Professor(open val nome: String= "",open val sobrenome: String = "",open val tempoDeCasa: Int= 0,open val codigoProfessor: Int = 0){


    override fun equals(other: Any?): Boolean {
        if (other == codigoProfessor){
            return true
        }
        return false
    }
}