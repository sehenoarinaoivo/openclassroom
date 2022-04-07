

Git
Git dia toa hazo anakiray, d manana branche

créer ".gitignore"
*D tapena 
->git status
-> git add .gitignore
->git commit -m "ajouter .gitignore"
->git config --global user.email "mailnao@gmail.com"
->git config --global user.name ''anaranao"
->git commit -m "AnaranaMbaExplicite"

Historique Commit:
->git log

*Manangana Branche
-> git checkout -b AnaranaNleBranche

*Rah hijery Branche Misy anao:
->git branch

*git push command d spécifier-na ny branch Talôhà mba ho lasa anaran' branche vaovao
->git push <remote> -u :<old_branch_name> <new_branch_name> 

*if you'arent on the target branch
->git checkout <branchName>

*rename a branch: going on target branch
->git branch -m "quickfix" 

*Hanadiouh commit:
->git reste HEAD YOUR-FILE

*Manamboatra Fichier
-> touch setup.txt

*Ampidirina anaty git refa avy modifiena
->git add "setup.txt"

*D ampidirina anaty commit refa avy nampidirina anaty git
->git commit -m "Nanao an'Zao zah"

*Jerena ny retouchage natao tao anaty le fichier
->git diff setup.txt

*D manao commit
->git commit -m "Modification nataonlà tao @le Fichier"

*Jerena Historique
->git log

*Rah tsy tadidy anaran'le Brance d
-> git branch

*Handefa an'azy
->git merge AnaranleBranche


*
->git push "remote_name" "brance_name" 



->git remote add origina "your_url_name" 
origin: Nom de la projet
url_name: Lien de la repository cible... 

->git push -u origina main


->git pull 'remote_name' "branch_name"

>ssh-keygen 


Create SSH key on github:

->ssh-keygen -t rsa -b 4096 -C "sehenoarinaivo@gmail.com"

*Afficher le ssh dans le home'... 
->cat ~/.ssh/id_rsa.pub

->ssh-keygen -t ed25519 -C "your_email@gmail.com" 


PROBLËM DE PUSH:
1)->rm -rf .git/
2)->git init
3)->git remote add origin https://repository.remote.url
4)-> git add . 
5)->git commit -m "Commit message" 
6)->git push -f origin master
repository.remote.url