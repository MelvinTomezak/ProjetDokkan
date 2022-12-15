# README du Projet JavKkan

Ce projet est une inspiration du jeu mobile __(Dragon Ball Z: Dokkan Battle)__  
![image_dokkan](https://user-images.githubusercontent.com/92590811/207865398-b30140e5-0314-4bf9-a73d-2d7b70cf9a1b.png)

## Présentation du jeu  
Notre jeu s'appelle __JavKkan__, produit en Java, ce jeu met en pratique l'aventure d'un joueur dans l'univers de Dragon Ball.  
*un manga d'Akira Toriyama racontant le parcours de Son Goku, depuis l'enfance jusqu'à l'âge adulte. [Wikipédia de la page Dragon Ball](https://fr.wikipedia.org/wiki/Dragon_Ball)*

Pour lancer le jeu :  
```
package main;
import JavKkan.Jeu;

public class Main {
    public static void main(String[] args) {
        new Jeu();
    }
}
```

On peut aussi lancer le jeux via le Client en lançant ce dernier et le serveur qui sont en multi thread, une fois cela fait, il faut dans le terminal Client :

* ecrire "lancer" pour lancer le jeu

* ecrire "quit" pour quitter le serveur et le jeu

Au début du jeu vous choisirez un __nom de joueur__ *( mon préferé c'est Xx_Mohammed_xX )*, ensuite ce sera au tour de la __race__,  
vous aurez le choix entre : 
* __Cyborg__
* __Majin__
* __Namek__
* __Saiyan__
* __Terrien__

Une fois la race sélectionnée vous devrez choisir votre __type__ parmi :
* __Agilité__
* __Puissance__
* __Endurance__
* __Intelligence__
* __Technique__

*Chaque type vous donnera des avantages sur une des statistiques dans les combats à venir*

Parlons de vos __statistiques__, il en existe 3 :
* __La vie__ 
* __L'attaque__ 
* __La défense__

*Ces statistiques sont vouées a changer à le fin de chaque combat, elles seront mis à jour automatiquement* 


Vous aurez à affronter de nombreux boss dans ce jeu : 
* __Freezer__ 
* __Cell__
* __Boo__

Comme écrit au-dessus dans ce jeu vous allez affronter différents boss, tous plus redoutables que leurs compères.

Chaque fois que vous tuerez un boss celui-ci reviendra encore plus fort, et ses statistiques augmenteront pour le prochain combat.

Évidemment les vôtres vont augmenter aussi mais contrairement au boss ce sera à vous de choisir parmi les 3 laquelle vous souhaiterez augmenter.  

*C'est un petit bonus que je vous offre : )*

Une fois que le __boss__ aura atteint ses statistiques maximales, vous passerez enfin au suivant !  

Si votre statistique __Vie__ atteint 0, je vous laisse deviner ce qui va se passer ...  

C'est __la fin de l'aventure__ pour vous, votre score va s'afficher.  

Votre __score__ sera calculé de la manière suivante :  

Après qu'un boss est atteint ses statistiques maximales et que vous le battez, je récupère la valeur de votre statistique __Vie__, Ce sera votre score. 

*Plus vous battez de boss plus votre score sera élevé mais nous pouvons voir la chose d'une autre __manière__ !*  

Plus votre __vie__ est élevée à la fin d'une victoire face à un boss plus votre score sera élevé.

*Cela vous fait 2 manières d'obtenir un __score élevé__, laquelle choisirez-vous ?*  

## Diagrammes


__Diagramme cas d'utilisation :__   
<img align="center" src="https://cdn.discordapp.com/attachments/885150703134326865/1053066404280152075/image.png" width="800" height="600"/>   

__Diagramme de classe__  
<img align="center" src="https://cdn.discordapp.com/attachments/885150703134326865/1053081382672412672/image.png" width="1200" height="600"/>  

## Membres

- CANALE Enzo <img align="left" src="https://avatars.githubusercontent.com/u/92590811" alt="profile" width="20" height="20"/>
- KADDOURI Mohammed <img align="left" src="https://avatars.githubusercontent.com/u/98416541" alt="profile" width="20" height="20"/>
- TOMEZAK Melvin <img align="left" src="https://avatars.githubusercontent.com/u/92721333" alt="profile" width="20" height="20"/>




