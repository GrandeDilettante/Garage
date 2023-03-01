package com.company;


public class Worker extends Thread {

    @Override
    public void run() {

        int count = 0;

        if (count >= 4) {
            count = 0; // хотел сделать, что если прошёл час, payment + 100 и счётчик обнуляется.
            // по идее и текущее время не понадобится, но не знаю, как здесь получить доступ к payment
            // Надо наверно понимать, какой обьект на вход пришел, чтобы знать кому начислять плату
        } else {       //тоже переделаю цикл, но пока не понимаю как
            while (count < 4) {                  // час
                count++;
                try {                       //можно было бы сделать проверку машина на парковке или нет
                    Thread.sleep(900000);   // 15 мин
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

