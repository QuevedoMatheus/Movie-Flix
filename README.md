# Movie-Flix
Visão Geral do Sistema MovieFlix

O sistema MovieFlix consiste em um banco de filmes, os quais podem ser listados e avaliados pelos usuários. Usuários podem ser visitantes (VISITOR) e membros (MEMBER). Apenas usuários membros podem inserir avaliações no sistema. 

Ao acessar o sistema, o usuário deve fazer seu login. Apenas usuários logados podem navegar nos filmes. Logo após fazer o login, o usuário vai para a listagem de filmes, que mostra os filmes de forma paginada, ordenados alfabeticamente por título. O usuário pode filtrar os filmes por gênero. 

Ao selecionar um filme da listagem, é mostrada uma página de detalhes, onde é possível ver todas informações do filme, e também suas avaliações. Se o usuário for MEMBER, ele ainda pode registrar uma avaliação nessa tela.

Um usuário possui nome, email e senha, sendo que o email é o seu nome de usuário. Cada filme possui um título, subtítulo, uma imagem, ano de lançamento, sinopse e um gênero. Os usuários membros podem registar avaliações para os filmes. Um mesmo usuário-membro pode deixar mais de uma avaliação para o mesmo filme.

# Modelo Conceitual
![modelo-conceitual](https://drive.google.com/file/d/1s9ElnIOWdMjTbzntggl6lzwdiDSAhwtH/view?usp=drive_link)

# O que devo fazer para completar o desafio 

Basicamente você deverá cumprir três etapas:

Implementar o modelo conceitual proposto com seed do banco de dados.
Incluir a infraestrutura de exceções, validação e segurança ao projeto, 
Implementar o endpoint mostrado abaixo. 

Requisitos do seed para os testes passarem: 
1. Seu seed deve conter dois usuários: 
a. Usuário somente com perfil VISITOR: 
i email: bob@gmaiLcom 
il. senha: 123456 

b. Usuário com perfil MEMBER: 
i. email ana@gmail.com
il. senha: 123456

Endpoint que deverá ser feito:

Obter o perfil do usuário logado
GET/users/profile
