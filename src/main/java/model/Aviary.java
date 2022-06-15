package model;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal>{
    private Size size;
    private Size getSize(){
        return size;
    }
    public Aviary(Size size){
        this.size=size;
    }

    private Map<String, T> aviaryMap = new HashMap<>();  //Для хранения животных в классе Aviary добавить поле HashMap<>
        // В качестве ключа использовать уникальный идентификатор (имя животного, name),
        // а в качестве значения использовать животное - объект того же типа,
        // который используется в класс Aviary (универсальный параметр)
    public void addAnimal(T animal)  {  // добавить животное в вольер
        if(size.equals(animal.getSize())){
            aviaryMap.put(animal.getName(),animal);}
        else {
            throw new WrongSizeException("WrongFoodException");}
    }

    public T getAnimal(String name){  // получить ссылку на животное в вольере по name,
        // тип возвращаемого значения должен соответствовать универсальному параметру
        // обобщенного класса;
        T animal = aviaryMap.get(name);
        System.out.println(animal);
        return animal;
    }



    public boolean removeAnimal(String name){ //удалить животное из вольера по name,
        // вернуть boolean в зависимости от того было ли указанное животное в вольере;
        if (aviaryMap.containsKey(name)){
            aviaryMap.remove(name);
            return true;
        }else{
            return false;
        }
    }

}
