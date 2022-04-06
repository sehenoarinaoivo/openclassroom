<?php
/*
configuration Obligatoire: 
Dernier Modification: 20 Aout 2021
Php en OpenClassRoom: Entrainer pour inserer photo...
*/

try{
    $base = new PDO("mysql:host=localhost; dbname=openclassroom","root","");
}
catch(exception $e){
 die("Erreur".$e->getMessage());
}
?>