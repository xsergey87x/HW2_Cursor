package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

//    CREATE TABLE `my_db`.`user` (
//        `id` INT NOT NULL AUTO_INCREMENT,
//        `first_name` VARCHAR(45) NULL,
//        `last_name` VARCHAR(45) NULL,
//        `age` INT NULL,
//        `gender` VARCHAR(45) NULL,
//        PRIMARY KEY (`id`));


//    INSERT INTO `my_db`.`user` (`first_name`, `last_name`, `age`, `gender`) VALUES ('John', 'Bednakov', '22', 'mail'),('Pavel', 'Kononov', '24', 'mail'),('Juliana', 'Krakova', '28', 'femail'),
//        ('Anton', 'Seleznov', '16', 'mail'),('Elena', 'Starikova', '17', 'femail'),('Li', 'China', '64', 'mail'),('Raichel', 'Logman', '61', 'femail'),
//        ('Alex', 'Benjamin', '35', 'mail'),('Alexandr', 'Plahotnuk', '46', 'mail'), ('Svetlana', 'Babich', '55', 'femail');


//     use my_db;
//SELECT * FROM user WHERE age < 18;

//    use my_db;
//SELECT * FROM user WHERE age between 18 and 60;

//    use my_db;
//SELECT * FROM user WHERE (firstName LIKE '%a%') AND (gender = 'femail');