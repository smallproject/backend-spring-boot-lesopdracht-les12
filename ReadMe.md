# Opdracht:
## "Teacher Service"
- Gebruik deze code als basis
- Randvoorwaarde:
  - Werk in controller __NIET__ met entityclass, maar met dto class
- Breid controller & service uit om:
  - Alle docenten op te halen (GET ‘/teachers’)
- Breid datamodel uit:
  - Voeg _salary_ veld toe (type int) aan Teacher class
    - Valideer dat salaris maximaal 100K is
- Extra:
  - Check in _createTeacher()_ op ‘name duplicates’ en retourneer dan status 409 (Conflict)
    - Gebruik eigen exception class hiervoor