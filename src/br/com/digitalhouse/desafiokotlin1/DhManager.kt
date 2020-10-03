package br.com.digitalhouse.desafiokotlin1


import java.util.*


class DhManager {

    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessores = mutableListOf<Professor>()
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()

    //FUNÇÕES PARA REGISTRAR E EXCLUIR OS CURSOS
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaxima: Int) {
        val curso = Curso(nome, codigoCurso, quantidadeMaxima)
        listaCursos.add(curso)
        println("CURSO REGISTRADO")
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaCursos) {
            if (curso.codigoCurso == codigoCurso){
                listaCursos.remove(curso)
                return
            }
        }
        println("CURSO EXCLUIDO")
    }

    //FUNÇÕES PARA REGISTRAR E EXCLUIR PROFS
    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val profAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor,quantidadeDeHoras)
            listaProfessores.add(profAdjunto)
        println("PROFESSOR ADJUNTO REGISTRADO")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val profTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor,especialidade)
        listaProfessores.add(profTitular)
        println("PROFESSOR TITULAR REGISTRADO")

    }

    fun excluirProfessor(codigoProfessor: Int) {
        for (curso in listaProfessores) {
            if (curso.codigoProfessor == codigoProfessor){
                listaCursos.remove(curso)

            }
        }
        println("PROFESSRO EXCLUIDO")
    }

    //FUNÇÕES PARA REGISTRAR E MATRICULAR OS ALUNOS
    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
        println("ALUNO REGISTRADO")
    }


    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        lateinit var curso01: Curso
        lateinit var aluno01: Aluno


        for (curso in listaCursos) {
            if (curso.codigoCurso == codigoCurso) {
                curso01 = curso
                println("Codigo $codigoCurso do curso encontrado!")
            }
        }
        for (aluno in listaAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                aluno01 = aluno
                println("Codigo: $codigoAluno do Aluno encontrado!")
            }
        }
        if (curso01.adicionarUmAluno(aluno01)) {
            val matricula1 = Matricula(aluno01, curso01, Date())
            listaMatriculas.add(matricula1)
            println("MATRICULA CONCLUIDA!")
        } else {
            println("MATRICULA NÃO CONCLUÍDA")
        }

    }

    //ALOCAR PROFESSORES
    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        for (professor in listaProfessores) {
            if (professor.codigoProfessor == codigoProfessorTitular) {
                for (curso in listaCursos) {
                    if (curso.codigoCurso == codigoCurso) {
                        professor as ProfessorTitular
                        curso.profTitular = professor
                        println("Professor titular alocado")
                    }
                }
            } else if (professor.codigoProfessor == codigoProfessorAdjunto) {
                for (curso in listaCursos) {
                    if (curso.codigoCurso == codigoCurso) {
                        professor as ProfessorAdjunto
                        curso.profAdjunto = professor
                        println("Professor adjunto alocado")
                    }
                }
            }
        }
    }
}