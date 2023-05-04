
Året är 1350 i Europa och Digerdöden härjar vilt och fritt. Människa har förvandlats till best, adelsmän är lika värda som pöblarna som vandrar på gatan utan hem och kläder.
Nöden har ingen lag och även kungar får känna på Digerdödens kalla hand och förädelse, inte minst Ralabas den Grymme, som har börjat ana oro i slottet sitt. Han har precis fått veta att hans kunder och anställda stjäl ur slottets skafferi, som nu töms allt snabbare och snabbare i dessa dystra tider.
Ralabas den Grymme har gett mig, Johan av den III Romeo, i uppgift att hålla koll på vilka kunder och anställda han har. På så sätt kan han förhöra dem alla och för de som har stulit... Ja, det vågar jag inte yttra mig om.
Jag tog mig an uppgiften och det här blev resultatet . . .


# MongoDB saker att ha:
- En MongoDB med två olika alternativ till inlogg:
  a) En komplicerad String som går till molnet
  b) En lätt String som går till den lokala databasen

- Två Collections:
  a) Customer
  b) Employee

- Maven imports eller .jar-filen

## Klasser för att koppla sig till MongoDB:
- MongoConnector - klass som kan:
  a) Koppla sig till databasen i molnet
  b) Koppla sig till den lokala databasen
  c) Om a inte funkar -> connecta till b
- KeyReader som länkar till platsen där du har din adress till molnet

## Klasser för att hantera objekt som skickas till MongoDB:
- Abstract Person klass som sätter spelregler
- Subclass Customer som ärver samt har egna instansvariabler
- Sublcass Employee som ärver samt har egna instansvariabler

## Klasser för att hantera CRUD operationer:
- Ett eller flera Interface(:es) som bestämmer vad  för CRUD operationer som ska finnas
- En eller flera klass(er) som bestämmer hur  CRUD operationerna ska utföras
- Klass som skapar ett visst Person objekt beroende på val

- Lista över krav på CRUD-operationer på båda objekt:
- Skapa ny Customer/Employee
- Hämta en Customer/Employee med
    -  id
    - namn
    - ålder
    - adress
    - kundnummer (Customer)
    - anställningsnummer (Employee)
- Hämta alla Customers/Employees
- Updaterar en Customer/Employee
- Tar bort en Customer/Employee

## Övriga klasser:
- Application som binder samman allting
- Menu som hanterar användarens menyval
- (Optional) Output som hanterar någon cool story


