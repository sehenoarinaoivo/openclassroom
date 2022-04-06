<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php ?>
    <form action="insertPhoto.php">
        <label for=""> Description : </label><br>
        <textarea name="description" type="text"></textarea>
        <label for=""> Email: </label>
        <input type="email" name="email" id="">
        <label for=""> Photo : </label>
        <input type="file" name="photo" id="">
        <input type="button" value="send">
    </form>
</body>
</html>