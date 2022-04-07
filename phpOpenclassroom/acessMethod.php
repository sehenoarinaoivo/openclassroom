cd /opt/l<?php

declare(strict_types=1);

class User
{
    private const STATUS_ACTIVE = 'active';
    private const STATUS_INACTIVE = 'inactive';

    public function __construct(private string $username, private string $status = self::STATUS_ACTIVE)
    {
    }

    private function setStatus(string $status): void
    {
        assert(
            in_array($status, [self::STATUS_ACTIVE, self::STATUS_INACTIVE]),
            sprintf('Le status %s n\'est pas valide. Les status possibles sont : %s', $status, implode(', ', [self::STATUS_ACTIVE, self::STATUS_INACTIVE]))
        );
    
        $this->status = $status;
    }
    
    private function getStatus(): string
    {
        return $this->status;
    }
}


class Admin extends User
{
    public const STATUS_LOCKED = 'locked';
  
    // la méthode est entièrement ré-écrite ici :) seule la signature reste inchangée
    public function setStatus(string $status): void
    { 
        assert(
            in_array($status, [self::STATUS_ACTIVE, self::STATUS_INACTIVE, self::STATUS_LOCKED]),
            sprintf('Le status %s n\'est pas valide. Les status possibles sont : %s', $status, implode(', ', [self::STATUS_ACTIVE, self::STATUS_INACTIVE, self::STATUS_LOCKED]))
        );
    
        $this->status = $status;
    }
    
    // la méthode utilise celle de la classe parente, et ajoute un comportement :)
    public function getStatus(): string
    {
        return strtoupper(parent::getStatus());
    }
}


$admin = new Admin('Paddington');
$admin->setStatus(Admin::STATUS_LOCKED);
echo $admin->getStatus();