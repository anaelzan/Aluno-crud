document.addEventListener('DOMContentLoanded',() => {
fetch('http://localhost:8080/alunos')
.then(response => response.json())
.then(data =>){
const tbody= document.getElementById ('aluno-tbody');
data.forEach(alunos => {
const tr = document.creatElement ('tr');

tr.innerHTML =
<td>${aluno.nome}</td>
<td>$ {aluno.email}</td>
<td>$ {aluno.telefone}</td>
;
tbody.appendChild(tr);
});
})
.catch(error => { console.error('Erro ao buscar alunos:' , error);
alert ('Erro ao carregar a lista de alunos');
});
});
