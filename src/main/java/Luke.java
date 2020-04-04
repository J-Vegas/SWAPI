import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.google.gson.*;

public class Luke {

    static class UserLuke {
        String name;
        String height;
        String mass;
        String hair_color;
        String skin_color;
        String eye_color;
        String birth_year;
        String gender;
        String homeworld;
        List<String> films;
        List<String> species;
        List<String> vehicles;
        List<String> starships;
        String created;
        String edited;
        String url;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + ", height=" + height + ", mass=" + mass + ", hair_color=" + hair_color +
                    ", skin_color=" + skin_color + ", eye_color=" + eye_color + ", birth_year=" + birth_year +
                    ", gender=" + gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species +
                    ", vehicles=" + vehicles + ", starships=" + starships + ", created=" + created +
                    ", edited=" + edited + ", url=" + url + '}';
        }
    }

    public static void main(String[] args) {
        //Создаем эклемпляр Luke
        UserLuke luke = new UserLuke();
        //Создаем экземпляр Gson
        Gson gson = new Gson();
        //Читаем из JSON файла
        try (Reader reader = new FileReader("src\\main\\java\\swapi1.json")) {
            luke = gson.fromJson(reader, UserLuke.class);
            System.out.println(luke);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}