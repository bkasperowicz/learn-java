## Zadanie 2 - Rejestracja użytkownika z zapisem/odczytem z bazy danych

Stwórz aplikację konsolową która będzie rejestrowała użytkownika (jak przy zwykłej rejestracji w dowolnym logowaniu).

Aplikacja ma zapytać użytkownika o login, hasło, imie i nazwisko.

**Aplikacja ma zapisać dane użytkownika w bazie danych Microsoft SQL.**

#### Podzadania
1. Stwórz bazę danych o nazwie *LoginDB*
1. W bazie danych stwórz tabelę o nazwie *Users*. Tabela musi zawierać wszystkie pola wpisywane przez użytkownika i unikalny klucz. 

   Przykłady:
   * [Tworzenie tabeli](../src/main/java/com/javaexcercises/examples/sql/create_table.sql)
   * [Wstawianie danych do tabeli](../src/main/java/com/javaexcercises/examples/sql/insert_statement.sql)
   * [Modyfikacja danych na tabeli](../src/main/java/com/javaexcercises/examples/sql/update_statement.sql)
   * [Czytanie wierszy z tabeli](../src/main/java/com/javaexcercises/examples/sql/select_statement.sql)
   * [Usuwanie wierszy z tabeli](../src/main/java/com/javaexcercises/examples/sql/delete_statement.sql)


1. Połącz się ze swoją bazą danych z poziomu kodu Java:
   * Dodaj paczkę *com.microsoft.sqlserver* do skryptu gradle - spytać Bartka
   * Połącz się z bazą danych przy użyciu klasy DriverManager: [przykład](../src/main/java/com/javaexcercises/examples/DBConnectExample.java)
   * Dodaj dane do bazy po wpisaniu przez użytkownika: [przykład](../src/main/java/com/javaexcercises/examples/DBInsertExample.java)
   * Pobierz wszystkie wiersze z tabeli z bazy: [przykład](../src/main/java/com/javaexcercises/examples/DBSelectExample.java)

Gdy Użytkownik wpisze już swoje dane aplikacja ma wypisać dane wszystkich zarejestrowanych użytkowików na konsolę

### Przykład

```
User registration
-----------------
Enter your login:
Karolinka
Enter your password:
Jakie$tamh@slo
Enter your name:
Karolina
Enter your surname:
Pobłocka

Registered users
-----------------
Karolina Pobłocka
Bartlomiej Kasperowicz
Urszula Sęp
Bartłomiej Wawrzyniak
```
### Przydatne linki:
- [Tworzenie bazy danych](db_createdb.md)
- [Pisanie skryptów do operacji na tabelach i danych](sms_scripts.md)
- [Tworzenie tabeli w bazie danych](https://www.youtube.com/watch?v=OKUcgXXrFGU)