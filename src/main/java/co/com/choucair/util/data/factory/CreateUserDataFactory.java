package co.com.choucair.util.data.factory;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class CreateUserDataFactory {
    private static final Faker faker = new Faker();

    public  static List getDataUser(){
        List <String> dataUser = new ArrayList<>();
        dataUser.add(faker.name().firstName());
        dataUser.add(faker.name().lastName());
        dataUser.add(faker.internet().emailAddress());


        return dataUser;


    }
}
