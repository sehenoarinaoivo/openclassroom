<?php


    //connecting Data
    include('config.php');

     // Puis on envoie les photos

      // Testons si le fichier a bien été envoyé et s'il n'y a pas d'erreur
      if (isset($_FILES['photo']) AND $_FILES['photo']['error'] == 0) {

            // Testons si le fichier n'est pas trop gros
            if ($_FILES['photo']['size'] <= 1000000) {

                // Testons si l'extension est autorisée
                $infosfichier = pathinfo($_FILES['photo']['name']);
                $extension_upload = $infosfichier['extension'];
                $extensions_autorisees = array('jpg', 'jpeg', 'gif', 'png');

                if (in_array(strtolower($extension_upload), $extensions_autorisees)) {

                    // On peut valider le fichier et le stocker définitivement
                    $pathphoto = 'uploads/PID/' . basename($_FILES['photo']['name']);
                    move_uploaded_file($_FILES['photo']['tmp_name'], $pathphoto);

                    echo "L'envoi a bien été effectué !";
                }
            }
        }



    // if ($_POST['description'] == NULL OR $_POST['email'] == NULL)
    // {
    //     echo 'Tous les champs ne sont pas remplis !';
    // }
    // else // Si c'est bon, on enregistre les informations dans la base
    // {
        $ins = $base->prepare("INSERT INTO `enquete`(`description`, `email`, `photo`) VALUES (:descr, :email, :pathphoto);");
        // INSERT INTO `enquete` (`description`, `email`, `photo`) VALUES ( :descr, :email, :photo);
        $ins->execute(array(
            "descr"=>$_POST['description'],
            "email"=>$_POST['email'],
            "pathphoto"=>$pathphoto,
        ));

    // }


   

var_dump($pathphoto)
?>