package filemanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HumanFileManager {
    private List<Human> humans = new ArrayList<>();

    public List<Human> getHumans() {
        return humans;
    }

    public void readHumansFromFile(Path path) {
        List<String> humanStringList;
        try {
            humanStringList = Files.readAllLines(path);

            for (String s : humanStringList) {
                String[] stringAr = s.split(";");
                humans.add(new Human(stringAr[0], stringAr[1]));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public void writeMaleHumansToFile(Path path) {
        List<String> result = manList();
        try {
            Files.write(Path.of(path.toString()), result);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private List<String> manList() {
        List<String> result = new ArrayList<>();
        for (Human h : humans) {
            if (h.getIdentityNumber().startsWith("1") || h.getIdentityNumber().startsWith("3")) {
                StringBuilder stringBuilder = new StringBuilder();
                result.add(stringBuilder.append(h.getName()).append(";").append(h.getIdentityNumber()).toString());
            }
        }
        return result;
    }
}