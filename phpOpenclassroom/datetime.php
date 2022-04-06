<?php
 
// déclaration de référence à l’objet
function foo(DateTime $date) {
    $date->modify('+1 day'); // permet d'ajouter 1 jour à la date
}
 
$date = new DateTimeImmutable;
$dates = new DateTime;
foo ($dates);
echo $date->format("d/m/Y").PHP_EOL."<br>";
$newDate = $date->modify('+1 day');
echo $newDate->format('d/m/Y').PHP_EOL;
 
$formatedDate = $date->modify("+1 day")->format('d/m/Y');
echo "<br>".$formatedDate.PHP_EOL;
// $formatedDate est maintenant au après lendemain

$dateUn = new DateTime;
$datedeux = $dateUn;
$datedeux->modify('+1 day');

//var_dump($dateUn, $datedeux);

$s = <<<JSON
{
    "date":"2021-03-23 07:35:44.011207",
    "timezone_type":3,
    "timezone":"Europe/Paris"
}
JSON;



// $s = ‘
// {
//     "date":"2021-03-23 07:35:44.011207",
//     "timezone_type":3,
//     "timezone":"Europe/Paris"
// }
// ‘;
echo "<br><br>";
var_dump(json_decode($s));
?>