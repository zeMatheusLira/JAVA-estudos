alert("Bem vindo, a seguir peço que confirme uns dados ");

let name=prompt("Informe o seu nome:");
var age=prompt("Informe sua idade:");
let resultado=confirm("Sua idade é:"+ age);

if ( resultado== false){
 var age=prompt("Informe sua idade: ");
}
else{
  alert(name +age+ " anos");
}
 