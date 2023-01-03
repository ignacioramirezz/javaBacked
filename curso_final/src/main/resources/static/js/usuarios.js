// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    const request = await fetch('usuarios', {
      method: 'GET', //ya que es una consulta lo que se hace
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const usuarios = await request.json();
    console.log(usuarios);

    let listadoHTML = '';

    for(let usuario of usuarios){
        let usuarioHTML = '<tr><td>'+usuario.id+'</td><td>'+usuario.nombre+' '+usuario.apellido+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td><a href="#" class="btn btn-danger btclassNamecle btn-sm">\n' +
            '        <i class="fas fa-trash"></iclassName </a></td></tr>';
        listadoHTML += usuarioHTML;
    }



    document.querySelector('#usuarios tbody').outerHTML = listadoHTML;

}
