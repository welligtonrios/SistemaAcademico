# SistemaAcademico
Trabalho Prático  acdêmico 
Sistema acadêmico
Criar um mini sistema acadêmico para de gerência de uma faculdade. No sistema deve conter:

Aluno->
● Cadastro, Listagem, Edição e Exclusão de aluno.
● Um aluno deve possuir:
○ nome
○ cpf
○ matrícula
■ Código do curso + 4 últimos dígitos do cpf + o ano corrente.
○ endereço
○ e-mail
○ telefone
○ Situação
■ Todo aluno deve se encontrar em uma situação que pode ser: Matriculado ou
Pendente.

○ Curso
○ Disciplinas
■ Lista de disciplinas cuja o mesmo está matriculado.
■ Todo aluno deve possuir pelo menos 1 disciplina para estar na situação
Matriculado.
■ Um aluno so pode estar matriculado em no máximo 6 disciplinas.
■ Um aluno sem disciplinas deve ficar como pendente.

● Ao mostrar os dados do Aluno, o sistema deve mostrar (Fora os demais dados) seu curso
e todas as disciplinas em que o aluno está matriculado.

Professor->
-● Cadastro, Listagem, Edição e Exclusão de professo
● Um professor deve possuir:
○ nome
○ cpf
○ endereço
○ e-mail
○ telefone
○ Categoria
■ Especialista
■ Mestre
■ Doutor
○ Disciplinas
■ Um professor deve estar associado a pelo menos uma disciplina.

Curso->

● Cadastro, Listagem, Edição e Exclusão de curso.
● Um curso deve ter:
○ Nome
○ Código
■ número de 4 dígitos
○ Turno
○ Professor Coordenador
○ Grade
■ A grade é uma lista de disciplinas.


Disciplina->
● Nome
● Código
○ 4 dígitos
● Professor
● Chamada
○ lista de alunos matriculados
● Sala
○ salas são valores entre 100 até 399.
● Carga horária
○ 2h ou 4h por semana.
● Horário
● Custo
○ O custo é e a soma de todos os custos em um mês:
■ Custo com professor, valor da hora aula multiplicado pela carga horária do
professor.
● Especialista 25$/h, mestre 35$/h e doutor 45$/h
■ Custo com infraestrutura, valor de custo de uma sala multiplicado pela carga
horária da disciplina.
● Custo de de uma sala é de 30$/h.
