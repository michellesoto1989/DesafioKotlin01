package br.com.digitalhouse.desafiokotlin1

//Classe aluno

class Aluno(val nome: String, val sobrenome: String, val codigoAluno: Int){



    override fun equals(other: Any?): Boolean {
        if (other == codigoAluno){
            return true
        }
        return false


    }
}
