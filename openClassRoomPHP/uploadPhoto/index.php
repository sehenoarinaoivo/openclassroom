<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="http://localhost/openClassRoomPHP/uploadPhoto/signup.php" method="post" enctype="multipart/form-data">

        <label for=""> Description : </label>
        <input name="description" type="text"><br>

        <label for=""> Email: </label>
        <input type="email" name="email" id=""><br>

        <label for=""> Photo : </label>
        <input type="file" name="photo" id=""><br>

        <button type="submit" value="">envoyer</button>

    </form>
</body>
</html>