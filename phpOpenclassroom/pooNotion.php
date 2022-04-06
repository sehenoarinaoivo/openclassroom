<?php
//declare(strict_types=1);

class Pont {
    public static int $nombrePietons=0;
    private const UNITE = ' m²';
    private float $longueur;
    private float $largeur;

    public function __construct(private float $pLongueur, private float $pLargeur){
        $this->longueur=$pLongueur;
        $this->unite=$pLargeur;
    }

    public static function validerTaille(float $taille): bool
    {
        if ($taille < 20.0) {
            trigger_error(
                'La longueur est trop courte. (min 50m)',
                E_USER_ERROR
            );
        }
       
        return true;
    }

    public function setLongueur(float $plongueur): void {
       
        self::validerTaille($plongueur);

        $this->longueur=$plongueur;
    }
    
    public function setLargeur(float $plargeur): void {
        if ($plargeur < 0) {
            trigger_error(
                'La longueur est trop courte. (min 1)',
                E_USER_ERROR
            );
        }
        $this->largeur=$plargeur;
    }

    public function getLongueur(): float{
        return $this->longueur;
    }


    public function getSurface(): string {
        return ($this->longueur*$this->largeur).self::UNITE;
    }
    public function printSurface(): void {
        echo $this->getSurface();
    }
    public function nouveauPieton()
   {
       // Mise à jour de la propriété statique.
       self::$nombrePietons++;
   }
 
}
 
 

$pont = new Pont(23.35,5.0);
$pont->nouveauPieton();
//$pont = new Pont(" m²", 23.35, 5);
$pont->setLongueur(23.35);
$pont->setLargeur(5.0);
$surface = $pont->getSurface();


$towerBridge = new Pont( 286.0, 15.0);
$towerBridge->nouveauPieton();
$towerBridge->setLongueur(286.0);
$towerBridge->setLargeur(15.0);

$manhattanBridge = new Pont(2089, 36);
$manhattanBridge->nouveauPieton();
$manhattanBridge->setLongueur(2089.0);
$manhattanBridge->setLargeur(36.6);

$towerBridgeSurface = $towerBridge->getSurface();
$manhattanBridgeSurface = $manhattanBridge->getSurface();

echo '<br>Tower Bridge  ';
$towerBridge->printSurface();
echo '<br>Manathan Bridge  ';
$manhattanBridge->printSurface();
echo '<br>Pont  ';
$pont->printSurface();
echo '<br>';
    var_dump(Pont::validerTaille(150.0));
    echo '<br><br><br>';
    var_dump($pont);
    echo '<br><br><br>';
 echo '<br>'.Pont::$nombrePietons;
?>