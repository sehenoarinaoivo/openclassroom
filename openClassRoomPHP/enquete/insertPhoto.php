<?php
/*
Script "Questionnaire de satisfaction"
    Par M@teo21
    
Dernière modification : 20 août 2021
*/

// On vérifie d'abord s'il n'y a pas de champ vide

include('config.php');  //connecting DataBase

if ($_POST['description'] == NULL OR $_POST['email'] == NULL)
{
    echo 'Tous les champs ne sont pas remplis !';
}
else // Si c'est bon, on enregistre les informations dans la base
{
    $base->prepare('INSERT INTO enquete VALUES (\'\', ?, ?)');
    $base->execute(array($_POST['description'], $_POST['email']));    
    
    // Puis on envoie les photos
    
    for ($numero = 1 ; $numero <= 3 ; $numero++)
    {
        if ($_FILES['photo' . $numero]['error'] == 0)
        {
            if ($_FILES['photo' . $numero]['size'] < 500000)
            {
                move_uploaded_file($_FILES['photo' . $numero]['tmp_name'], $numero . '.jpg');
            }
            else
            {
                echo 'La photo ' . $numero . 'n\'est pas valide.<br />';
                $probleme = true;
            }
        }
    }
    
    // Enfin, affichage d'un message de confirmation si tout s'est bien passé
    
    if (!(isset($probleme)))
    {
        echo 'Merci ! Les informations ont été correctement enregistrées !';
    }
}
?>