package br.com.digitalhouse.desafiokotlin1

class Curso(val nome: String, val codigoCurso: Int, val quantidadeMaxima: Int) {


    var listaDeAlunosMatriculados = mutableListOf<Aluno>()

    lateinit var profTitular: Any
    lateinit var profAdjunto: Any

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if(listaDeAlunosMatriculados.size <= quantidadeMaxima){
            listaDeAlunosMatriculados.add(umAluno)
            println("Aluno cadastrado")
            return true
        }else{
            println("Não há mais vagas nesse curso")
        }
        return false
    }

    fun excluirUmAluno(umAluno: Aluno){
        listaDeAlunosMatriculados.remove(umAluno)
    }

}