package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homeList, int slice) {
        List<String> nameList = new ArrayList<>();
        if (!homeList.isEmpty()) {
            List<Home> sortedHome = homeList.stream()
                .sorted(Comparator.comparing(Home::getArea))
                .collect(Collectors.toList());

            for (int i = 0; i < slice; i++) {
                nameList.add(sortedHome.get(i).toString());
        }
    }
        return nameList;
    }
}
// END
