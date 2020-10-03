package br.com.digitalhouse.desafiokotlin1

fun main() {

    val manager = DhManager()

    //REGISTROS  DOS  ALUNOS

    println("<--------------REGISTRO DE ALUNOS------------------>")


    manager.registrarAluno("Lucas","Tadeu",1)
    manager.registrarAluno("Rodolfo","RUiz",2)
    manager.registrarAluno("Sara","Félix",3)
    manager.registrarAluno("Tilia","Nogueira",4)
    manager.registrarAluno("Thalita","Neri",5)


    //REGISTRO DE PROFS


    println("<-----------REGISTRO DE PROFESSORES------------>")
    manager.registrarProfessorAdjunto("Lucas","Cavalieri",7,9)
    manager.registrarProfessorAdjunto("Vitória","Gonçalves",28,11)

    manager.registrarProfessorTitular("Jessica","Correa",21,"Android")
    manager.registrarProfessorTitular("João ","Felipe",26,"Java")


    //REGISTRANDO  CURSOS

    println("<------------------REGISTRO DE CURSOS------------------->")

    manager.registrarCurso("Android",2002,2)
    manager.registrarCurso("Full Stack",2001,3)


    //ALOCAR PROFS

    println("<------------ALOCANDO PROFESSOR TITULAR E ADJUNTO--------------->")

    manager.alocarProfessores(2001,33,11)
    manager.alocarProfessores(2002,44,22)




    //2 ALUNOS NO  FULL STACK E 3 NO ANDROID


    println("<-------------MATRICULAS-------------->")

    manager.matricularAluno(1,2001)
    manager.matricularAluno(2,2001)
    manager.matricularAluno(3,2002)
    manager.matricularAluno(4,2002)
    manager.matricularAluno(5,2002)




}