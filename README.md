# TP 2 - Application de gestion du personnel

## Ce projet à pour but de réaliser les fonctionnalités et les tests pour une application de gestion de personnel

### Diagramme de classe

```plantuml
@startuml

class Salaire {
  +tauxHoraire
  +payer(double heureTravaillees)
  -calculerSalaire(double heureTravaillees)
}

class Identite {
  +nom
  +prenom
  +adresse: Adresse
}

class Adresse {
  +voie
  +rue
  +cp
  +ville
  +pays
}

class SalarieCdi extends Salarie {
}

abstract class Salarie {
  +salaire: Salaire
  +identite: Identite
  +demenager(adresse: Adresse)
  +travailler(heures = 151)
  +augmenter(double pourcentage)
}

Salarie o-- Identite
Salarie o-- Salaire

Identite o-- Adresse

@enduml
```

### Installation

1. Cloner le répo puis exécuter la commande (git clone url du répo)
2. Ouvrez le projet avec IntelliJ
3. Allez dans Pom.xml puis recharger le projet (Clic droit > Maven > Reload Project)
4. Allez dans le dossier test > java > m2i.valentin.tp2.classes puis choissiez le package que vous voulez tester.
5. Exécuter un test à l'aide de la petite icône à côté des classes ou des méthodes spécifiques.