<?php
 
declare(strict_types=1);
 
class User
{
    public const STATUS_ACTIVE = 'active';
    public const STATUS_INACTIVE = 'inactive';
 
    public static $nombreUtilisateursInitialisés = 0;

    public function __construct(public string $username, public string $status = self::STATUS_ACTIVE)
    {
    }

    public function setStatus(string $status): void
    {
        if (!in_array($status, [self::STATUS_ACTIVE, self::STATUS_INACTIVE])) {
            trigger_error(sprintf('Le status %s n\'est pas valide. Les status possibles sont : %s', $status, implode(', ', [self::STATUS_ACTIVE, self::STATUS_INACTIVE])), E_USER_ERROR);
        };

        $this->status = $status;
    }

    public function getStatus(): string
    {
        return $this->status;
    }

    public function printStatus()
    {
        // vous pouvez accéder au statut comme si la propriété appartenait à Admin :)
        echo $this->status;
    }
    
}
 
class Admin extends User
{
    public static $nombreAdminInitialisés = 0;
    public const STATUS_LOCKED = 'locked';
    // Ajout d'un tableau de roles pour affiner les droits des administrateurs :)
    public function __construct(public string $username, public array $roles = [], public string $status = self::STATUS_ACTIVE)
    {
    }
 
    // Méthode d'ajout d'un rôle, puis on supprime les doublons avec array_filter.
    public function addRole(string $role): void {
        $this->roles[] = $role;
        $this->roles = array_filter($this->roles);
    }
 
    // Méthode de renvoie des rôles, dans lequel on définit le rôle ADMIN par défaut.
    public function getRoles(): array
    {
        $roles = $this->roles;
        $roles[] = 'ADMIN';
 
        return $roles;
    }

    public function setRoles(array $roles): void
    {
        $this->roles = $roles;
    }

    // mise à jour des valeurs des propriétés statiques de la classe courante avec `self`, et de la classe parente avec `parent`
    public static function nouvelleInitialisation(){
            self::$nombreAdminInitialisés++; // classe Admin
            parent::$nombreUtilisateursInitialisés++; // classe User
    }

    public function printCustomStatus()
    {
        echo "L’administrateur {$this->username} a pour statut : ";
        $this->printStatus(); // on appelle printStatus du parent depuis la classe enfant
    }

      // la méthode est entièrement réécrite ici :) seule la signature reste inchangée
      public function setStatus(string $status): void
      {
          if (!in_array($status, [self::STATUS_ACTIVE, self::STATUS_INACTIVE, self::STATUS_LOCKED])) {
              trigger_error(sprintf('Le status %s n\'est pas valide. Les status possibles sont : %s', $status, implode(', ', [self::STATUS_ACTIVE, self::STATUS_INACTIVE, self::STATUS_LOCKED])), E_USER_ERROR);
          };
  
          $this->status = $status;
      }
  
    
}


$admin = new Admin('Lily');
$admin->printStatus();
echo "<br>";
$admin->printCustomStatus(); // Affiche “L’administrateur Lily a pour statut : active”
echo "<br>";
$admin->printStatus(); // printStatus n’existe pas dans la classe Admin, donc printStatus de la classe User sera appelée grâce à l’héritage
echo "<br>";

Admin::nouvelleInitialisation();
echo "<br>";
var_dump(Admin::$nombreAdminInitialisés, Admin::$nombreUtilisateursInitialisés, User::$nombreUtilisateursInitialisés);

echo "<br>";
$admin = new Admin('Paddington');
echo "<br>";
$admin->setStatus(Admin::STATUS_LOCKED);
echo "<br>";
echo $admin->getStatus();
echo "<br>";
$admin->printCustomStatus(); // Affiche “L’administrateur Lily a pour statut : active”

//var_dump(User::$nombreAdminInitialisés); // ceci ne marche pas.