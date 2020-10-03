package br.com.digitalhouse.desafiokotlin1

class ProfessorTitular(override val nome: String = "",
                       override val sobrenome: String = "",
                       override val tempoDeCasa: Int = 0,
                       override val codigoProfessor: Int = 0,
                       val especialidade: String = "")

    : Professor(){

}
